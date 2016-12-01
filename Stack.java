public class Stack{
	private int maxSize;
	private String stackArray[];
	private int top;
	
	public Stack(int size){
		maxSize =size;
		stackArray = new String[maxSize];
		top =-1;
	}
	//push operation
	public void Push(String myChar){
		top++;
		stackArray[top] =myChar;
	}
	//pop operation
	public String Pop(){
		String myChar = stackArray[top];
		top--;
		return myChar;
	}
	public boolean isStackfull(){
		return (top == maxSize-1);
	}
	public boolean isStackempty(){
		return (top == -1);
	}
	public String peek(){
		return (stackArray[top]);
	}
	public int currentSize(){
		int Csize =top +1;
		return (Csize);
	}
}
