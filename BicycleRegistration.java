class BicycleRegistration{
    
    public static void main(String[] args){
        
        
        Bicycle bike1,bike2;
        String owner1,owner2;
        bike1 = new Bicycle();
        owner1 =bike1.getOwnerName();
        System.out.println(owner1+" owns a bike");
        bike1.setOwnerName("Robin");
        bike2 = new Bicycle();
        bike2.setOwnerName("Roy");
        owner1 =bike1.getOwnerName();
        owner2 =bike2.getOwnerName();
        System.out.println(owner1+" owns a bike");
        System.out.println(owner2+" owns a bike");
        

    }
}