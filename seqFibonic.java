import java.util.*;
public class seq{
	public static void main(String args[]){
		long startTime = System.currentTimeMillis();
		Scanner input =new Scanner(System.in);
		System.out.println("Input N");
		int N = input.nextInt();
		int[] a =new int[N];
		a[0] =0;
		a[1] =1;
		for(int i=2;i<N;i++){
			a[i] =a[i-1]+a[i-2];
		}
		for(int j=0;j<N;j++){
			System.out.print(a[j]+" ");
		}
		System.out.println();
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Working Time : "+totalTime);		
	}
}
