import java.util.*;
class selection{
	public static void selectionSort(int[] y){
		int[] input = y;
		int n = y.length;
		for(int g=0;g<n-1;g++){
			int min =g;
			for(int x=g+1;x<n;x++){
				if(input[x]<input[min]){
					min = x;
				}
			}
			
			if(min != g){
				int temp =input[g];
				input[g] = input[min];
				input[min] = temp;
			}
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
		System.out.println(Selection Sort :);
		println(q);
		long lStartTime = System.nanoTime();
		selectionSort(q);
		long lEndTime = System.nanoTime();
		long output = lEndTime - lStartTime;
		System.out.println("Elapsed time in milliseconds: " + output);
		println(q);

	}
		
		
}