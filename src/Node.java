
public class Node {
	
	private Node previousNode; 
	private Node nextNode;
	private Process data;
	
	public Node(Process data) {
		this.data = data;
		this.previousNode = null;
		this.nextNode = null;
	}
	
	public Node() {
		data = null;
		previousNode = null;
		nextNode = null;
	}
	
	public Node getNext() {
		return nextNode;
	}
	public void setNext(Node next) {
		this.nextNode = next;
	}
	public Node getPreviousNode() {
		return previousNode;
	}

	public void setPreviousNode(Node previousNode) {
		this.previousNode = previousNode;
	}

	public Process getData() {
		return data;
	}
	public void setData(Process data) {
		this.data = data;
	}
	

}
