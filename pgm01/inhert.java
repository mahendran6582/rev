package pgm01;

public class inhert {
	
	
	public static class animal {
		int nooflegs = 4;
		
		public void eat(){
			System.out.println("I am eating");
		}
		
		public void walk() {
			System.out.println("I am walking");
		}

	}

public static class Dog extends animal{
    boolean canbark = true;
   }
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog imv = new Dog();
		System.out.println(imv.nooflegs);
		System.out.println(imv.canbark);
		imv.walk();
		imv.eat();
	}
}
