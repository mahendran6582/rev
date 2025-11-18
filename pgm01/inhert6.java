package pgm01;

public class inhert6 {
	
	public static class animal {
		int noofleg = 4;
		
	
	
	public void eat() {
		System.out.println("I am eating");
	}
	
	public void walk() {
		System.out.println("I am walking");
	}
}
	
	public static class dog extends animal{
		boolean bark = true;
		
	}

	public static void main(String[] args) {
dog codeio = new dog();
System.out.println(codeio.noofleg);
System.out.println(codeio.bark);
codeio.eat();
codeio.walk();
	}

}
