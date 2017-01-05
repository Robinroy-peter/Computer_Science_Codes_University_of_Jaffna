public class myStack{
	private int maxSize;
	private int stackArray[];
	private int top;
	
	public myStack(int size){
		maxSize =size;
		stackArray = new int[maxSize];
		top =-1;
	}
	//push operation
	public void Push(int myChar){
		top++;
		stackArray[top] =myChar;
	}
	//pop operation
	public int Pop(){
		int myChar = stackArray[top];
		top--;
		return myChar;
	}
	public boolean isStackfull(){
		return (top == maxSize-1);
	}
	public boolean isStackempty(){
		return (top == -1);
	}
	public int peek(){
		return (stackArray[top]);
	}
	public int currentSize(){
		int Csize =top +1;
		return (Csize);
	}
}
