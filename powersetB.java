import java.util.*;
public class powersetB{
    public static void main(String[] args){
        powerset one =new powerset();

        String q[] ={"A","B","C","D","E"};
        int d =2;
		int totalcount =(int)Math.pow(2,d);
        int[] a=new int[d];
		for(int y=0;y<d;y++){
			a[y] =0;
		}
		System.out.println("{ }");
		for(int u=0;u<totalcount;u++){
			a[d-1] +=1;
			for(int j=d-1;j>=0;j--){
				if(a[j]%2==0&&a[j]/2==1){
					a[j]=0;
					if(j>0){
						a[j-1]+=1;
					}
				}else if(a[j]%2==1&&a[j]/2==1){
					a[j]=1;
					if(j>0){
						a[j-1]+=1;
					}
				}else if(a[j]%2==1&&a[j]/2==0){
					a[j]=1;
				}
			}
			for(int s=0;s<d;s++){
				if(a[s]==1){
					System.out.print(q[s]);
				}
			}
			System.out.println();
		}
    }
}