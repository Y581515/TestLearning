package hvl.stud;
import static javax.swing.JOptionPane.*;

public class dowhileFraForelsning {

	public static void main(String[] args) {
		String melding="Resulatat av terningkast :";
		int sum=0;
		int antall=0;
		do {
			int verdi= Integer.parseInt(showInputDialog(melding));
			sum+=verdi;
			antall++;
		}while (sum < 100);
		
		showMessageDialog(null, "Antall kast: "+ antall);
		System.out.println(sum);
		System.out.println((double)sum/antall);
		
		

	}

}
