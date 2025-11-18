package pgm01;

public class firstprintnat{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		prtarr(10);
	}
	
 public static void prtarr(int n) {
		if(n==1)
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(n);
		prtarr(n-1);
	}
}
}
