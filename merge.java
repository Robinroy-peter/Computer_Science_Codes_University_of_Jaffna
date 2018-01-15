import java.util.*;
class merge{
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
	public static void printArray(int[] A){
		int n =A.length;
		for(int u=0;u<n;u++){
			System.out.print(A[u]+" ");
		}
		System.out.println();
	}
	public static void main(String args[]){
		int[] A={5,6,4,1,8,9,2,3};
		printArray(A);
		long lStartTime = System.nanoTime();
		mergesort(A,0,7);
		long lEndTime = System.nanoTime();
		long output = lEndTime - lStartTime;
		System.out.println("Elapsed time in milliseconds: " + output);
		printArray(A);
	}
}