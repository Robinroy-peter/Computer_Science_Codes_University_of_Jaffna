import java.util.*;
public class checking{
	public static void main(String args[]){
		Scanner input =new Scanner(System.in);
		System.out.println("Input Your String");
		String str1 =input.nextLine();
		System.out.println();
		myStack stack_one = new myStack(str1.length());
		myStack stack_two = new myStack(str1.length());
		myStack stack_three = new myStack(str1.length());
		int i =0;
		while(!stack_one.isStackfull()){
			stack_one.Push(str1.charAt(i));
			stack_two.Push(str1.charAt(i));
			i++;
		}
		while(!stack_one.isStackempty()){
			stack_three.Push(stack_one.Pop());
		}
		while(!stack_three.isStackempty()){
			if(stack_two.Pop()==stack_three.Pop()){
				System.out.println("Equal");
			}else{
				System.out.println("Not Equal");
			}

		}		
	}
}