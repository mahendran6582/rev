package pgm01;

public class inherithier {
	
	public static class grandfather{
		char c = 'M'; 
	void display() {
		System.out.println("Parent hierarchy");
	}
	}
	
	public static class daughter extends grandfather{
		char c = 'F';
	}
	
	public static class uncle extends grandfather{
		char c = 'U';
	}
	

	
	public static void main(String[] args) {
	daughter codeio = new daughter();
	System.out.println(codeio.c);
	codeio.display();
	uncle uncleio = new uncle();
	System.out.println(uncleio.c);
	uncleio.display();	
		
	}

}
