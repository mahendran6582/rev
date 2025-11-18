package pgm01;

public class firstnat {
	public static void mahenra(int n) {

	if (n==1) {
		System.out.println(1);
		
	}
	else {
		System.out.println(n);
		mahenra(n-1);
	}
	}

	public static void main(String[] args) {
		mahenra(10);
		}

}
