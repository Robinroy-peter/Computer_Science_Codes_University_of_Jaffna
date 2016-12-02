class myQueue{
	private int maxSize;
	private int front;
	private int rear;
	private char queueArray[];
	
	//constructer
	public  myQueue(int size){
		maxSize = size;
		front =0;
		rear =0;
		queueArray = new char[maxSize];
	}
	//method
	public void enQueue(char input){
		queueArray[rear] = input;
		rear++;
	}
	public char deQueue(){
		char out = queueArray[front];
		front++;
		return out;
	}
	public boolean enQueuefull(){
		return(rear == maxSize);
	}
	public boolean deQueuefull(){
		return(front == maxSize);
	}
	public boolean Queueempty(){
		return(front == rear);
	}
}	

