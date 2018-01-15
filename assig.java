import java.util.*;
class assig{
	public static void maxSum(int[] r){
		int[] input = r;
		int n = input.length;
		int max =0;
		int start =Integer.MIN_VALUE;
		for(int i=0;i<n-2;i++){
			max=0;
			for(int y=0;y<3;y++){
				max += input[i+y];
			}
			if(max>start){
				start = max;
			}
		}
		System.out.println("Max value : "+start);
		
	}
	public static void maxSumAll(int[] r){
		int[] input = r;
		int n = input.length;
		int max =0;
		int start =Integer.MIN_VALUE;
		for(int i=0;i<n-2;i++){
			max=0;
			for(int y=0;y<3;y++){
				max += input[i+y];
			}
			if(max>start){
				start = max;
			}
		}
		System.out.println("Max value : "+start);
		
	}
	public static void println(int[] t){
		int u =t.length;
		for(int i=0;i<u;i++){
			System.out.print(t[i]+" ");
		}
		System.out.println();
	}
	public static void main(String args[]){
		int[] q ={-4, -6, 6, -2, -3, 1, 5, -7};
		maxSum(q);
	}
}