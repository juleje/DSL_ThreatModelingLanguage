package xtext.generator.backend;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import xtext.generator.backend.domain.Boundary;
import xtext.generator.backend.domain.Datastore;
import xtext.generator.backend.domain.Element;
import xtext.generator.backend.domain.Entity;
import xtext.generator.backend.domain.ExternalEntity;
import xtext.generator.backend.domain.Flow;
import xtext.generator.backend.domain.Process;

public class TextualDFD {
	
	public void printPNG() { 		
		 // Ensure the Graphviz executable is available in the PATH
        String dotPath = "dot"; // Assuming Graphviz is in the system PATH

        // Specify the input and output files
        String inputFilePath = "C:\\Users\\jules\\runtime-EclipseApplication\\V1_1Instantie\\src-gen\\dfd.dot";
        String outputFilePath = "C:\\Users\\jules\\runtime-EclipseApplication\\V1_1Instantie\\src-gen\\output.png";

        // Build the command
        ProcessBuilder processBuilder = new ProcessBuilder(dotPath, "-Tpng", inputFilePath, "-o", outputFilePath);

        // Set the working directory (optional)
       // processBuilder.directory(new File(System.getProperty("user.dir")));

        
        try {
            // Start the process
            java.lang.Process process = processBuilder.start();
            
            
            // Capture standard error stream
            InputStream errorStream = process.getErrorStream();
            InputStreamReader isr = new InputStreamReader(errorStream);
            BufferedReader br = new BufferedReader(isr);
            StringBuilder errorOutput = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                errorOutput.append(line).append(System.lineSeparator());
            }

            // Wait for the process to complete
            int exitCode = process.waitFor();

            if (exitCode == 0) {
                System.out.println("PNG file generated successfully: " + outputFilePath);
            } else {
                System.err.println("Error: Graphviz process exited with code " + exitCode);
                System.err.println("Error output: " + errorOutput.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error: IOException occurred while running Graphviz.");
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.err.println("Error: Process was interrupted.");
        }
    }
	
	
	public String printDot(List<Element> elements) {
		for(Element e: elements) {
			if(e.name == null) {
				e.name=e.id;
			}
		}
		
		
		
		String content = "digraph G {\n";
		for(Element e: getElementsWithNoFlow(elements)){
			if(e instanceof ExternalEntity) {
				content+=e.id+" [shape=box, label=\""+e.name+"\"];\n";
			}
			if(e instanceof Datastore) {
				content+=e.id+" [shape=cylinder, label=\""+e.name+"\"];\n";
			}
			if(e instanceof Process) {
				content+=e.id+" [label=\""+e.name+"\"];\n";
			}
		}
		
		for(Element e: elements) {
			if(e instanceof ExternalEntity) {
				content+=e.id+" [shape=box, label=\""+e.name+"\"];\n";
			}
			if(e instanceof Datastore) {
				content+=e.id+" [shape=cylinder, label=\""+e.name+"\"];\n";
			}
			if(e instanceof Process) {
				content+=e.id+" [label=\""+e.name+"\"];\n";
			}
			/*
			if(e instanceof Boundary) {
				 Boundary b = (Boundary)e;
				 content+="subgraph cluster_"+b.id+" {style=filled;color=lightgrey;node [style=filled,color=white]; label =\""+b.name+"\";\n";
					
					for(Entity entity: b.entities) {
						content+=entity.id+";\n";
					}
					content+="}\n";
				 
			}
			*/
			if(e instanceof Flow) {
				Flow f = (Flow) e;
				if(doesFlowCrossBoundary(elements,f)) {
					content+=f.source.id+" -> "+f.destination.id+"[color=\"red\", label=\""+f.name+"\"];\n";
				}else {
					content+=f.source.id+" -> "+f.destination.id+"[label=\""+f.name+"\"];\n";
				}
			}
		}
		
		Map<Boundary, List<Boundary>> nestingMap = checkNestedBoundaries(elements);
		
		
		for(Boundary outer : nestingMap.keySet()) {
			 if (nestingMap.get(outer).isEmpty()) {
				 	content+="subgraph cluster_"+outer.id+" {color=black; label =\""+outer.name+"\";\n";
					for(Entity entity: outer.entities) {
						content+=entity.id+";\n";
					}
					content+="}\n";
					
			 }else {
				 	content+="subgraph cluster_"+outer.id+" {color=black; label =\""+outer.name+"\";\n";
					for(Entity entity: outer.entities) {
						content+=entity.id+";\n";
					}
					for(Boundary inner : nestingMap.get(outer)) {
						content+="subgraph cluster_"+inner.id+" {color=black; label =\""+inner.name+"\";\n";
						for(Entity entity: inner.entities) {
							content+=entity.id+";\n";
						}
						content+="}\n";
					}
					content+="}\n";
			 }
		}
		
		content+="}";
		return content;
	}

	


	private Map<Boundary, List<Boundary>> checkNestedBoundaries(List<Element> elements) {
		 Map<Boundary, List<Boundary>> nestingMap = new HashMap<>();
		 
		 for (Element e : elements) {
			 if(e instanceof Boundary) {
				Boundary b = (Boundary) e;
	        	nestingMap.put(b, new ArrayList<>());
	        	String s = "-";
	        	for(Entity entity: b.entities) {
	        		s+=entity.id+",";
				}
	        }
		 }
		 for (Element eo : elements) {
			 if(eo instanceof Boundary) {
				Boundary outer = (Boundary) eo;
				for (Element ei : elements) {
					 if(ei instanceof Boundary) {
						Boundary inner = (Boundary) ei;
						if (outer.containsAll(inner) && !outer.id.equals(inner.id)) {
							nestingMap.get(outer).add(inner);
						}
					 }
				}
	        }
		 }
		 removeKeysInValueSets(nestingMap);
		return nestingMap;
	}
	public static void removeKeysInValueSets(Map<Boundary, List<Boundary>> nestingMap) {
        Set<Boundary> keysToRemove = new HashSet<>();

        // Iterate over the keys
        for (Boundary key : nestingMap.keySet()) {
            // Check each value list to see if it contains the current key
            for (Map.Entry<Boundary, List<Boundary>> entry : nestingMap.entrySet()) {
                if (!entry.getKey().equals(key) && entry.getValue().contains(key)) {
                    keysToRemove.add(key);
                    break;
                }
            }
        }

        // Remove the marked keys from the map
        for (Boundary key : keysToRemove) {
            nestingMap.remove(key);
        }
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	///////////////////////////////////////////////////////////

	public String printSimpleDFD(List<Element> elements) {
		String content = "";
		for(Element e: elements) {
			content +="\n-"+e.id;
		}
		return content;
	}
	
	public String printTextualDFD(List<Element> elements) {
		for(Element e: elements) {
			if(e.name == null) {
				e.name=e.id;
			}
		}
		
		List<Element> lonelyelements = getElementsWithNoFlow(elements);
		String content = "The elements of the DFD:\n";
		for(Element e: lonelyelements){
			content+="-"+printEntity(e)+"\n";
		}
		for(Element e: elements){
			if(e instanceof Flow) {
				Flow f = (Flow) e;
				if(doesFlowCrossBoundary(elements, f)) {
					content+="-"+printEntity(f.source) + "==" +e.name+"=**Crosses Boundary**==>"+printEntity(f.destination)+"\n";//["+f.description+"]
				}else {
					content+="-"+printEntity(f.source) + "==" +e.name+"===>"+printEntity(f.destination)+"\n";
				}
			}
			if(e instanceof Boundary) {
				Boundary b = (Boundary) e;
				String entities = "";
				for(Entity entity : b.entities) {
					entities+= entity.name+",";
				}
				content+="-Boundary "+e.name+":["+entities+"]\n";
			}
		}
		
		content+="\n\nDescription of the elements:";
		for(Element e: elements) {
			if(e.description != null) {
				content+="\n- "+e.name+": "+e.description;
			}
			if(e.description == null) {
				content+="\n- "+e.name+": no description";
			}
		}
		
		return content;
	}
	
	private String printEntity(Element e) {
		return "("+e.getClass(). getSimpleName()+":"+e.name+")";
		
	}

	private List<Element> getElementsWithNoFlow(List<Element> elements) {
		List<Element> lonelyElements = new ArrayList<>();
		for(Element e: elements) {
			if(e instanceof Entity) {
				boolean isLonely = true;
				for(Element searchFlowElement: elements) {
					if(searchFlowElement instanceof Flow) {
						Flow f = (Flow)searchFlowElement;
						if(e.id.equals(f.source.id) || e.id.equals(f.destination.id)) {
							isLonely=false;
						}
					}
				}
				
				if(isLonely) {
					lonelyElements.add(e);
				}
			}
		}
		return lonelyElements;
	}

	private boolean doesFlowCrossBoundary(List<Element> elements, Flow f) {
		for (Element element : elements) {
            if (element instanceof Boundary) {
                Boundary boundary = (Boundary) element;
                if (boundary.contains(f.source ) && !boundary.contains(f.destination)) {
                    return true; // Flow crosses the boundary
                }
                if(boundary.contains(f.destination) && !boundary.contains(f.source)) {
                	return true;
                }
            }
        }
        return false; // Flow doesn't cross any boundary
	}

}
