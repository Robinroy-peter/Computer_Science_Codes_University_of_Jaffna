import java.util.*;
public class stack2{
		public static void main(String args[]){
				Scanner input =new Scanner(System.in);
				System.out.println("Input string");
				String ch = input.next();
				char[] mystack = new char[ch.length()];
				char[] mystack2 = new char[ch.length()];

				int top =-1;
				int top1 =-1;
				while(top <ch.length()-1){
					top++;
					mystack[top] =ch.charAt(top);
				}
				while(top >-1){
					top1++;
					System.out.print(mystack[top]);
					mystack2[top1] = mystack[top];
					top--;
				}
				System.out.println();
				while(top1 >-1){
					System.out.print(mystack2[top1]);
					top1--;
				}
		}
}
