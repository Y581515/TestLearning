package Exception;

public class Main {
	public static void main(String[] args) {
		
		Animal dog = null;
		
		try {
			dog = new Animal("Ralph",3);
		}
		catch(AgeAnimalException e) {
			System.out.println(e.getMessage());
			
		}
		
		
		
	}

}
