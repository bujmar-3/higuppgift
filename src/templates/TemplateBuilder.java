package templates;

import helpers.DocPartTypes;


//Builder class
public class TemplateBuilder{
	Template template;
	
	public TemplateBuilder() {
		this.template = new Template();
		//Constructor
	}

	public void buildParagraph() {
		template.addToTemplate(DocPartTypes.PARAGRAPH);
	}
	
	public void buildHeader() {
		template.addToTemplate(DocPartTypes.HEADER);
	}
	
	public void buildList() {
		template.addToTemplate(DocPartTypes.LIST);
	}
	
	public Template build() {
		return this.template;
	}
}
