package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class SkrivNavneliste {

	public static void main(String[] args) throws Exception {
		String fil="navn.txt";
		String nyttNavn="Anders";
	
		PrintWriter skriver=new PrintWriter(fil);
		
		String[] navnTab= {"Jo","Jan","June","Jenny"};
		
		for(int i=0; i <navnTab.length;i++) {
			skriver.println(navnTab[i]);
		}skriver.close();
		
//		FileWriter skrivelink=new FileWriter(fil,true);
//		skriver= new PrintWriter(skrivelink);
//		skriver.println(nyttNavn+" Perter");
//		skriver.println("Yosafe");
//		skriver.close();
		
		//legge stor fil i en string
		File file=new File("/Users/yfess/Desktop/captmidn.txt"); 
		Scanner scan = new Scanner(file);
		
		String fileContent="YTYTYT";
		while(scan.hasNextLine()) {
			fileContent=fileContent.concat(scan.nextLine()+"\n");
			
		}scan.close();
		
        //legge til stringer
		FileWriter writer=new FileWriter(fil,true);
		writer.write(nyttNavn+" Pertersen\n");
		writer.write("Yosafe\n");
		writer.write(fileContent);
		writer.close();

	}

}
