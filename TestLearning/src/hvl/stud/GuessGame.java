package hvl.stud;
import static javax.swing.JOptionPane.*;

public class GuessGame {

	public static void main(String[] args) {
		
		int secretNum, guess;
		boolean correct=false;
		
		secretNum = Integer.parseInt(showInputDialog("Enter secret Number"));
		
		while (!correct){
			guess=Integer.parseInt(showInputDialog("Guess the number"));
			
			if(guess==secretNum){
				correct=true;
				showMessageDialog(null,"You are right");
			}
			else if (guess < secretNum){
				showMessageDialog(null,"HIGHER");
			}
			else if (guess > secretNum){
				showMessageDialog(null,"Lower");
			}
		}
	}
}
