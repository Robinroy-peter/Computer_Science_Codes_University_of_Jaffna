public class LinkedList{
	private Node Head =null;
	
	public void addNode(int val){
		Node node1 =new Node(val);
		if(Head == null){
			Head =node1;
		}else{
			node1.next =Head;
			Head =node1;
		}
	}
	public void printList(){
		Node tempNode = Head;
		while(tempNode != null){
			System.out.println(tempNode.num);
			tempNode =tempNode.next;
		}
	}
	public static void main(String args[]){
		LinkedList myList =new LinkedList();
		myList.addNode(1);
		myList.addNode(2);
		myList.addNode(3);
		myList.addNode(4);
		myList.addNode(5);
		myList.addNode(6);
		myList.printList();
		
	}
}