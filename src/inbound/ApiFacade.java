package inbound;

import builders.DocumentCreator;
import builders.DocumentEditor;
import helpers.DocPartTypes;


//Facade
public class ApiFacade {
	DocumentCreator docBuilder;
	DocumentEditor docEditor;
	
	
	//Constructor
	public ApiFacade() {
		this.docEditor = new DocumentEditor();
		this.docBuilder = new DocumentCreator(docEditor);
	}
	
	public void createDoc(String name) {
		docBuilder.createDocument(name);
	}
	
	public void createDoc(String name, String templateType) {
		docBuilder.createDocument(name, templateType);
	}
	
	public void editDoc(String docName, String docCompName, String text) {
		docEditor.editText(docName, docCompName, text);
	}
	
	public void addDocPart(String docName, String partName, DocPartTypes type) {
		docEditor.addDocPart(docName, partName, type);
	}
	
	public void printDoc(String docName) {
		//Printing can be done in other class 
		System.out.println();
		System.out.println("--------PRINTING_" + docName +  "--------");
		String docText = docEditor.getDocText(docName);
		System.out.println(docText);
		System.out.println("----------------");
	}
	
	public void listTemplates() {
		System.out.print("mall1");
	}
}
