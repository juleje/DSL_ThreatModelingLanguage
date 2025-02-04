package xtext.generator.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import xtext.generator.backend.domain.Element;
import xtext.generator.backend.domain.Entity;
import xtext.generator.backend.exceptions.DuplicatedIdException;
import xtext.threatModelLanguage.Add;
import xtext.threatModelLanguage.Modify;
import xtext.threatModelLanguage.Operations;
import xtext.threatModelLanguage.Remove;

public class DSLHandler {
	private Validator validator = new Validator();
	private AddHandler addHandler = new AddHandler();
	private RemoveHandler removeHandler = new RemoveHandler();
	private ModifyHandler modifyHandler = new ModifyHandler();
	
	public List<Element> handleDSLFile(Iterable<Operations> dslStatements) throws Exception{
		List<Element> elements = new ArrayList<>();

		for(Operations s: dslStatements){
			if (s instanceof Add) {
				Add add = (Add) s;
				validator.checkDuplicatedIDs(elements, add.getName());
        		elements.add(addHandler.handleAdd(elements,add));
    		}
    		if(s instanceof Remove){
    			Remove remove = (Remove) s;
    			elements = removeHandler.handleRemove(elements,remove);
    		}
    		if(s instanceof Modify) {
    			Modify modify = (Modify) s;
    			elements = modifyHandler.handleModify(elements, modify);
    		}
		}
		
		return elements;
	}
	
	public static Element getElementById(List<Element> elements, String id) {
		for(Element e: elements) {
			if(e.id.equals(id)) {
				return e;
			}
		}
		throw new NoSuchElementException("There is no element to with id: "+id);
	}

	

}
