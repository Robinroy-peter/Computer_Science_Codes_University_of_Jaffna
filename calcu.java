import java.util.*;
public class calcu{
	public static void main(String args[]){
		String str ="(1((23+)(12+)+)+)";
		myStack stack_one = new myStack(str.length());
		for(int i=0;i<str.length();i++){
			char myChar =str.charAt(i);
			if(myChar =='('){				
			}else {
				if(myChar ==')'){
					char optr =stack_one.Pop();
					int op_1 =Character.getNumericValue(stack_one.Pop());
					int op_2 =Character.getNumericValue(stack_one.Pop());
					if(optr == '+'){
						stack_one.Push(Integer.toString(op_1+op_2).charAt(0));
					}else if(optr == '-'){
						stack_one.Push(Integer.toString(op_1-op_2).charAt(0));
					}else if(optr == '*'){
						stack_one.Push(Integer.toString(op_1*op_2).charAt(0));
					}else if(optr == '/'){
						stack_one.Push(Integer.toString(op_1/op_2).charAt(0));
					}
				}else if(myChar =='1'||myChar =='2'||myChar =='3'||myChar =='4'||myChar =='5'||myChar =='6'||myChar =='7'||myChar =='8'||myChar =='9'||myChar =='0'||myChar =='+'||myChar =='*'||myChar =='-'||myChar =='/'){
					stack_one.Push(myChar);
				}
			}
		}
		System.out.println(stack_one.Pop());
	}
}