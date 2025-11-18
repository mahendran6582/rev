package pgm01;

public class fistnat {
	public static void natrl(int n) {
	if(n==1) {
		System.out.println(1);
	}
	else {
		System.out.println(n);
		natrl(n-1);
		
	}
	}

	public static void main(String[] args) {
			natrl(10);
	}

}
