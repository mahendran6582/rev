package pgm01;

public class fstprt {
	
		public static void printnat(int n) {
		if(n==1) {
		
		System.out.println(1);
	}
		else {
			System.out.println(n);
			printnat(n-1);
		}
		
	}	

	public static void main(String[] args) {
		printnat(10);
	}
		// TODO Auto-generated method stub

	

}
