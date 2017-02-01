import java.util.*;
public class powerset{
	int c;
	int z;
    public  void perm(String a[],int k,int n,String b[]){
    	if(k==n-1){
		b[0] =" ";
		b[1] =a[k];
		System.out.println("{ }");
		System.out.println(a[k]);
		c=2;
    	}else {
		perm(a,k+1,n,b);
		z=c;
		for(int y=0;y<z;y++){
			String s =a[k].concat(b[y]);
			b[c] =s;
			System.out.println(s);	
			c++;		
		}
	}
    }
    public static void main(String[] args){
        powerset one =new powerset();

        String a[] ={"A","B","C","D","E"};
        int d =3;
         String[] q=new String[(int)Math.pow(2,d)];
        one.perm(a,0,d,q);

    }
}
