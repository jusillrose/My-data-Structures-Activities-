class Node{//Linklist
	int data; //properties of node
	Node next;
	
	//create a constructor
	//function
public Node(int data){
    this.data = data;
    this.next = null;
    
    //private//public-Access modefier
}
}

class Queue{
    private Node front, rear;
    public Queue( ){
        this.front = this.rear = null;
    }
    public void Enqueue(int data){//void means return
    Node newNode = new Node(data);
    if(this.rear == null){
        this.front = this.rear = newNode;
        System.out.println(data + "enqued");
        return;
        
    }
    this.rear.next = newNode;
    this.rear = newNode;
    System.out.println(data + "enqued");
}
    }
    
    public class QueueUsingLinkList{
        public static void main(String[] args){
            
            Queue queue = new Queue();
            //object
            
           queue.Enqueue(10);
           queue.Enqueue(20);
           queue.Enqueue(30);
           queue.Enqueue(40);
            
        
        }
    }
    
    
