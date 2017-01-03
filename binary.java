import java.util.*;
public class binary{
	public static void main(String args[]){
		int[] array ={6,3,2,5,4,1,7,8,9,10};
		int n =array.length;
		int elt =10;
		int start =0;
		int end =n-1;
		int mid =0;
		int result =-1;
		boolean found =false;
		for(int i=0;i<n;i++){
			for(int y=0;y<n-i-1;y++){
				if(array[y]>=array[y+1]){
					int temp =array[y+1];
					array[y+1] =array[y];
					array[y]=temp;
				}
			}
		}
		while(start<=end &&array[mid]!=elt){
			mid =(start + end)/2;
			if(array[mid]<=elt){
				start = mid+1;
				result =mid;
			}else{
				end =mid-1;
			}
			if(array[mid]==elt){
				found =true;
			}
		}
		if(found){
		System.out.println(result+1);}
		else{
			System.out.println("-1");
		}

	}
		
	
}