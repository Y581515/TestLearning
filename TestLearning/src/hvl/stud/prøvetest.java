package hvl.stud;

public class prøvetest {

	public static void main(String[] args) {
		int tall = 7540;
		int antall=0;

		do {
			tall = tall / 10;
			antall++;
		} while (tall != 0);

		System.out.println(antall);

	}

}
