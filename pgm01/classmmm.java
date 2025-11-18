package pgm01;

public class classmmm {
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
		classmmm codeio = new classmmm();
		codeio.getvalue("nethra",324234);
		codeio.display();
	}

	}

