package Temperatur;
import static Temperatur.Temperatur.*;

public class TemperaturKalkulator {

	public static void main(String[] args) {
		double grC=32.0;
		double grF=celsius2Fahrenheit(grC);
		
		System.out.println(grC+" grader celsius = "+grF+" grader fahrenheit");
	}
}
