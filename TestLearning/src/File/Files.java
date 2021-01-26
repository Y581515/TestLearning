package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Files {

	public static void main(String[] args) {
		String fil = "navn.txt";
		
		PrintWriter skriver = null;
		FileWriter writer = null;

		try {

			skriver = new PrintWriter(fil);

			String[] navnTab = { "Jo", "Jan", "June", "Jooonny" };

			for (int i = 0; i < navnTab.length; i++) {
				skriver.println(navnTab[i]);
			}

			// skriver.close();

//		FileWriter skrivelink=new FileWriter(fil,true);
//		skriver= new PrintWriter(skrivelink);
//		skriver.println(nyttNavn+" Perter");
//		skriver.println("Yosafe");

//		skriver.close();

			// legge stor fil i en string
			File file = new File("/Users/yfess/Desktop/captmidn.txt");
			Scanner scan = new Scanner(file);

			String fileContent = "YTYTYT";
			while (scan.hasNextLine()) {
				fileContent = fileContent.concat(scan.nextLine() + "\n");

			}
			scan.close();

			// legge til stringer
			writer = new FileWriter(fil, true);
			writer.write("Anders" + " Pertersen\n");
			writer.write("Yosae\n");

			writer.write("Larsen\n");
			writer.write("Cat\n");
			writer.write("Hund\n");
			writer.write(fileContent);
			writer.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("file not found");
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("something wrong in FileWriter prosses");
		}
		finally  {
			if(skriver !=null) {
				skriver.close();
				
			}
			
		}

	}

}
