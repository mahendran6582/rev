package pgm01;

public class frstnatt {

	public static void prtnat(int n) {
		if(n==1) {
			System.out.println(1);
		
			
		}
		else {
			System.out.println(n);
			prtnat(n-1);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prtnat(10);
	}

}
