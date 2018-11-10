
public class Queue {
	public Node front;
	public Node rear;
	
	
//	used to perform task on the queue
	
	public Queue(Node front, Node rear) {
		this.front = front;
		this.rear = rear;
	}
	
	public boolean isEmpty() {
		return front == null;
	}
	
	public Node getFront() {
		return front;
	}
	
	public Node getRear() {
		return rear;
	}
	
	public void setFront(Node front) {
		this.front = front;
	}
	
	public void setRear(Node rear) {
		this.rear = rear;
	}
	
	//Enqueue
	public void addTask(Process Data) {
		Node temp = new Node(Data);
		if(temp != null) {
			if(isEmpty()) {
				front = temp;
				rear = temp;
			}
			else {
				rear.setNext(temp);
				temp.setPreviousNode(rear);
				rear = temp;
			}
		}	
			
	}

	//Dequeue
	public void removeTask() {
		Process target;
		if(!isEmpty()) {
			Node temp = front;
			if(front==rear) {
				rear = null;
			}
			temp = front;
			front = front.getNext();
			if(front != null) {
				front.setPreviousNode(null);
			}
			target = temp.getData();
			target = null;
		}
	}
	
public void sortAscendingOrder() {
		
	}
	
//	needs to be place in main class along with calculateInt and sortAscendingOrder
	public Node searchForRecord(Process key) {
		Node temp = new Node();
		temp.setNext(front);
		if(isEmpty()) {
			return null;
		}		
		while(!isEmpty()) {
			if(temp.getData() == key) {
				return temp;
			}
			temp.getNext();
 		}
		return temp;
		
	}
	
	public void calculateInt() {
//		to be implement
	}
	
	

}
