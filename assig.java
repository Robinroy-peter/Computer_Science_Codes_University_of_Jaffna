import java.util.*;
class assig{
	public static int arrayFinalSize =0;

	public static void maxSum(int[] r){
		arrayFinalSize =0;
		int[] input = r;
		int n = input.length;
		int[] arrayStor1 = new int[n];
		int[] arrayStor2 = new int[n];
		int max =0;
		int start =Integer.MIN_VALUE;
		for(int i=0;i<n-2;i++){
			max=0;
			int array =0;
			for(int y=0;y<3;y++){
				max += input[i+y];
				arrayStor1[array] = input[i+y];
					array++;
			}
			if(max>start){
				start = max;
				for(int u=0;u<array;u++){
					arrayStor2[u]=arrayStor1[u];
					arrayFinalSize = array;
				}
			}
		}
		for(int e=0;e<arrayFinalSize;e++){
			System.out.print(arrayStor2[e]+" ");
		}
		System.out.println();
		System.out.println("Max value : "+start);
		
	}
	public static void maxSumAll(int[] r){
		arrayFinalSize =0;
		int[] input = r;
		int n = input.length;
		int[] arrayStor1 = new int[n];
		int[] arrayStor2 = new int[n];
		int max =0;
		int start =Integer.MIN_VALUE;
		for(int i=0;i<n-1;i++){
			max=0;
			for(int y=0;y<n-1;y++){
				max=0;
				int array =0;
				for(int b=i;b<n-1;b++){
					max += input[b];
					arrayStor1[array] = input[b];
					array++;
				}
				if(max>start){
					start = max;
					max=0;
					for(int u=0;u<array;u++){
						arrayStor2[u]=arrayStor1[u];
						arrayFinalSize = array;
					}
				}
			}
		}
		for(int e=0;e<arrayFinalSize;e++){
			System.out.print(arrayStor2[e]+" ");
		}
		System.out.println();
		System.out.println("Max value All : "+start);
		
	}

	public static void maxSumEqual(int[] r,int N){
		arrayFinalSize =0;
		int[] input = r;
		int n = input.length;
		int[] arrayStor1 = new int[n];
		int[] arrayStor2 = new int[n];
		int max =0;
		int start =Integer.MIN_VALUE;
		for(int i=0;i<n-1;i++){
			max=0;
			for(int y=0;y<n-1;y++){
				max=0;
				for(int b=0;b<n-1;b++){
					max = input[b]+input[y]+input[i];
					arrayStor1[0] = input[b];
					arrayStor1[1] = input[y];
					arrayStor1[2] = input[i];

				}
				if(max==N){
					for(int u=0;u<3;u++){
						arrayStor2[u]=arrayStor1[u];
					}
				}
			}
		}
		for(int e=0;e<3;e++){
			System.out.print(arrayStor2[e]+" ");
		}
		System.out.println();
		System.out.println("Max value All : "+N);
		
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
		maxSumAll(q);
		maxSumEqual(q,8);
	}
}
