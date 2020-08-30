package hvl.stud;

public class Resultat {

	public static void main(String[] args) {
		int a=3;
		int b=5;
		int c=2020;
		String Resultat="";
		
		if (a < 10){
			Resultat= Resultat+"0";}
		Resultat=Resultat+a+".";
		if(b < 10){
			Resultat=Resultat+"0";}
		Resultat=Resultat+b+".";
		
		Resultat=Resultat+c;
		System.out.println(Resultat);
		
		

	}

}
