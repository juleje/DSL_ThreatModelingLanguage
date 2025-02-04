package xtext.generator.backend;

import java.util.List;
import guru.nidi.graphviz.attribute.*;
import guru.nidi.graphviz.engine.*;
import guru.nidi.graphviz.model.*;
import static guru.nidi.graphviz.model.Factory.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


import xtext.generator.backend.domain.Element;
import xtext.generator.backend.domain.Entity;
import xtext.generator.backend.domain.Flow;

public class GraphicDFD {

	public void printGraphicDFD(List<Element> elements) {
		for(Element e: elements) {
			if(e.name == null) {
				e.name=e.id;
			}
		}
		
		
		//MutableGraph g = mutGraph("DataFlowDiagram").setDirected(true);
		Graph g = Factory.graph("DataFlowDiagram").directed();
                
		System.out.println("test");
		
		for (Element element : elements) {
			if(element instanceof Entity) {
				System.out.println(element.name);
				//g.add(mutNode(element.name));
				g.with(Factory.node(element.name));
			}
        }
		
		for (Element element : elements) {
			if(element instanceof Flow) {
				Flow f = (Flow) element;
				System.out.println(element.name);
				//g.add(mutNode(f.source.name).addLink(mutNode(f.destination.name)));
				g.with(Factory.node(f.source.name)).link(Factory.node(f.destination.name));
			}
        }

		
		File f = new File("C:\\Users\\jules\\runtime-EclipseApplication\\V1_1Instantie\\src-gen\\data_flow_diagram.png");
    	System.out.println(f.getAbsolutePath());
		
		
        try {
            //Graphviz.fromGraph(g).width(800).render(Format.PNG).toFile(new File("data_flow_diagram.png"));
        	//Graphviz.fromGraph(g).engine(Engine.DOT).width(800).render(Format.PNG).toFile(new File("data_flow_diagram.png"));
        	
        	
        	//Graphviz.useEngine(new GraphvizCmdLineEngine());
        	Graphviz.fromGraph(g).engine(Engine.DOT).height(100).render(Format.PNG).toFile(f);

            System.out.println("Data Flow Diagram generated successfully.");
        } catch (IOException e) {
            System.out.println("Error generating Data Flow Diagram: " + e.getMessage());
        }
        
      
		
	}
}
