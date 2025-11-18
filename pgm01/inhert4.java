package pgm01;

public class inhert4 {
	
	public static class animal{
		int nooflegs = 5;
		
	
	public void eat() {
		System.out.println("Iam eating");
	}
	public void walk() {
		System.out.println("I am walking");
	}

	}
	public static class Dog extends animal{
		boolean bark = true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog codeio = new Dog();
System.out.println(codeio.nooflegs);
System.out.println(codeio.bark);
codeio.walk();
codeio.eat();

	}		
		
	}


