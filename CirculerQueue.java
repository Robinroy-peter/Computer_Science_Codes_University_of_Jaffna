class CirculerQueue{
	private int maxSize;
	private int front;
	private int rear;
	private int queueArray[];
	
	//constructer
	public  CirculerQueue(int size){
		maxSize = size;
		front =0;
		rear =0;
		queueArray = new int[maxSize];
	}
	//method
	public void enQueue(int input){
		if((rear = maxSize )&&(front !=0)){
			rear =0;}
		queueArray[rear] = input;
		rear++;
	}
	public int deQueue(){
		if((front = maxSize) &&(rear !=0)){
			front =0;}
		int out = queueArray[front];
		front++;
		return out;
	}
	public boolean enQueuefull(){
		return(rear == front-1);
	}
	public boolean deQueueEmpty(){
		return(front == rear);
	}
	public boolean Queueempty(){
		return(front == rear);
	}
} 
