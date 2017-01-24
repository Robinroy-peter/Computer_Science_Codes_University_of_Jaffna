import java.util.*;
public class permit{
    public static void perm(String a[],int k,int n){
        if(k==n){
            System.out.println("-------------------");
            for(int y=0;y<n;y++){
                System.out.print(a[y]+" ");
            }
            System.out.println("-------------------");
        }else{
            for(int i=k;i<n;i++){
                System.out.println("i ="+k+" ");
                String t =a[k];
                System.out.println("t ="+a[k]+" ");
                a[k] =a[i];
                System.out.println("a["+k+"]="+a[i]+" ");
                a[i]=t;
                System.out.println("a["+i+"]="+t+" ");
                System.out.println();
                perm(a,k+1,n);
                System.out.println("-------------------");
                t =a[k];
                System.out.println("t ="+a[k]+" ");
                a[k] =a[i];
                System.out.println("a["+k+"]="+a[i]+" ");
                a[i]=t;
                System.out.println("a["+i+"]="+t+" ");
                System.out.println("-------------------");
            }
        }
    }
    public static void main(String[] args){
        permit one =new permit();
        String a[] ={"A","B","C"};
        one.perm(a,0,3);
    }
}