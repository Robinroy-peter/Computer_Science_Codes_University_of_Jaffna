class Linkedlist{
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
		public static void main (String args[]){
			Linkedlist myList = new Linkedlist();
			
			myList.addnodeFirst(1);
			myList.addnodeFirst(2);
			myList.addnodeFirst(3);
			myList.addnodeFirst(4);
			myList.addnodeFirst(5);
			myList.printList();
		}
}
	
