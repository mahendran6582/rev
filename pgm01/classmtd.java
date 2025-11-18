package pgm01;

public class classmtd{
	
	String name;
	int rollno;
	
	public void display(){
		
		System.out.println(name);
		System.out.println(rollno);
	}
	
	public static void main(String[] args) {

		classmtd colle = new classmtd();
		colle.name = "Mahendran";
		colle.rollno = 54334543;
		colle.display();

	} 

}
