package examJava;

public class Iphone2 extends Iphone1{
	public char userOfiPhone2;
	
	public Iphone2() {
		super (850, "iPhone 1", 'A', false);
		System.out.println("This is the default constructor from iPhone 2 ");
	}	
		public void iPhone2Info () {
			System.out.println("iPhone 2 was introduced in 2001");
	}
	public Iphone2(char userOfiPhone2) {
		this.userOfiPhone2= userOfiPhone2;
		System.out.println("User of iPhone 2 is: "+ 'M');
	}
		public void iPhone2Info (char userOfiPhone2 ) {
			
			System.out.println(userOfiPhone2);
		}
			
		}
	

