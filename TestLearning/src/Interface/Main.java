package Interface;

public class Main {
	public static void main(String[] args) {
		
		ByTwos byTwos = new ByTwos ();
		ByThrees byThrees = new ByThrees ();
		
		Series ob = null;
		for (int i=0;i < 6;  i++ ) {
			ob=byTwos;
			System.out.println("ByTwos "+ob.getNext());
			
			ob=byThrees;
			System.out.println("byThrees "+ob.getNext());	
		}
		
		byTwos.printStuff();
		
		
		
	}

}
