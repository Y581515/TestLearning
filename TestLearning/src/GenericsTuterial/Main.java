package GenericsTuterial;

public class Main {
	public static void main(String[] args) {
		Integer[] iRay = { 1, 2, 3, 4 };
		Character[] cRay = { 'a', 'b', 'c', 'd' };
		Integer a=20;
		Integer b=23;
		Integer c=25;
		
		System.out.println(Max(a,b,c));

		PrintMe(iRay);
		PrintMe(cRay);

		// 1)
//		MyClass<Integer> obj= new MyClass<>(10);
//		MyClass<Double> obj2= new MyClass<>(20.0);
//		
//		obj.showType();
//		obj2.showType();

		// 2)
//		MyClassTV<Integer,Double> obj3= new MyClassTV<>(30,40.222);
//		obj3.showType();

		// 3)
		NumericFns<Integer> iob4 = new NumericFns<>(4);
		System.out.println(iob4.square());

		// 4
		NumericFns<Double> iob5 = new NumericFns<>(3.0);
		boolean TvF = iob5.absEqual(iob4);
		System.out.println(TvF);

	}

	public static <T> void PrintMe(T[] x) {
		for (T b : x) {
			System.out.print(b + " ");
		}
		System.out.println();
	}

	public static <T extends Comparable<T>> T Max(T a, T b, T c) {
		T m = a;
		
		if (b.compareTo(a) > 0) {
			b = m;
		}
		if (c.compareTo(m) > 0) {
			m = c;
			;
		}
		return m;
	}

}
