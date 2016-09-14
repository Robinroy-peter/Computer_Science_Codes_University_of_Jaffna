/* Finding Matching char in two array
Coded by Robinroy_peter  */
import java.util.Scanner;
public class us{
		public static void main (String args []){
			int count =0;
			String matching_char ="";
			Scanner in=new Scanner (System.in);
			String string1 = in.nextLine().toUpperCase();
			String string2 = in.nextLine().toUpperCase();
			String[] one = new String[string1.length()];
			String[] two = new String[string2.length()];
			for(int q=0;q<string1.length();q++){
				one[q] =string1.substring(q,q+1);
			}
			for(int e=0;e<string2.length();e++){
				two[e] =string2.substring(e,e+1);
			}
			for(int y=0;y<string1.length();y++){
				for(int s=0;s<string2.length();s++){
					if(one[y].equals(two[s])){
						matching_char += one[y];
						one[y] =".";
						two[s] =".";
						count++;
						break;
					}
				}
			}
			System.out.println(matching_char+"   "+count);
		}
} 