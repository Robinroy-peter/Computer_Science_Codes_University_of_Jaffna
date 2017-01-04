public class insertsort{
	public static void main(String args[]){
		int[] array ={3,2,6,5,8,9};
		int size = array.length;
		int key;
		for(int i=1;i<size;i++){
			key =array[i];
			int j =i-1;
			while(j>=0&&array[j]>key){
				array[j+1] = array[j];
				j--;
			}
			array[j+1] =key;
		}
		for(int u=0;u<array.length;u++){
			System.out.print(" "+array[u]);
		}
	}
}
