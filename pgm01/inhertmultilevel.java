package pgm01;

public class inhertmultilevel {
	
	public static class grandfather{
		char gender = 'M';
		void print() {
			System.out.println("Parent class");
		}
	}
	
	public static class mother extends grandfather {
				char gender = 'F';
			
	}
	
	public static class Daughter extends mother {
				
		
	}
	

	public static void main(String[] args) {
Daughter s = new Daughter();
System.out.println(s.gender);
s.print();

	}

}
