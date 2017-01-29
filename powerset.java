import java.util.*;
public class powerset{
    public static void perm(String a[],int k,int n){
    	if(k==n+1){
    		System.out.println();
    	}else {
	    	if(k==0){
	    		System.out.print("{ }");
	    		System.out.print(",");
	    	}else if( k==1){
	    		for(int d=0;d<n;d++){
	    			System.out.print(a[d]);
	    			System.out.print(",");
	    		}
	    	}else if( k==n){
	    		for(int d=0;d<n;d++){
	    			System.out.print(a[d]);
	    		}
	    		System.out.print(",");
	    	}else{
			for(int i=0;i<=n-k;i++){
				//for(int y=0;y<((n-i+1)/(k-1));y++){
				for(int y=0;y<n-i-1;y++){
					System.out.print(a[i]);
					for(int j=i+1 ;j<i+k;j++){
						if((j+y>=n)&&(k>2)){
							System.out.print(a[j+y-n]);
						}else if(j+y<n){
							System.out.print(a[j+y]);						
						}
					}
					System.out.print(",");
				}
			}
		}
		perm(a,k+1,n);
	}
    }
    public static void main(String[] args){
        powerset one =new powerset();
        String a[] ={"A","B","C","D","E"};
        one.perm(a,0,5);
    }
}
