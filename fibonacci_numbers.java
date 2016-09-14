import java.util.Scanner;
public class fibo{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Input ur Number");
		int number = input.nextInt();
		int temp =1;
		boolean r = true;
		int fib1 =1;
		int fib2 = 0;
		System.out.println("0");
		while(r){
			temp = fib1+fib2;
			if(temp<=number){
				System.out.println(temp);
			}
			else{
				break;
			}
			fib1 = fib2;
			fib2 = temp;
		}
	}
}
			
			
		
