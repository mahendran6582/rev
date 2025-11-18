package pgm01;

public class clasmethd {
	String name;
	int rollno;
	
	public void display() {
		System.out.println(name);
		System.out.println(rollno);
	}
	
	public void getvalues(String str, int nam) {
		name = str;
		rollno = nam;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
clasmethd codeio = new clasmethd();
codeio.getvalues("mahendran",53543);
codeio.display();
	}

}
