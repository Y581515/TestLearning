package hvl.stud;

import static javax.swing.JOptionPane.*;
public class Gsnitt {

	public static void main(String[] args) {
		String melding="Høyde i cm, avslut med 0";
		

		int sum=0;
		int antall=0;
		int hoyde= Integer.parseInt(showInputDialog(melding));
		
		while (hoyde !=0){
			sum+= hoyde;
			antall ++;
			hoyde= Integer.parseInt(showInputDialog(melding));
		}
		
	double Gsnitt= (double)sum/antall;
	showMessageDialog(null,"GJ. snitt: "+Gsnitt);
		

	}

}
