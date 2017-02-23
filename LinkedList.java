class LinkedList{
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
	//public char get(){
		//Node tempNod = Head;
		//char elt =tempNod.num;
		//tempNod=tempNod.next;
		//return elt;
	//}
	static Node tempNode1;
	static Node tempNode2;
	public static void main(String args[]){
			LinkedList myList1 = new LinkedList();
			LinkedList myList2 = new LinkedList();
			String txt ="madam";
			boolean pali = true;
			int lenth =txt.length();
			for(int y=0;y<txt.length();y++){
				myList1.addnodeFirst(txt.charAt(y));
				myList2.addnodeLast(txt.charAt(y));
			}
			tempNode1 = myList1.Head;
			tempNode2 = myList2.Head;
			while(lenth>0){
				if(tempNode1.num != tempNode2.num){
					pali = false;
					break;
				}
				tempNode1=tempNode1.next;
				tempNode2=tempNode2.next;
				lenth--;
			}
			//myList1.printList();
			System.out.println(pali);
			//myList2.printList();
		}
}