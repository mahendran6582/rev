package pgm01;

public class fprintnat {
	
	public static void natr(int n) {
		if(n==1) {
			System.out.println(1);
		}
		else {
			System.out.println(n);
			natr(n-1);
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		natr(10); 

	}

}
