package siemens.automation.saas.remoteconnection.api;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Array numbers = new Array(3);
		numbers.insert(10);
		numbers.insert(20);
		numbers.insert(30);
		numbers.insert(40);
		numbers.insert(50);
		numbers.insert(60);
		numbers.insert(70);
		
		
		numbers.printOf();
		numbers.removeAt(3);
		numbers.printOf();
		
		numbers.insert(70);
		numbers.printOf();
		
		numbers.removeAt(3);
		numbers.printOf();
		
		//numbers.removeAt(3);
		
		//System.out.println(numbers.indexOf(2));
	}
}
