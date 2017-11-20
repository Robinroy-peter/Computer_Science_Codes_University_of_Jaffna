class Bicycle{
	private String ownerName;
	private String tagNo;
	// Data Member
	//Constructor: Initialzes the data member
	public Bicycle( ) { 
		ownerName = "Unknown";
		tagNo = "Unknown";
	}
	//Returns the name of this bicycle's owner
	public String getOwnerName(){
		return ownerName;
	}
	//Assigns the name of this bicycle's owner
	public void setOwnerName(String name) {
		ownerName= name;
	}
	//Returns the TagNo of this bicycle
	public String getTagNo(){
		return tagNo;
	}
	//Assigns the TagNo of this bicycle
	public void setTagNo(String tagnu) {
		tagNo= tagnu;
	}
}