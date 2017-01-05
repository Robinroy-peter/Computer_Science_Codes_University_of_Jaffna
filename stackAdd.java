import java.util.*;
public class stackAdd
	public static void main(String args[]){
		int finalsize =0;
		Scanner input = new Scanner(System.in);
		System.out.println("Input Number1 :");
		int numberone =input.nextInt();
		int numberoneSize =Integer.toString(numberone).length();
		System.out.println("Input Number2 :");
		int numbertwo =input.nextInt();
		int numbertwoSize =Integer.toString(numbertwo).length();
		myStack stackone = new myStack(numberoneSize);
		myStack stacktwo = new myStack(numbertwoSize);
		if(numberone>=numbertwo){	finalsize =numberone +1;}
		else{	finalsize =numbertwo +1;}
		myStack stackadd = new myStack(finalsize);
		for(int i=0;i<numberoneSize;i++){
			stackone.Push(Character.getNumericValue(Integer.toString(numberone).charAt(i)));
			}
		for(int i=0;i<numbertwoSize;i++){
			stacktwo.Push(Character.getNumericValue(Integer.toString(numbertwo).charAt(i)));
			}
		int num_one=0;
		int num_two=0;
		int total =0;
		int balance =0;
		while(!stackone.isStackempty()||!stacktwo.isStackempty()){
			if(!stackone.isStackempty()){	num_one = stackone.Pop();}
			else{	num_one=0;}
			if(!stacktwo.isStackempty()){	num_two = stacktwo.Pop();}
			else{	num_two=0;}
			total =num_one + num_two + balance;
			if(Integer.toString(total).length()>1){
				stackadd.Push(Character.getNumericValue(Integer.toString(total).charAt(1)));
				balance = Character.getNumericValue(Integer.toString(total).charAt(0));
			}else{
				stackadd.Push(Character.getNumericValue(Integer.toString(total).charAt(0)));
				balance =0;
			}
			total =0;
		}
		stackadd.Push(balance);
		System.out.println("Addition :");
		while(!stackadd.isStackempty()){
			System.out.print(stackadd.Pop());
		}
		System.out.println();
	}
}
			
				
				
		
