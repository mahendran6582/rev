package pgm01;

public class classmthde {
	String name;
	int rollno;
	
	public void display() {
		System.out.println(name);
		System.out.println(rollno);
	}
	
	public void getvalue(String str, int num) {
		 name = str;
		rollno = num;
	}
	
	
	public static void main(String[] args) {

		classmthde codeio = new classmthde();
codeio.name = "Mahendran";
codeio.getvalue("ruller", 6786876);
codeio.display();

classmthde viewer = new classmthde();
viewer.name = "Nethra";
viewer.rollno = 75438;
viewer.display();


		
	}

}
