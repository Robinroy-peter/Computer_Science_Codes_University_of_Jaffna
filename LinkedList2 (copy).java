import java.util.*;
class LinkedList2{
	private Node Head =null;
	public void addnodeFirst(char val){
		Node node1 =new Node(val);
		if(Head ==null){
			Head=node1;
		}
		else{
			node1.next =Head;
			Head=node1;
		}
		}
	
	public void addnodeLast(char val){
		Node node2=new Node(val);
		if(Head ==null){
			Head= node2;
		}
		else{
			Node temp =Head;
			while(temp.next!=null){
				temp =temp.next;
			}
			temp.next= node2;
		}
	}
	public void printList(){
			Node tempNode = Head;
			while(tempNode !=null)
			{
				System.out.println(tempNode.num);
				tempNode=tempNode.next;
			}
		}
	public void reve(LinkedList2 q){
	Node tempq =q.Head;
	while(tempq !=null){
		addnodeFirst(tempq.num);
		tempq =tempq.next;	
		}
	}
	public boolean palincheck(LinkedList2 w){
		boolean palindrome =true;
		Node node1 =Head;
		Node node2 =w.Head;
		while(node1 !=null){	
		if(node1.num != node2.num){
			palindrome = false;
		}
		node1 =node1.next;
		node2 =node2.next;
		}
	 return palindrome;
	}
	//public char get(){
		//Node tempNod = Head;
		//char elt =tempNod.num;
		//tempNod=tempNod.next;
		//return elt;
	//}

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		LinkedList2 myList1 = new LinkedList2();
		LinkedList2 myList2 = new LinkedList2();
		myList1.addnodeLast('m');
		myList1.addnodeLast('a');
		myList1.addnodeLast('d');
		myList1.addnodeLast('a');
		myList1.addnodeLast('m');
		
		myList1.printList();
		System.out.println("------------------------------");
		//myList2.printList();
		System.out.println("------------------------------");
		myList2.reve(myList1);
		System.out.println(myList1.palincheck(myList2));
		myList2.printList();
	}
}
