package pgm01;

public class classmeth {
	
	String name;
	int rollno;
	

	
	public void display(){
		System.out.println(name);
		System.out.println(rollno);
	}
	
	public void setval(String str, int num) {
		name = str;
		rollno = num;
	}
		
	public static void main(String[] args) {
		classmeth codeio = new classmeth();
		codeio.setval("Mahendran", 355453453);
		codeio.display();

	}
	}


