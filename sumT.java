import java.util.*;
public class sumT{
	public static void main(String args[]){
		Scanner input =new Scanner(System.in);
		System.out.println("Input N");
		int n =input.nextInt();
		int sum=0;
		for(int y=1;y<n;y++){
			if(n%y==0){
				sum +=y;
			}
		}
		if(sum==n){
			System.out.println(n+" is perfect Number");
		}else{
			System.out.println(n+" is Not perfect Number");
		}
	}
}