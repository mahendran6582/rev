package pgm01;

public class fstnnat {
	
	public static void natppt (int n) {
		if(n==1) {
			System.out.println(1);
		}
		else {
			System.out.println(n);
			natppt(n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		natppt(10);
	}

}
