package builders;

import documentParts.Document;
import helpers.DocPartTypes;
import templates.Template;
import templates.TemplateDirector;

//Builder 
public class DocumentCreator {
	DocumentEditor docEditor;
	TemplateDirector templateDirector;
	
	//Constructor
	public DocumentCreator(DocumentEditor docEditor) {
		this.docEditor = docEditor;	
		this.templateDirector = new TemplateDirector();
		return;
	}
	
	public void createDocument(String name) {
		Document doc = new Document(name);
		docEditor.addDocument(doc);
		return;
	}
	
	public void createDocument(String name, String templateType) {
		Document doc = new Document(name);
		Template template = templateDirector.makeTemplate(templateType);
		for(DocPartTypes docTypes : template.getTemplatePartTypes()) {
			doc.addTypeToDoc(docTypes);
		}
		docEditor.addDocument(doc);
		return;
	}

	
}
