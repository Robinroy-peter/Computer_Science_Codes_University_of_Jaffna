import java.util.*;
class insertion{
	public static void insertionSort(int[] y,int h){
		int[] input = y;	
		int n =h;
		if(n>0){
			insertionSort(input,n-1);
			int x = input[n];
			int j = n-1;
			while(j>=0 && input[j]> x){
				input[j+1] = input[j];
				j--;
			}
			input[j+1] = x;
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
		insertionSort(q,5);
		long lEndTime = System.nanoTime();
		long output = lEndTime - lStartTime;
		System.out.println("Elapsed time in milliseconds: " + output);
		println(q);
	}
		
		
}