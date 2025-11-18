package pgm01;

public class inheritmulti {
	public static class Grandfather{
		char c = 'M';
		void diplay() {
			System.out.println("Parentling class");
		}
		
	}
	
	public static class father extends Grandfather{
		
	}
	
	public static class Son extends father{
		
	}	
	
	

	public static void main(String[] args) {
		father codeio = new father();
		System.out.println(codeio.c);
		codeio.diplay();
		Son viewer = new Son();
		System.out.println(viewer.c);
		viewer.diplay();

	}

}
