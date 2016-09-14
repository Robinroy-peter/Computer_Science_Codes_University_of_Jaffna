public class bubble{
	public static void main(String args[]){				
		int[] number ={5,3,8,1,9,2};
		int temp =0;
		for(int y=0;y<6;y++){
			for(int r=0;r<5-y;r++){
				if(number[r]>number[r+1]){
					temp =number[r+1];
					number[r+1] = number[r];
					number[r] =temp;
				}
			}
		}
		for(int d=0;d<6;d++){
		System.out.println(number[d]);}
	}
}
			
			
		
