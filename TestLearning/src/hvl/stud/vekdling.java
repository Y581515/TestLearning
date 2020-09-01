package hvl.stud;

public class vekdling {
	public static void main(String[] args) {
		int pris=83;
		int betalt=100;
		
		int pengerTilbake=betalt-pris;
		int tikroner=pengerTilbake/10;
		int kroner=pengerTilbake%10;
		System.out.println("Tilbake: "+tikroner+ " tikroner"+
		" og "+kroner+ " kronestykker");
	}
}
