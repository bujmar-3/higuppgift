package documentParts;

import helpers.DocPartTypes;

public interface DocumentComponentInterface {
	public String getText();
	public void setText(String text);
	public String getName();
	public DocPartTypes getType();
}
