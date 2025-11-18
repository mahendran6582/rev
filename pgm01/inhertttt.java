package pgm01;

public class inhertttt {
	public static class  father {
		char gender = 'M';
	
	void display() {
		System.out.println("parenting class");
	}
	}


	public static class son extends father{
		
	}
	
	

	public static void main(String[] args) {
		son codeio = new son();
		System.out.println(codeio.gender);
		codeio.display();
	}
	}
