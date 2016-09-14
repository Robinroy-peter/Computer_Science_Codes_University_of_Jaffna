public class arm{
	public static void main(String args[]){				
		int digi1 =0;
		int digi2 =0;
		int digi3 =1;
		int count =100;
		int value =0;
		for(int a3=1;a3<10;a3++){
			for(int a2=0;a2<10;a2++){
				for(int a1=0;a1<10;a1++){
					value = (int)(Math.pow(a3, 3)+Math.pow(a2, 3)+Math.pow(a1, 3));
					if(value == count){
						System.out.println(count);
					}
					count++;
					
				}
				
			}
		}
	}
}