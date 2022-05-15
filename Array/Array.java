package siemens.automation.saas.remoteconnection.api;

public class Array {

	private int[] myArray;
	private int currentIndex=0;
	public Array(int size) {
		this.myArray = new int[size];
	}
	public void insert(int item) {
		
		if(this.currentIndex+1>this.myArray.length) {
			reCreateArray(this.currentIndex+1);
		}
		this.myArray[currentIndex] = item;
		this.currentIndex++;
		
	}
	public void removeAt(int index) {
		this.myArray[index] = 0;
		for(int i=index;i<this.myArray.length;i++) {
			this.myArray[index] = this.myArray[index+1];
		}
		///this.currentIndex--;
		this.myArray[this.currentIndex]=0;
	}

	
	public void printOf() {
		System.out.println("==================");
		for (int i=0;i<this.myArray.length;i++) {
			System.out.println(this.myArray[i]);
		}
	}
	
	public int indexOf(int item) {
		for(int i=0;i<this.myArray.length;i++) {
			if(this.myArray[i]==item) {
				return i;
			}
		}
		return -1;
	}
	
	private void reCreateArray(int size) {
		int[] tempArray = new int[size];
		for(int i=0;i<this.myArray.length;i++) {
			tempArray[i]=this.myArray[i];
		}
		this.myArray = null;
		this.myArray = tempArray; 
		
	}
}
