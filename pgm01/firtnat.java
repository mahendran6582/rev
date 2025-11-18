package pgm01;

public class firtnat {
	public static void natprts(int n) {
		if(n==1) {
			System.out.println(1);			
		}
		else {
			System.out.println(n);
			natprts(n-1);
		}
		
	}

	public static void main(String[] args) {
		natprts(10);
		// TODO Auto-generated method stub

	}

}
