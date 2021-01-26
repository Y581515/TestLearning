package GenericsTuterial;

public class Bucky17 {
	
	public static void main(String[] args) {
		Integer [] iRay= {1,2,3,4};
		Character [] cRay= {'a', 'b','c','d'};
		
		printMe(iRay);
		printMe(cRay);
		
		System.out.println(max(iRay[0],iRay[1],iRay[2]));
		
		

	}

	public static <T> void printMe(T[] x) {
		for(T i : x) {
			System.out.print(i+" ");
		}System.out.println();
	}
	
	public static <T extends Comparable<T>> T max(T a,T b,T c) {
		T m=a;
		if(b.compareTo(a)>0) {
			m=b;
		}
		if(c.compareTo(m)>0) {
			m=c;
		}	
		return m;
	}
	
	
	
	
}

