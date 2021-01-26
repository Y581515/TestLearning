package hvl.stud;

public class veksling {
	public static void main(String[] args) {
		int pris=100;
		int betalt=545;
		
		if(betalt < pris) {
			System.out.println("Kunden betalt for lite!");
		}else {
			int pengerTilbake=betalt-pris;
			int tikroner=pengerTilbake/10;
			int kroner=pengerTilbake%10;
			System.out.println("Tilbake: "+tikroner+ " tikroner"+
			" og "+kroner+ " kronestykker");
		}
	}
}
