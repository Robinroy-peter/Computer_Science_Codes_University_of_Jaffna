/* Finding  String in String array
Coded by Robinroy_peter  */
import java.util.Scanner;
public class str{
		public static void main (String args []){
			Scanner in=new Scanner (System.in);
			System.out.println("Input your Array size");
			int size = in.nextInt();
			String[] b =new String[size];
			System.out.println("Input your Array String til "+size+" times");
			for(int y=0;y<size;y++){
				String data = in.next();
				b[y] = data;
			}
			System.out.println("Input your Search String ")	;
			String search = in.next();
			for(int u=0;u<size;u++){
				if(search.equals(b[u])){
					System.out.println(search+" is there... Location is :"+u);
				}
			}
		}
} 