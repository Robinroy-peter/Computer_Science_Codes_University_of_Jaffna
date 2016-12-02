import java.util.*;
public class qucheck{
	public static void main(String args[]){
		int i =0;
		boolean palidrom = true;
		String input ="madam";
		Stack mystack1 =new Stack(input.length());
		myQueue myqueue1 = new myQueue(input.length());
		while(!mystack1.isStackfull()){
			mystack1.Push(input.charAt(i));
			myqueue1.enQueue(input.charAt(i));
			i++;
		}
		while(!mystack1.isStackempty()){
			if(mystack1.Pop()!=myqueue1.deQueue()){
				palidrom = false;
			}
		}
		System.out.println(input +" is palidrom ? "+palidrom);
	}
}