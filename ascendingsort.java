import java.util.*;
public class ascendingsort{
	public static void main(String args[]){
		int size =5;
		int x =0;
		int y =0;
		int temp1 =0;
		int temp2 =0;
		boolean exist_statues1 = true;
		boolean exist_statues2 = true;
		boolean exist_statues3 = true;
		boolean exist_statues4 = true;
		Scanner input = new Scanner(System.in);
		Queue q1 = new Queue(size);
		Queue q2 = new Queue(size);
		Queue ResultQueue = new Queue(2*size);
		int[] q11 =new int[size];
		int[] q22 =new int[size];
		System.out.println("Input Q1");
		for(int e=0;e<size;e++){
			q11[e]=input.nextInt();
		}
		System.out.println("Input Q2");
		for(int e=0;e<size;e++){
			q22[e]=input.nextInt();
		}
		//Bubble sort part
		for(int w=0;w<size;w++){
			for(int r=0;r<size-w-1;r++){
				if(q11[r]>q11[r+1]){
					temp1 =q11[r+1];
					q11[r+1] = q11[r];
					q11[r] =temp1;
				}
				if(q22[r]>q22[r+1]){
					temp2 =q22[r+1];
					q22[r+1] = q22[r];
					q22[r] =temp2;
				}
			}
		}
		for(int d=0;d<size;d++){
			q1.enQueue(q11[d]);
			q2.enQueue(q22[d]);
		}
		x =q1.deQueue();
		y =q2.deQueue();
		
		while(!q1.QueueEmpty() && !q2.QueueEmpty()){
		
			while(x<=y && exist_statues1){
				ResultQueue.enQueue(x);
				if(!q1.QueueEmpty()){
				x =q1.deQueue();}
				else{
				ResultQueue.enQueue(y);
				exist_statues1 =false;
				}
			}
			while(x>y && exist_statues2){
				ResultQueue.enQueue(y);
				if(!q2.QueueEmpty()){
				y =q2.deQueue();}
				else{
				ResultQueue.enQueue(x);
				exist_statues2 =false;
				}
			}
		}
		if(q1.QueueEmpty()){
			while(exist_statues3){
				if(!q2.QueueEmpty()){
				ResultQueue.enQueue(q2.deQueue());}else{exist_statues3 =false;}
			}
		} 
		 if(q2.QueueEmpty()){
			while(exist_statues4){
				if(!q1.QueueEmpty()){
				ResultQueue.enQueue(q1.deQueue());}else{exist_statues4 =false;}
			}
		} 
		if(q1.QueueEmpty() && q2.QueueEmpty() && !ResultQueue.enQueuefull()){
			if(x>y){
				ResultQueue.enQueue(y);
				ResultQueue.enQueue(x);}
			else if(x<y){
				ResultQueue.enQueue(x);
				ResultQueue.enQueue(y);}
		}
		
		
		
		while(!ResultQueue.QueueEmpty()){
			System.out.println(ResultQueue.deQueue());
		}
	}
}
		
