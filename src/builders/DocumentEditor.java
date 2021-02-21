package builders;
import java.util.ArrayList;
import java.util.List;

import documentParts.Document;
import documentParts.DocumentComponent;
import helpers.DocPartTypes;

public class DocumentEditor {
	List<Document> docList;
	
	//Iterable?
	public DocumentEditor() {
		this.docList = new ArrayList<>();
	}
	
	public void addDocument(Document doc) {
		this.docList.add(doc);
		System.out.println("Doc got added with name: " + doc.getName());
	}
	
	public void editText(String docName, String docComnpName, String text) {
		boolean foundDoc = false;
		boolean foundDocCompName = false;
		for(Document doc : this.docList) {
			if(doc.getName() == docName) {
				foundDoc = true;
				List<DocumentComponent> docCompList = doc.getDocumentComponents();
				for(DocumentComponent docComp : docCompList) {
					if(docComp.getName().equalsIgnoreCase(docComnpName)){
						foundDocCompName = true;
						docComp.setText(text);
						return;
					}
				}
			}
		}
		if(!foundDoc) {
			System.out.println("Could not find document with name " + docName);
		}
		else if(!foundDocCompName) {
			System.out.println("Could not find doc component with name " + docComnpName);
		}
	}
	
	public void addDocPart(String docName, String partName, DocPartTypes type) {
		for(Document doc : this.docList) {
			if(doc.getName() == docName) {
				doc.addTypeToDoc(type, partName);
			}
		}
	}
	
	public void removeDocument(String docName) {
		for(Document doc : this.docList) {
			if(doc.getName() == docName) {
				this.docList.remove(doc);
				break;
			}
		}
	}
	
	public String getDocText(String name) {
		StringBuilder strBuilder = new StringBuilder();
		for(Document doc : this.docList) {
			if(name == doc.getName()) {
				List<DocumentComponent> docCompList = doc.getDocumentComponents();
				for(DocumentComponent docComp : docCompList) {
					strBuilder.append(docComp.getText());
				}
			}
		}
		return strBuilder.toString();
	}
}
