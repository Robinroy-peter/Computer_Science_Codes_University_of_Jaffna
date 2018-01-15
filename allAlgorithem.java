import java.util.*;
class allAlgorithem{
	/////////////////selectionSort/////////////////////
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
	
	////////////////insertionSort/////////////////
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
	//////////////////////bubbleSort/////////////////////////
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
	////////////////////////mergesort/////////////////////////
		public static void merge(int[] A,int p,int q,int r){
		int n1 = q-p+1;
		int n2 = r-q;
		int[] L = new int[n1+1];
		int[] R = new int[n2+1];
		
		for(int i=0;i<n1;i++){
			L[i] = A[p+i];
		}
		for(int j=0;j<n1;j++){
			R[j] = A[q+j+1];
		}
		L[n1] = 10000;
		R[n2] = 10000;
		int i=0;
		int j=0;
		for(int k=p;k<=r;k++){
			if(L[i]<=R[j]){
				A[k] = L[i];
				i =i+1;
			}else{
				A[k] = R[j];
				j = j+1;
				
			}
		}
		
	}
	
	public static  void mergesort(int[] A,int p,int r){
		if(p<r){
			int q =(p+r)/2;
			mergesort(A,p,q);
			mergesort(A,q+1,r);
			merge(A,p,q,r);
		}
	}
	
	//////////////////////////////////////////////
	
	public static void println(int[] t){
		int u =t.length;
		for(int i=0;i<u;i++){
			System.out.print(t[i]+" ");
		}
		System.out.println();
	}
	public static void main(String args[]){
		int[] q ={4,7,8};
		System.out.println("Selection Sort :");
		println(q);
		long lStartTime1 = System.nanoTime();
		selectionSort(q);
		long lEndTime1 = System.nanoTime();
		long output1 = lEndTime1 - lStartTime1;
		System.out.println("Elapsed time in milliseconds: " + output1);
		println(q);
		int[] w ={4,7,8};
		System.out.println();
		System.out.println("Selection Sort :");
				println(w);
		long lStartTime2 = System.nanoTime();
		insertionSort(w,2);
		long lEndTime2 = System.nanoTime();
		long output2 = lEndTime2 - lStartTime2;
		System.out.println("Elapsed time in milliseconds: " + output2);
		println(w);
		int [] e ={4,7,8};
		System.out.println();
		System.out.println("Bubble Sort :");
		long lStartTime3 = System.nanoTime();
		bubbleSort(e);
		long lEndTime3 = System.nanoTime();
		long output3 = lEndTime3 - lStartTime3;
		System.out.println("Elapsed time in milliseconds: " + output3);
		println(e);
		int[] s ={4,7,8};
		System.out.println();
		System.out.println("Merge Sort :");
		println(s);
		long lStartTime4 = System.nanoTime();
		mergesort(s,0,1);
		long lEndTime4 = System.nanoTime();
		long output4 = lEndTime4 - lStartTime4;
		System.out.println("Elapsed time in milliseconds: " + output4);
		println(s);
	}



}
