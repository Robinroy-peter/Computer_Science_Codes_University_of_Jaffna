public class PredatoryCreditCard extends CreditCard{
	private double apr;
	private int callCharge;
	public PredatoryCreditCard(String cust, String bak, String acc, int lmt,double bala,double rate){
		super(cust,bak,acc,lmt,bala);
		apr=rate;
		callCharge=0;
	}
	public void processMonth(){
		if(balance > 0){
			double monthlyFactor =Math.pow(1+apr,1.0/12);
			balance *= monthlyFactor;
		}
	}
	
	public boolean charge(double price){
		boolean isSuccess = super.charge(price);
		if(!isSuccess){
			balance += 5;
		}else{
			callCharge += 1;
		}
		if(callCharge >10){
			balance += 1;
		}
		return isSuccess;
	}
	
}