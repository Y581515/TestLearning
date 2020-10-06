package hvl.stud;

public class lab7Oppgave1Test {

	public static void main(String[] args) {
		String a= (tilString (3));
		System.out.println(a);
		
		System.out.println(100*0.2);
	}
	public static String tilString(int a) {
		String k="";
		for (int j=0;j<a;j++) {
			for (int i=0;i<a;i++) {
				k+="* ";		
			}k+="\n";
		}
		return k;
	}

}
