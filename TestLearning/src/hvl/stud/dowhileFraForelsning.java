package hvl.stud;
import static javax.swing.JOptionPane.*;

import java.util.Random;

public class dowhileFraForelsning {

	public static void main(String[] args) {
		Random rand=new Random();
		String melding="Resulatat av terningkast :";
		int sum=0;
		int antall=0;
		do {
			int verdi= 1+rand.nextInt(6);
			System.out.print(verdi+"  ");
			sum+=verdi;
			antall++;
		}while (sum < 100);
		
		showMessageDialog(null, "Antall kast: "+ antall);
		System.out.println("\n"+antall);
		System.out.println(sum);
		System.out.println((double)sum/antall);
		
		

	}

}
