import java.util.*; 


public class sort{
	public static void main(String arg[]){
		int inf = 100000;
		int[] sortlist = new int[10];
		int[] arraylist ={68,84,95,47,23,98,8,74,13,39};
		System.out.print("arraylist ");
		for(int u=0;u<10;u++){
			System.out.print(arraylist[u]+",");
		}
		System.out.println();
		for(int i=0;i<10;i++){
			int min_value = inf;
			int min_index =0;
			for(int j=0;j<10;j++){
				if(arraylist[j]<min_value){
					min_value = arraylist[j];
					min_index = j;
				}
			}
			sortlist[i] = min_value;
			arraylist[min_index] = inf;
		}
		System.out.print("sortlist ");
		for(int u=0;u<10;u++){
			System.out.print(sortlist[u]+",");
		}

	}
}