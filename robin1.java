import java.util.*;
public class robin1{
		public static void main(String args[]){
				Scanner input =new Scanner(System.in);
				System.out.println("Input string");
				String ch = input.next();
				char[] mystack = new char[ch.length()];
				char[] mystack1 = new char[ch.length()];
				char[] mystack2 = new char[ch.length()];

				int top =-1;
				int top1 =-1;
				int top2 =-1;
				while(top <ch.length()-1){
					top++;
					top2++;
					mystack[top] =ch.charAt(top);
					mystack1[top2] =ch.charAt(top2);
				}
				while(top >-1){
					top1++;
					//System.out.print(mystack[top]);
					mystack2[top1] = mystack[top];
					top--;
				}
				System.out.println();
				while(top1 >-1){
					//System.out.print(mystack2[top1]);
					if(mystack2[top1]==mystack1[top2]){
						System.out.println(mystack2[top1]+" "+mystack1[top2]+" are equal");
					}else{
						System.out.println(mystack2[top1]+" "+mystack1[top2]+" are Not equal");
					}
					top1--;
					top2--;
				}
		}
}