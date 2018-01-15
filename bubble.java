import java.util.*;
class bubble{
	public static void bubbleSort(int[] y){
		int[] input = y;	
		int n =input.length;
		while(n>0){
			boolean swap =false;
			for(int i=0;i<n-1;i++){
				if(input[i]>input[i+1]){
					int temp = input[i];
					input[i] =input[i+1];
					input[i+1] = temp;
					swap =true;
				}
			}
			n=n-1;
		}

	}
	public static void println(int[] t){
		int u =t.length;
		for(int i=0;i<u;i++){
			System.out.print(t[i]+" ");
		}
		System.out.println();
	}
	public static void main(String args[]){
		int[] q ={4,7,8,3,4,9};
		println(q);
		long lStartTime = System.nanoTime();
		bubbleSort(q);
		long lEndTime = System.nanoTime();
		long output = lEndTime - lStartTime;
		System.out.println("Elapsed time in milliseconds: " + output);
		println(q);
	}
		
		
}