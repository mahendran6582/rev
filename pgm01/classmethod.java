	package pgm01;
	public class classmethod {
	
		String name;
		int rollno;
		
		public void display() {
			System.out.println(name);
			System.out.println(rollno);
			
		}
		public void setvalue(String str, int num) {
			name = str;
			rollno = num;
		}
	
		
		public static void main(String[] args) {		
			classmethod dtls = new classmethod();
			dtls.setvalue("mahendran", 6578);
		
			dtls.display();	
			
			classmethod trms = new classmethod();
			trms.name = "nethra";
			trms.rollno = 75347534;
			trms.display();
			
		}
	}
	

	
