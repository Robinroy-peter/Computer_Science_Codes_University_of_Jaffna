import java.util.*;
public class seqRec{
	static int b=0;
	public static int seqRe(int k){
		if(k==0){
			b= 0;
		}else if(k==1){	
			b= 1;
		}else if(k>1){
			b = seqRe(k-1)+seqRe(k-2);
		}
		return b;
	}
	public static void main(String args[]){
		long startTime = System.currentTimeMillis();
		Scanner input =new Scanner(System.in);
		System.out.println("Input N");
		int N = input.nextInt();
		seqRec one =new seqRec();
		for(int g=0;g<N;g++){
			System.out.print(one.seqRe(g)+" ");
		}
		System.out.println();
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Working Time : "+totalTime);		
	}
}