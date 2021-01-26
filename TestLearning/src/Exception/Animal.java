package Exception;

public class Animal {

	String name;
	int age;

	public Animal(String name,int age) throws AgeAnimalException {
		if (age < 0) {
			throw new AgeAnimalException("An animal can't have negative age: "+age);
		}else {
			this.name = name;
			this.age=age;
			System.out.println("you created a dog");
		}
		
	}
}
