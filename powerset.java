import java.util.*;
public class powerset{
    public static void perm(String a[],int k,int n){
		if(k==n){
			System.out.println("{ }");
			//return "";
		}else{
			perm(a,k+1,n);
			
			for(int u=k+1;u<n;u++){
			System.out.println(a[u-1].concat(perm(a,k+1,n))+",");
			}
			return a[k];
		}
    }

    public static void main(String[] args){
        powerset one =new powerset();
        String a[] ={"A","B","C"};
        one.perm(a,0,3);
    }
}