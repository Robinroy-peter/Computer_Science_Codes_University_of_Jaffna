import java.util.*;
public class B{
	public static void main(String args[]){
		long startTime = System.currentTimeMillis();
		Scanner input =new Scanner(System.in);
		System.out.println("Input N");
		int N = input.nextInt();
		long sum=0;
		for(int i=1;i<=N;i++){
			for(int j=1;j<=i;j++){
				sum =sum+1;
			}
		}
		System.out.println("Sum is : "+sum);
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Working Time : "+totalTime);		
	}
}