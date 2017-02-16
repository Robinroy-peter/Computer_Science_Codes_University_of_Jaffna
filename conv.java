import java.util.*;
public class conv{
	public static String proc(int a,int c){
		String h="";
		String[]s={"A","B","C","D","E","F"};
		while(a/c>=1){
			int temp =a/c;	
			if(a%c>9){
				h +=s[a%c-10];
			}else{
				h += a%c;}
			a=temp;
		}
			if(a%c>9){
				h +=s[a%c-10];
			}else{
				h += a;}
		return h;
	}
	public static void main(String args[]){
		String f ="";
		Scanner input =new Scanner(System.in);
		System.out.println("Input Ur Decimal Number");
		int dec =input.nextInt();
		System.out.println("Input Ur Output Format");
		System.out.println("1 - Binary");
		System.out.println("2 - octal");
		System.out.println("3 - Hexadeciaml");
		System.out.println("Input ur Output Format Number");
		int select =input.nextInt();
		switch (select){
			case 1:
				f=proc(dec,2);
				break;
			case 2:
				f=proc(dec,8);
				break;
			case 3:
				f=proc(dec,16);
				break;
			default :
				System.out.println("Error input");
		}

		for(int g=f.length()-1;g>=0;g--){
			System.out.print(f.charAt(g));
		}
	}
}