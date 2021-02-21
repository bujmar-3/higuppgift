package inbound;

import helpers.DocPartTypes;

public class run {

	public static void main(String[] args) {
		ApiFacade apiFac = new ApiFacade();
		apiFac.createDoc("testDoc");
		apiFac.addDocPart("testDoc", "myHeader", DocPartTypes.HEADER);
		apiFac.addDocPart("testDoc", "nextHeader", DocPartTypes.HEADER);
		apiFac.printDoc("testDoc");
		
		//Now lets edit nextHeader
		apiFac.editDoc("testDoc", "myHeader0", "This was not here before, haha!"); //Name is appended by id! 
		apiFac.printDoc("testDoc");
		
		//Now lets create a new doc with header and paragraph
		apiFac.createDoc("newDoc");
		apiFac.addDocPart("newDoc", "newHeader", DocPartTypes.HEADER);
		apiFac.addDocPart("newDoc", "newParagraph", DocPartTypes.PARAGRAPH);
		apiFac.printDoc("newDoc");
		
		//Lets make one that is composite
		apiFac.createDoc("compositeDoc");
		apiFac.addDocPart("compositeDoc", "list", DocPartTypes.LIST);
		apiFac.printDoc("compositeDoc");
		
		//Lets make one of a "template"
		apiFac.createDoc("templateDoc", "threeHeads");
		apiFac.printDoc("templateDoc");
		
	}

}
