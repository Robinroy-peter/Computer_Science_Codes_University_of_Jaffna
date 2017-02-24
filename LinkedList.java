import java.util.*;
class LinkedList{
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
	public void conecet(int insetVa){
		Node nod =new Node(insetVa);
		Node tempNode1 = Head;
		Node tempNode2 = null;
		while(tempNode1.next != null){
			if((tempNode1.num<=insetVa)&&(tempNode1.next.num>=insetVa)||(tempNode1.num>=insetVa)){
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
	}
	//public char get(){
		//Node tempNod = Head;
		//char elt =tempNod.num;
		//tempNod=tempNod.next;
		//return elt;
	//}

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		LinkedList myList1 = new LinkedList();
		myList1.addnodeLast(1);
		myList1.addnodeLast(2);
		myList1.addnodeLast(5);
		myList1.addnodeLast(7);
		myList1.addnodeLast(9);
		myList1.addnodeLast(12);
		myList1.printList();
		System.out.println("Input ur insert Number");
		System.out.println("------------------------------");
		int insertNumber =input.nextInt();
		System.out.println("------------------------------");
		myList1.conecet(insertNumber);
		myList1.printList();
		//myList2.printList();
	}
}
