package documentParts;

import helpers.DocPartTypes;

public abstract class DocumentComponent implements DocumentComponentInterface {
	protected String name;
	protected String tag;
	protected String text;
	protected DocPartTypes type;
	
	public String getName() {
		return name;
	}

	public DocPartTypes getType() {
		return type;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setType(DocPartTypes type) {
		this.type = type;
	}
	
	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}
	
	public String getText() {
		return this.text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
}
