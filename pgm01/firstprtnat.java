package pgm01;

public class firstprtnat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		prtnrul(10);
	}

	public static void prtnrul(int n) {
		
		if(n == 1)
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(n);
			prtnrul(n-1);
		}
		
		
	}
	

}
