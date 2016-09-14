public class pat{
	public static void main (String args []){
		for(int y=0;y<4;y++){
			for(int r=0;r<4-y;r++){
				System.out.print("  ");
			}
			System.out.print("*");
			
			for(int r=0;r<4*y;r++){
				System.out.print(" ");
			}
			if(y>0){
			System.out.print("*");}
			System.out.println();
			System.out.println();
		}
		for(int y=0;y<5;y++){
			for(int r=0;r<y;r++){
				System.out.print("  ");
			}
			System.out.print("*");
			for(int r=0;r<4*(4-y);r++){
				System.out.print(" ");
			}
			if(y!=4){
			System.out.print("*");}
			System.out.println();
			System.out.println();
		
		}
	}
}