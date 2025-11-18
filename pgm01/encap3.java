package pgm01;

public class encap3 {
	String name;
	int rollno;
	
 public void display() {
	 System.out.println(name);
	 System.out.println(rollno);
 }
 

	public static void main(String[] args) {
		encap3 codeio = new encap3();
		codeio.name = "Mahendran";
		codeio.rollno = 234234;
		
		codeio.display();
		
		// TODO Auto-generated method stub

	}

}
