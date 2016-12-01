import java.util.*;
class queueCheck{
	public static void main(String args[]){
		Scanner input =new Scanner(System.in);
		System.out.println("Input Your Queue Size");
		int size_queue =input.nextInt();
		myQueue Queue_one = new myQueue(size_queue);
		Queue_one.enQueue('a');
		Queue_one.enQueue('u');
		Queue_one.enQueue('n');
		Queue_one.enQueue('t');	
		Queue_one.enQueue('y');	
		while(!Queue_one.deQueuefull()){
			System.out.println(Queue_one.deQueue());
		}
	}
}
