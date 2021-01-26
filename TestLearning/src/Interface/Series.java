package Interface;

public interface Series {
	int MAX=10;
	String ERRORMSG="can not have value: "+MAX;
	
	int getNext();
	
	
	default void printStuff() {
		System.out.println("Live From New York");
		printMoreStuff();
	}
	
	private void printMoreStuff() {
		System.out.println("more STUFF");
	}
	
	
}
