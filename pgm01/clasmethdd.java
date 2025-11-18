package pgm01;

public class clasmethdd {
	String name;
	int rollno;
	
	void display() {
		System.out.println(name);
		System.out.println(rollno);
	}
	public void getvalue(String str, int nums) {
		name = str;
		rollno = nums;
		
		
	}
	
	public static void main(String[] args) {
		clasmethdd codeio = new clasmethdd();
		codeio.getvalue("Mahendran",724274);
		codeio.display();
	}

}
