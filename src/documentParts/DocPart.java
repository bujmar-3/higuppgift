package documentParts;

import helpers.DocPartTypes;

public class DocPart extends DocumentComponent implements DocumentComponentInterface {
	
	private String text;
	
	public DocPart(String name, String text, String tag, DocPartTypes type) {
		this.setName(name);
		this.setType(type);
		this.setTag(tag);
		this.setText(text);
	}

	@Override
	public String getText() {
		String endTag = tag.substring(0, 1) + "/" + tag.substring(1, tag.length());
		return tag.substring(0, tag.length() - 1) + " id:" + this.name + tag.substring(tag.length() - 1, tag.length()) + this.text + endTag;
	}

	@Override
	public void setText(String text) {
		this.text = text;
	}
	
	
	



}
