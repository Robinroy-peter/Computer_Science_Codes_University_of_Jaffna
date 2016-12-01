import java.util.*;
public class question_6{
	public static void main(String args[]){
		Scanner input =new Scanner(System.in);
		System.out.println("Give a Size of ur Stack");
		int size =input.nextInt();
		Stack new_stack = new Stack(size);
		boolean exit = false;
		while(!exit){
		System.out.println("=============================================");
		System.out.println("Select Ur Command Number");
		
		System.out.println(" 1. Push");
		System.out.println(" 2. Pop");
		System.out.println(" 3. Peek");
		System.out.println(" 4. Current Stack Size");
		System.out.println(" 5. Exit");		
		System.out.println();
		System.out.println("Give a Number of ur Command");
		int command =input.nextInt();
		switch(command){
			case 1 :
				if(!new_stack.isStackfull()){
					System.out.println("Input Your String To Push");
					String Input_string =input.next();
					new_stack.Push(Input_string);
					System.out.println("You pushed "+Input_string);}
				else{
					System.out.println("Your Stack Is Full Not Enough Space To Push!!!");
				}
				break;
			case 2 :
				if(!new_stack.isStackempty()){
					System.out.println("Poped Data is :"+new_stack.Pop());}
				else{
					System.out.println("Your Stack Is Empty Nothing To Pop !!!");
				}
				break;
			case 3 :
				System.out.println("Peek of Stack :"+new_stack.peek());
				break;
			case 4 :
				System.out.println("currentSize of Stack :"+new_stack.currentSize());
				break;	
			case 5 :
				System.out.println("Thank-you Going to Exit");
				exit = true;
				break;
			default :
				System.out.println("Wrong Command!! Try Again");
				}
		}	
	}
}
