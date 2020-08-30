package hvl.stud;

public class gangingsTabelFraForelesning {

	public static void main(String[] args) {
		final int N=4;
		
		for (int i=1;i<=N;i++){
			for (int j=1;j<=N;j++){
				System.out.print(j*i+ " ");
			}
			System.out.println();
		}
	}
}
