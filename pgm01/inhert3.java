package pgm01;

public class inhert3 {
	
	
	public static class animal{
		int nooflegs = 4;	
		
		public void eat()
		{
			System.out.println("I am eating");
		}
		
		public void walk() {
			System.out.println("I am walk");
		}
	}
		
		public static class Dog extends animal {
			boolean bark = true;
	
		}
	

	public static void main(String[] args) {
		Dog codeio = new Dog();
		System.out.println(codeio.nooflegs);
		System.out.println(codeio.bark);
		codeio.walk();
		codeio.eat();
			
		// TODO Auto-generated method stub

	}

}
