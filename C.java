import java.util.*;
public class C{
	public static void main(String args[]){
		long startTime = System.currentTimeMillis();
		Scanner input =new Scanner(System.in);
		System.out.println("Input N");
		int N = input.nextInt();
		long sum=N*(N+1)/2;
		
		System.out.println("Sum is : "+sum);	
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Working Time : "+totalTime);		
	}
}