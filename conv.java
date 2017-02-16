import java.util.*;
public class conv{
	public static String bina(int a){
		String h="";
		while(a/2>=1){
			int temp =a/2;
			h +=a%2;
			a=temp;
		}
		h +=a;
		return h;
	}
	public static String oct(int a){
		String h="";
		while(a/8>=1){
			int temp =a/8;
			h +=a%8;
			a=temp;
		}
		h +=a;
		return h;
	}
	public static String hex(int a){
		String h="";
		String[]s={"A","B","C","D","E","F"};
		while(a/16>=1){
			int temp =a/16;	
			if(a%16>9){
				h +=s[a%16-10];
			}else{
				h += a%16;}
			a=temp;
		}
			if(a%16>9){
				h +=s[a%16-10];
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
				f=bina(dec);
				break;
			case 2:
				f=oct(dec);
				break;
			case 3:
				f=hex(dec);
				break;
			default :
				System.out.println("Error input");
		}

		for(int g=f.length()-1;g>=0;g--){
			System.out.print(f.charAt(g));
		}
	}
}