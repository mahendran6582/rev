package pgm01;

import pgm01.inhertsingle.Son;

public class inhertssingle {
	
	public static class father {
		char c = 'M';
	
	void display() {
		System.out.println("Parent class");
	}
	}
	public static class Son extends father{
		
	}
	
	
	

	public static void main(String[] args) {
		Son Codeio = new Son();
		System.out.println(Codeio.c);
		Codeio.display();

	}

}
