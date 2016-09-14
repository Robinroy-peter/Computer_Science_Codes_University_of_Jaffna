import java.util.Scanner;
public class muvas{
	public static void main(String args[]){
		System.out.println("Enter two strings containing only alphabets");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		String str1 = in.next();
		String str2 = in.next();
		int l;
		String a = "";
		String b = "";
		int n = 0;

		
		if(str1.length()<str2.length()){
			l = str1.length();
			a = str1;
			b = str2;
			
		}
		else {
			l = str2.length();
			a = str2;
			b = str1;
		}
		
		for(int i=0; i<l; i++){
			if(b.indexOf(a.charAt(i))>=0){
				n++;
				b.replace(b.charAt(b.indexOf(a.charAt(i))),' ');				
			}
		}
		
		System.out.println(n);
	
		
	}	
}