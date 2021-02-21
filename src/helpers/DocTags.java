package helpers;

public enum DocTags {
	HEADER("<Header>"),
	PARAGRAPH("<p>"),
	LIST("<li>");
	
	
    public String tag;

    private DocTags(String tag) {
        this.tag = tag;
    }
    
    public String getTag() {
        return tag;
    }
	
}
