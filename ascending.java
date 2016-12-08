import java.util.*;
public class ascending{
	public static void main(String args[]){
		Scanner input =new Scanner(System.in);
		int x=0;
		int y=0;
		int size =5;
		myQueue q1 =new myQueue(size);
		myQueue q2 =new myQueue(size);
		System.out.println("Input Q1");
		for(int i=0;i<size;i++){
			q1.enQueue(input.nextInt());
 			}
		System.out.println("Input Q2");
		for(int i=0;i<size;i++){
			q2.enQueue(input.nextInt());
			} 
		myQueue ResultQueue =new myQueue(2*size);
		x=q1.deQueue();
		y=q2.deQueue();
		while(!ResultQueue.enQueuefull()){
			while(x<=y && !q1.Queueempty() && !q2.Queueempty() ){
				ResultQueue.enQueue(x);
				if(!q1.Queueempty()){
				x=q1.deQueue();}
				}
				ResultQueue.enQueue(y);
				if(!q2.Queueempty()){
				y=q2.deQueue();}
				if(q1.Queueempty()){
					while(!q2.Queueempty()){
						ResultQueue.enQueue(q2.deQueue());
						break;
						}				
				} 
				if(q2.Queueempty()){
					while(!q1.Queueempty()){
						ResultQueue.enQueue(q1.deQueue());
						break;
						}
				}
		}
		while(!ResultQueue.Queueempty()){
			System.out.println(ResultQueue.deQueue());
			}
	}
}
	