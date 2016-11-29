public class myStack{
	private int maxSize;
	private char stackArray[];
	private int top;
	
	public myStack(int size){
		maxSize =size;
		stackArray = new char[maxSize];
		top =-1;
	}
	//push operation
	public void Push(char myChar){
		top++;
		stackArray[top] =myChar;
	}
	//pop operation
	public char Pop(){
		char myChar = stackArray[top];
		top--;
		return myChar;
	}
	public boolean isStackfull(){
		return (top == maxSize-1);
	}
	public boolean isStackempty(){
		return (top == -1);
	}
	public char peek(){
		return (stackArray[top]);
	}
}