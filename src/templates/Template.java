package templates;

import java.util.ArrayList;
import java.util.List;

import helpers.DocPartTypes;

public class Template {
	List<DocPartTypes> typeList;
	
	public Template() {
		this.typeList = new ArrayList<>();
	}
	
	public void addToTemplate(DocPartTypes type) {
		this.typeList.add(type);
	}
	
	public List<DocPartTypes> getTemplatePartTypes() {
		return this.typeList;
	}
	
}
