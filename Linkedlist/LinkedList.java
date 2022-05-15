package siemens.automation.saas.remoteconnection.api;

public class LinkedList {
	
	private Node first;
	private Node last;
	
	//addFirst
	public void addFirst(int value) {
		Node node = new Node(value);
		if(first==null) {
			first = last = node;
		}
		else {
			node.setNext(first);
			first = node;
		}
	}
	//addlast
	
	public void addLast(int value) {
		Node node = new Node(value);
		
		if(first == null) 
			first = last = node;
		else {
			last.setNext(node);
			last = node;
		}
	}
	//deleteFirst
	
	public void deleteFirst() {
		if (first!=null ) {
			if(first.getNext()!=null)
				first = first.getNext();
			else
				first = last = null;
		}
	}
	
	//deleteLast
	
	public void deleteLast() {
		if(first!=null) {
			Node currentNode = first;
			while(currentNode!=null) {
				
				if(currentNode.getNext().equals(last)) {
					currentNode.setNext(null);
					last = currentNode;
				}
				currentNode = currentNode.getNext();
			}
		}
	}
	
	public void print() {
		if(first!=null) {
			Node currentNode = first;
			while (currentNode!=null) {
				
				System.out.print(currentNode.getValue() +" ");
				currentNode = currentNode.getNext();
			}
		}
		else {
			System.out.println("There are no Nodes");
		}
		
	}
	
	//contains
	//indexOf

}
