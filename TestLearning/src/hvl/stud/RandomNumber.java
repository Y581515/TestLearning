package hvl.stud;
import java.util.*;
import static javax.swing.JOptionPane.*;

public class RandomNumber {

	public static void main(String[] args) {
		int answer, Guess;
		final int MAX=5;
		
		String TallTxt=showInputDialog("Guess a number");
		Random rand = new Random();
		
		answer=rand.nextInt(MAX)+1;
		Guess=Integer.parseInt(TallTxt);
		
		if(Guess==answer){
			showMessageDialog(null,"Good job, the number was "+ answer);
		}else {
			showMessageDialog(null,"sorry, but the number was "+ answer);
		}	
	}
}
