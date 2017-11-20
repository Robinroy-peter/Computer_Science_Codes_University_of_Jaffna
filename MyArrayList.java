public class MyArrayList {

    private static final int ArraySize = 15;

    private Integer data[];
    private int avail;    // available position
    private int asize;

    public MyArrayList(){
        this.data = new Integer[ArraySize];
        this.asize = ArraySize;

        this.avail = 0;      // Initially the list is empty
    }

    public void insert(Integer obj){
        
        if(this.avail > this.asize-1){
            throw new Exception("List is filled!");
        }
		
		data[this.avail] = obj;
		this.avail++;
    }

    public void insertAt(Integer obj, int i){
		for(int r=this.avail;r>i;r--){
			data[r]=data[r-1];
		}
		data[i] = obj;
		this.avail++;
    }

    
    public void printList() {
        for(int y=0;y<this.avail;y++){
			System.out.println(data[y]+",");
		}
    }
	
    public void printElement(int i) {
        System.out.println(data[i]);
    }

    public void remove(int i) throws Exception{
        if(i>this.avail-1){
            throw new Exception("Invalid Array Index");
        }
        if(i<0){
            throw new Exception("Negative Index");
        }
        System.out.println("Data getting removed:" + this.data[i]);
        
		for(int r=i;r<this.avail;r--){
			data[r]=data[r-1];
		}
		data[i] = obj;
		this.avail++;
    }


    public void removeLast(){
        
        // Complete the code here to remove the last element
    }

    public static void main(String[] args) throws Exception {
        MyArrayList mylist = new MyArrayList();
        mylist.insert(21);
        mylist.insert(42);
        mylist.insert(25);
        mylist.insert(69);
        mylist.insert(53);
        mylist.insert(48);

        mylist.printElement(2);

        mylist.remove(2);  

        mylist.insertAt(94,4);		
		
        mylist.removeLast();

        mylist.printList();
    }
}
