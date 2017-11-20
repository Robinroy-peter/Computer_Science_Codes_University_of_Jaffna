class Account{
	private String ownerName;
	private double balance;
	// Data Member
	//Constructor: Initialzes the data member
	public Account() { 
		ownerName = "Unknown";
		balance = 0;
	}
	//Assigns the name of this bicycle's owner
	public void add(double deposit) {
		balance += deposit;
	}
	public void deduct(double withdraw) {
		balance -= withdraw;
	}
	public void setInitialBalance(double InitialBalance) {
		balance = InitialBalance;
	}
	public double getCurrentBalance() {
		return balance;
	}
	public String getOwnerName(){
		return ownerName;
	}
	public void setOwnerName(String name) {
		ownerName= name;
	}
}