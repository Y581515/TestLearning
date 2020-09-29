package hvl.stud;

public class SkrivTegn_side133 {

	public static void main(String[] args) {
		
		skrivTegn("pussy",3);
	}

		
		private static void skrivTegn(String s, int antall) {
			
			for (int i = 1; i <= antall; i++) {
				System.out.print(s+" ");
			}
			System.out.println();
		}


}
