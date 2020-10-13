package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReader300 {

	public static void main(String[] args) throws IOException {
		
		File file=new File("/Users/yfess/Desktop/captmidn.txt"); 
		Scanner scan = new Scanner(file);
	
		String fileContent="";
		while(scan.hasNextLine()) {
			fileContent=fileContent.concat(scan.nextLine()+"\n");
			
		}
		
		FileWriter writer = new FileWriter("/Users/yfess/Desktop/captmidn2.txt");
		writer.write(fileContent);
		writer.close();
	}

}
