package pgm01;

public class inhertsssingle {
	public static class father{
		char c = 'M';
	void display() {
		System.out.println("Parenting class");
	}
	}
	
	public static class Son extends father{
		
	}
	

	public static void main(String[] args) {
		Son Codeio = new Son();
		System.out.println(Codeio.c);
		Codeio.display();

	}

}
