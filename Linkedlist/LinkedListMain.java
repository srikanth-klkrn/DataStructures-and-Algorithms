package siemens.automation.saas.remoteconnection.api;

import java.awt.List;

public class LinkedListMain {

	public static void main(String[] args) {
		
		LinkedList linkedList = new LinkedList();
		linkedList.addFirst(5);
		linkedList.addLast(10);
		linkedList.addLast(20);
		linkedList.addLast(30);
		linkedList.addFirst(3);
		linkedList.addFirst(1);
	
		linkedList.print();
		System.out.println();
		linkedList.deleteFirst();
		linkedList.print();
		linkedList.deleteLast();
		System.out.println();
		linkedList.print();
	}
}
