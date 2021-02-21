package documentParts;
import java.util.ArrayList;
import java.util.List;

import helpers.DocPartTypes;

//Composite of other DocumentComponents
public class CompositeDocPart extends DocumentComponent implements DocumentComponentInterface{
	List<DocumentComponent> docCompLis;
	
	public CompositeDocPart(String name, String tag, DocPartTypes type) {
		this.name = name;
		this.type = type;
		this.tag = tag;
		this.docCompLis = new ArrayList<DocumentComponent>();
	}
	
	public void addDocumentComponent(DocumentComponent docComp) {
		this.docCompLis.add(docComp);
	}
	
	public void removeDocumentComponent(String docCompName) {
		for(DocumentComponent docComp : this.docCompLis) {
			if(docComp.getName() == docCompName) {
				this.docCompLis.remove(docComp);
				return;
			}
		}
		return;
	}
	
	public String getText() {
		StringBuilder strBuilder = new StringBuilder();
		for(DocumentComponent docComp : this.docCompLis) {
				strBuilder.append(docComp.getText());
			}
		String endTag = tag.substring(0, 1) + "/" + tag.substring(1, tag.length());
		return tag.substring(0, tag.length() - 1) + " id:" + this.name + tag.substring(tag.length() - 1, tag.length()) + strBuilder.toString() + endTag;
	}

	@Override
	public void setText(String text) {
		for(DocumentComponent docComp : this.docCompLis) {
			docComp.setText(text);
		}	
	}
}
