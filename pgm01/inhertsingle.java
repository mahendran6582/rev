package pgm01;

public class inhertsingle {
	
	public static class father{
		char gender = 'M';
void print()
		{
		System.out.println("Parent class");
	}
	}
	 
	public static class Son extends father{	
		
	}


	public static void main(String[] args) {
	
		Son s = new Son();
		System.out.println(s.gender);
		s.print();
		
		// TODO Auto-generated method stub

	}
}

