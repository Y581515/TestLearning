package hvl.stud;

public class sort {

	public static void main(String[] args) {
		int []a = {7,1,9,5,3,13};
		skriveUt(a);
		
		sort(a);
		skriveUt(a);
	}
	
	public static void skriveUt(int[] tab) {
		for (int e: tab) {
			System.out.print(e+" ");
		}System.out.println();
	}
	
	public static void sort(int[]a) {
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;	
				}
			}
		}
	}
}
