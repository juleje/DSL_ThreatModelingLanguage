/*
 * generated by Xtext 2.33.0
 */
package xtext.generator

import java.util.ArrayList
import java.util.List
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import xtext.threatModelLanguage.Add
import xtext.threatModelLanguage.AddProcess
import xtext.threatModelLanguage.Operations
import xtext.threatModelLanguage.Remove
import xtext.threatModelLanguage.AddDatastore
import xtext.threatModelLanguage.AddFlow
import xtext.threatModelLanguage.AddEntity
import xtext.threatModelLanguage.AddBoundary
import xtext.generator.backend.domain.Element
import xtext.generator.backend.TextualDFD
import xtext.generator.backend.DSLHandler
import xtext.generator.backend.GraphicDFD

/*
import xtext.threatModelLanguage.RemoveProcess
import xtext.threatModelLanguage.RemoveExtern
import xtext.threatModelLanguage.RemoveDatastore
import xtext.threatModelLanguage.RemoveBoundary
 */
/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class ThreatModelLanguageGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		var DSLHandler handler = new DSLHandler();
		var TextualDFD printer = new TextualDFD();
		var GraphicDFD dfd = new GraphicDFD();
		
		var String content = "#######\n"
		content+= "##DFD##\n"
		content+= "#######\n\n"
		var String dot = "";
		try{
			var List<Element> elements = handler.handleDSLFile(resource.allContents.toIterable().filter(Operations));
			content+= printer.printTextualDFD(elements);//printSimpleDFD(elements);
			dot+=printer.printDot(elements);
			//dfd.printGraphicDFD(elements);
			
			
		}catch(Exception ex){
			content+="There was an exception with following message: \n";
			content+=ex.getMessage();
		}
		
		
		fsa.generateFile('demo.txt',content);
		fsa.generateFile('dfd.dot',dot);
	
		printer.printPNG();
			
	}
	
	/*
	}
	def List<Element> handleDSLFile(Resource dslStatements){
		var List<Element> elements = new ArrayList();
		
		for(s: dslStatements.allContents.toIterable().filter(Operations)){
			if (s instanceof Add) {
        		elements.add(handleAdd(s));
    		}
    		if(s instanceof Remove){
    			elements = handleRemove(elements,s);
    		}
		}
		
		return elements;
	}
	
	
	
	def List<Element> handleRemove(List<Element> elements, Remove remove) {
		if(remove instanceof RemoveFlow){
			elements.stream.filter[ e | 
    			e.name == remove.flow.name
			]
			return elements;
    	}
    	/*
		if(remove instanceof RemoveProcess){
			elements.stream.filter[ e | 
    			e.name != remove.process.name
			]
			return elements;
    	}
    	if(remove instanceof RemoveExtern){
			elements.stream.filter[ e | 
    			e.name != remove.extern.name
			]
			return elements;
    	}
    	if(remove instanceof RemoveDatastore){
			elements.stream.filter[ e | 
    			e.name != remove.datastore.name
			]
			return elements;
    	}
    	if(remove instanceof RemoveBoundary){
			elements.stream.filter[ e | 
    			e.name != remove.boundary.name
			]
			return elements;
    	} 
	}
	
	def Element handleAdd(Add add) {
		if(add instanceof AddEntity){
			return handleAddEntity(add)
    	}
    	if(add instanceof AddFlow){
    		var description = add.getDescription().join(" ");
    		var source = handleAddEntity(add.getSource())
    		var destination = handleAddEntity(add.getDestination())
			return new Flow(add.name, description,source,destination)
    	}
    	if(add instanceof AddBoundary){
    		var List<Entity> entities = new ArrayList();
    		for(entity: add.getEntities()){
    			entities.add(handleAddEntity(entity))
    		}
			return new Boundary(add.name, entities)
    	}
	}
	
	def Entity handleAddEntity(Add add){
		if(add instanceof AddProcess){
			return new Process(add.name)
    	}
    	if(add instanceof AddExtern){
			return new ExternEntity(add.name)
    	}
    	if(add instanceof AddDatastore){
			return new Datastore(add.name)
    	}
	}
	 */
	
	
	
}
