package Interface;

public class ByTwos implements Series{

	int val;
	
	public ByTwos() {
		val =0;
		
	}

	@Override
	public int getNext() {
		if(val >= MAX) {
			System.out.println(ERRORMSG);
		}else {
			val +=2;
			return val;
		}
		return val;
	}
	
	
	public int getPrev() {
		val-=2;
		return val;
	}
	
//	@Override
//	public void printStuff() {
//		System.out.println("I am ByTwo class.");
//	}
	
}
