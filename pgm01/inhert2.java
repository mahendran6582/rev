package pgm01;

public class inhert2 {
	
	public static class animal {
		int nooflegs = 4;
	
		public void eat() {
		System.out.println("it is eating");
		
	}
	
	public void walk() {
		System.out.println("it is walking");
	}
	}
	
	public static class Dog extends animal {
		boolean barking = true;
	}
		
	public static void main(String[] args) {
		
		Dog codeio = new Dog();
		System.out.println(codeio.nooflegs);
		System.out.println(codeio.barking);
		codeio.walk();
		codeio.eat();
		
		// TODO Auto-generated method stub

	}

}
