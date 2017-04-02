import java.util.*;
class LinkedList2{
	private Node Head =null;
	public void addnodeFirst(int val){
		Node node1 =new Node(val);
		if(Head ==null){
			Head=node1;
		}
		else{
			node1.next =Head;
			Head=node1;
		}
		}
	
	public void addnodeLast(int val){
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
	public void Arrangeconecet(LinkedList2 q){
	Node tempq =q.Head;
	while(tempq !=null){
		Node nod =new Node(tempq.num);
		Node tempNode1 = Head;
		Node tempNode2 = null;
		while(tempNode1.next != null){
			if((tempNode1.num<=tempq.num)&&(tempNode1.next.num>=tempq.num)||(tempNode1.num>=tempq.num)){
					break;
			}
			tempNode1=tempNode1.next;
		}
		if(tempNode1.next==null){
			tempNode1.next = nod;
		}else if(tempNode1 ==Head){
			tempNode2 = Head;
			Head =nod;
			nod.next =tempNode2;
		}else{
			tempNode2 = tempNode1.next;
			tempNode1.next =nod;
			nod.next =tempNode2;
		}
		tempq =tempq.next;
	}	
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
		myList1.addnodeLast(1);
		myList1.addnodeLast(2);
		myList1.addnodeLast(5);
		myList1.addnodeLast(7);
		myList1.addnodeLast(9);
		myList1.addnodeLast(12);
		myList2.addnodeLast(3);
		myList2.addnodeLast(4);
		myList2.addnodeLast(6);
		myList2.addnodeLast(8);
		myList2.addnodeLast(10);
		myList2.addnodeLast(11);
		myList1.printList();
		System.out.println("------------------------------");
		myList2.printList();
		System.out.println("------------------------------");
		myList1.Arrangeconecet(myList2);
		myList1.printList();
		//myList2.printList();
	}
}
