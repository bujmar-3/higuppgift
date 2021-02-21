package documentParts;

import java.util.ArrayList;
import java.util.List;

import helpers.DocPartTypes;
import helpers.DocTags;

public class Document {
	private List<DocumentComponent> docCompList; //Iterable?
	private String name;
	private int id;
	
	
	public Document(String name) {
		this.docCompList = new ArrayList<>();
		this.name = name;
		this.id = 0;
		return;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void addTypeToDoc(DocPartTypes type) {
		this.addTypeToDoc(type, "generatedName");
		return;
	}
	
	//Factroy method
	public void addTypeToDoc(DocPartTypes type, String name) {
		switch (type) {
		case HEADER:
			DocPart docPart = new DocPart(appendIDToName(name), "this is sample text in header", DocTags.HEADER.getTag(), type);
			this.docCompList.add(docPart);
			break;
		case PARAGRAPH:
			DocPart docPart1 = new DocPart(appendIDToName(name), "this is a sample text in paragraph", DocTags.PARAGRAPH.getTag(), type);
			this.docCompList.add(docPart1);
			break;
		case LIST:
			CompositeDocPart compDocPart = new CompositeDocPart(appendIDToName(name), DocTags.LIST.getTag(), type);
			compDocPart.addDocumentComponent(new DocPart(appendIDToName(name), "this is a sample text in paragraph within list", DocTags.PARAGRAPH.getTag(), type));
			compDocPart.addDocumentComponent(new DocPart(appendIDToName(name), "this is a sample text in paragraph within list", DocTags.PARAGRAPH.getTag(), type));
			this.docCompList.add(compDocPart);
			break;
		default:
			throw new IllegalArgumentException("This doc part type is not supported: " + type);
		}
		return;
	}
	
	private String appendIDToName(String name) {
		String newName = name + String.valueOf(this.id);
		this.id++;
		return newName;
	}
	
	public List<DocumentComponent> getDocumentComponents(){
		return this.docCompList;
	}

}
