public class X{
	public static void main(String args[]){	
		for(int y=0;y<6;y++){
			for(int r=0;r<y;r++){
				System.out.print(" ");
			}
			System.out.print("*");
			
			for(int r=0;r<2*(4-y)+1;r++){
				System.out.print(" ");
			}
			if(y!=5){
			System.out.print("*");}
			System.out.println();
			System.out.println();
		}
		for(int y=0;y<5;y++){
			for(int r=1;r<5-y;r++){
				System.out.print(" ");
			}
			System.out.print("*");
			
			for(int r=0;r<2*y+1;r++){
				System.out.print(" ");
			}
			System.out.print("*");
			
			System.out.println();
			System.out.println();
		}
	}
}
