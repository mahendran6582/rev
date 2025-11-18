package pgm01;

public class encap {
	
	String name;
	int rollno;
	
	public void display() {
		System.out.println(name);
		System.out.println(rollno);
	}		
	

	public static void main(String[] args) {
	encap codeio = new encap();
	codeio.name = "Mahendran";
	codeio.rollno = 24243432;
	codeio.display();
	encap grey = new encap();
	grey.name = "nethra";
	grey.rollno = 247875944;
	
	
	grey.display();
		

	}

}
