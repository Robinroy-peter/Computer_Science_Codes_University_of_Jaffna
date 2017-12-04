public class CreditCard{
	private String customer;
	private String bank;
	private String account;
	private int limit;
	protected double balance;
	
	public CreditCard(String cust, String bak, String acc, int lmt,double bala){
		customer =cust;
		bank = bak;
		account = acc;
		limit = lmt;
		balance = bala;
	}

	public CreditCard(String cust, String bak, String acc, int lmt){
		this(cust,bak,acc,lmt,0.0);
	}
	
	public String getCustomer(){
		return customer;
	}
	public String getBank(){
		return bank;
	}
	public String getAccount(){
		return account;
	}
	public int getLimit(){
		return limit;
	}
	public double getBalance(){
		return balance;
	}
	public void updateLimit(int uplimit){
		limit = uplimit;
	}
	public boolean charge(double price){
		boolean payDone=false;
		if(price+balance <= limit){
			balance += price;
			payDone = true;
		}
		return payDone;
	}
	public double makePayment(double amount){
		balance -= amount;
		return balance;
	}
	/*public static void printSummery(CreditCard card){
		System.out.println("Customer : "+card.customer);
		System.out.println("Bank : "+card.bank);
		System.out.println("Account : "+card.account);
		System.out.println("Limit : "+card.limit);
		System.out.println("Balance : "+card.balance);
		//System.out.println("-----------------------------------");
	}
	*/
	public void printSummery(){
		System.out.println("Customer : "+customer);
		System.out.println("Bank : "+bank);
		System.out.println("Account : "+account);
		System.out.println("Limit : "+limit);
		System.out.println("Balance : "+balance);
		//System.out.println("-----------------------------------");
	} 
	
	public static void main(String[] args){
		CreditCard[] wallet = new CreditCard[3];
		wallet[0] = new CreditCard("Nimal","HNB","5391 0375 9387 5309",5000);
		wallet[1] = new CreditCard("Malar","NSB","3485 0399 3395 1954",3500);
		wallet[2] = new CreditCard("Vijaya","BOC","5391 0375 9387 5309",2500,300);
		
		for(int val=1;val<=16;val++){
			wallet[0].charge(3*val);
			wallet[1].charge(2*val);
			wallet[2].charge(val);
		}
		
		for(CreditCard card: wallet){
			card.printSummery();
			while(card.getBalance()>200.0){
				card.makePayment(200);
				System.out.println("New Balance = "+card.getBalance());
			}
		
		}
	}
}