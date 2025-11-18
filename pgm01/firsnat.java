package pgm01;

public class firsnat {
	
	public static void natprt (int n){
	
		if(n==1)
	{
		System.out.println(1);	
	
	}
		else {
			System.out.println(n);
			natprt(n-1);
		}
		}
		
	public static void main(String[] args) {
		
		natprt(10);
		// TODO Auto-generated method stub

	}

}

