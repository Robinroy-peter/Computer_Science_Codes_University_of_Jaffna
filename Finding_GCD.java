import java.util.Scanner;
public class GCD{
	public static void main(String args[]){				
		int temp =0;
		int remin =0;
		boolean r = true;
		Scanner input = new Scanner(System.in);
		System.out.println("Input ur Number");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		if(number1<number2){
			temp =number1;
			number1 =number2;
			number2 =temp;
		}
		do{
			remin =number1%number2;
			number1 = number2;
			number2 =remin;
		}while(remin != 0);
		System.out.println(number1);
	}
}
			
			
		
