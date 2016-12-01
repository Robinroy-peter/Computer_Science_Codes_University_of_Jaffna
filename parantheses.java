import java.util.*;
public class question_1{
	public static void main(String args[]){
		String str ="({{[(]}})";
		boolean balnced = true;
		myStack stack_one = new myStack(str.length());
		for(int i=0;i<str.length();i++){
			char myChar =str.charAt(i);
			if(myChar ==')'){
				if(stack_one.Pop() !='('){
					balnced = false;
				}			
			}else if(myChar =='}'){
				if(stack_one.Pop() !='{'){
					balnced = false;
				}
			}else if(myChar ==']'){
				if(stack_one.Pop() !='['){
					balnced = false;
				}	
			}else{stack_one.Push(myChar);
				}
		}
		System.out.println(balnced);
	}
}
