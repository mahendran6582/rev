package pgm01;

public class encap2 {
	String name;
	int rollno;
	
	public  void display(){
		System.out.println(name);
		System.out.println(rollno);
	}
		
		public void setvalues(String str, int num){
			
			name = str;
			rollno = num;
			
		}
		
	
	public static void main(String[] args) {
		
		encap2 codeio = new encap2();
		codeio.setvalues("mahendran",84578);
		codeio.display();
		
		
	}

}
