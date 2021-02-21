package templates;

public class TemplateDirector {
	TemplateBuilder tempBuilder;
	
	public TemplateDirector() {
		tempBuilder = new TemplateBuilder();
	}

	public Template makeTemplate(String templateType){
		switch (templateType) {
		case "threeHeads": {
			tempBuilder.buildHeader();
			tempBuilder.buildHeader();
			tempBuilder.buildHeader();
			return tempBuilder.build();
		}
		default:
			throw new IllegalArgumentException("Cannot find template with name: " + templateType);
		}
		
		
	}
}
