package pgm01;

public class inhertall {
	public static class grandfather{
	char gender = 'M';
	void display() {
		System.out.println("grandfather Parenting class");
	
	}
	}
	
	public static class daughter extends grandfather{
		char gen = 'F';
		void ddisplay() {
			
	System.out.println("daughter parenting");
	}
	}
	public static class son extends grandfather{	
		void sdisplay() {
	System.out.println("son parenting");
	}
	}
	
	public static void main(String[] args) {
	daughter codeio = new daughter();
	System.out.println(codeio.gen);
	codeio.ddisplay();

	}

}
