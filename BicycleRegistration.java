class BicycleRegistration{
	public static void main(String[] args) {
		Bicycle bike1, bike2;
		String owner1, owner2;
		bike1 =  new Bicycle();   
		//Create and assign values to bike1
		bike1.setOwnerName ("Adam Smith");
		bike1.setTagNo ("2004-134R");
		bike2 =  new Bicycle();   
		//Create and assign values to bike2
		bike2.setOwnerName ("Ben Jones");
		//Output the information
		owner1 = bike1.getOwnerName();
		String tag =bike1.getTagNo();
		owner2 = bike2.getOwnerName() ;
		System.out.println(owner1 + " owns a bicycle." );
		System.out.println(owner2 + " also owns a bicycle." );
		System.out.println(tag + " is the tag Number of the bike1 bicycle." );

	}
}