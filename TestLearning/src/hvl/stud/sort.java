package hvl.stud;

public class sort {

	public static void main(String[] args) {
		int[] a = { 0,2,4,6,8,10 };
		int[] a2 = { 1,3,5,7,9 };
		skriveUt(a);
		sort(a);
		skriveUt(a);
		int t = 3;
		System.out.println("\n" + posisjonTall(a, 10) + "\n");
		System.out.println("finnes tallet " + t + "? " + finnesTall(a, t));

		System.out.println("\nreversert tab: ");
		skriveUt(reverser(a));

		System.out.println("");
		sort(a);
		System.out.println(erSortert(a));
		System.out.println("");
		skriveUt(settSammen(a, a2));
	}

	public static void skriveUt(int[] tab) {
		for (int e : tab) {
			System.out.print(e + " ");
		}
		System.out.println();
	}

	public static void sort(int[] a) {

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	public static boolean finnesTall(int[] tabell, int tall) {
		
		boolean funnet=false;
		for(int v:tabell) {
			if(v==tall) {
			funnet=true;
			}
		}
		return funnet;
	}

	public static int posisjonTall(int[] tabell, int tall) {
		boolean innholder = false;
		int i = 0;
		int indeks = 0;
		while (!innholder && i < tabell.length) {
			if (tall == tabell[i]) {
				innholder = true;
				indeks = i;
			} else {

				indeks = -1;
			}
			i++;
		}
		return indeks;
	}

	public static int[] reverser(int[] tabell) {
		int[] b = new int[tabell.length];
		System.arraycopy(tabell, 0, b, 0, tabell.length);

		for (int i = 0; i < (b.length) / 2; i++) {
			int temp = b[i];
			b[i] = b[b.length - (1 + i)];
			b[b.length - (1 + i)] = temp;
		}
		return b;
	}

	public static boolean erSortert(int[] tabell) {

		boolean sortert = true;
		int i = 0;
		while (sortert && i < tabell.length - 1) {
			if (tabell[i] > tabell[i + 1]) {
				sortert = false;
			}
			i++;
		}
		return sortert;
	}

	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int tabell3[] = new int[tabell1.length + tabell2.length];

		int j = 0;
		for (int i = 0; i < tabell3.length; i++) {
			if (i % 2 == 0) {
				tabell3[i] = tabell1[i - j];
			}

			if (i % 2 == 1) {
				j++;
				tabell3[i] = tabell2[i - j];
			}
		}
		return tabell3;
	}

}
