/* Finding Matching integer in two array
Coded by Robinroy_peter  */
import java.util.Scanner;
public class us1{
		public static void main (String args []){
			int[] b ={1,23,45,67,21,34,56,56};
			Scanner in=new Scanner (System.in);
			int search = in.nextInt();
			for(int y=0;y<b.length;y++){
				if(search== b[y]){
					System.out.println("Found ...Locataion is "+y);
					break;
				}
			}		
		}
} 