package pgm01;
public class inherithybrid {
	
	public static class father{
		char c = 'M';
		
			void display()
			{
				System.out.println("Parent hybrid");
			}
				
		}
	
		public static class daughter extends father{
			char d = 'F';
			void display() {
			System.out.println("daughter hybrid");
			
		}
		}

		
public static class granddaughter extends daughter{
	char gd = 'F';
	void display(){
		System.out.println("granddaughter hybrid");
		
	}
	}
		
public static class Son extends father{
	char s = 'M';
	void display(){
	System.out.println("son hybrid");
			
		}
}


	public static void main(String[] args) {
		
		Son codeio = new Son();
		System.out.println(codeio.s);
		codeio.display();

		daughter viewer = new daughter();
		System.out.println(viewer.d);
		viewer.display();
		
		granddaughter viewer2 = new granddaughter();
		System.out.println(viewer2.gd);
		viewer2.display();
		
		
	}

}
