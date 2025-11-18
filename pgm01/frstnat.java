package pgm01;

public class frstnat {
	
	public static void prtnat (int n) {
		if(n==1)
		System.out.println(1);	
	
	else {
		System.out.println(n);
		prtnat(n-1);
	}
	}
	public static void main(String[] args) {
		prtnat(10);
		// TODO Auto-generated method stub

	}

}
