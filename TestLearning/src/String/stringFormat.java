package String;

import java.time.LocalDateTime;
import java.util.Locale;

public class stringFormat {

	public static void main(String[] args) {
		
		String firsName="Yosafe";
		String middNAme="Fesaha";
		String lastName="Oqbamecail";
		System.out.println(String.format("my name is %3$s %1$S %2$s %n%1$s is my first name", 
				firsName,middNAme,lastName)+"\n");
		
		System.out.println(String.format("i am %+-,40d years old", 42));
		System.out.println(String.format("i am %+-,40d years old", -1234123));
		System.out.println(String.format("i am %+-,40d years old", 556556));
		System.out.println(String.format(Locale.ITALY,"(ITALY)i am %+-,40d years old", 9342342));
		System.out.println(String.format(Locale.US,"(US)i am %+-,40d years old\n", 9342342));
		
		
		System.out.println(String.format(Locale.ITALY,"(ITALY)i have a magic number %+-,40.3f g",
				94442.123932));
		System.out.println(String.format(Locale.US,"(US)i have a magic number %+-,40.4f g\n",
				24432.678967));
		
		LocalDateTime now=LocalDateTime.now();
		System.out.printf("the current weekday %1$tA year:%1$tY month:%1$tB \n\n",now);
		
		String meToYou="thank";
		String meToYou1="you";
		String meToYou2="so";
		String meToYou3="much";
		
		System.out.println(String.format("%S %S %S %S <3\n", 
				meToYou,meToYou1,meToYou2,meToYou3));
		
		System.out.println(String.format(Locale.US,"  %02d:%02d:%02d",13,5,6));
	
		System.out.println(String.format(Locale.US,"%10.2f",993.4365345));
		
		
		
		
		
		
		
		
//	String s=String.format(Locale.ITALIAN,"%+-,10d:%+-,10d:%+-,10d",1111111,2,3333333);
//		System.out.println(s);
	}

}
