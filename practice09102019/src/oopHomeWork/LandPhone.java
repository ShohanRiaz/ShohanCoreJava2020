package oopHomeWork;

public class LandPhone implements Pager, WalkieTalkie{
	public LandPhone() {
	System.out.println("Landphones can't be moveable");
	}
	String Name = "John";
	int phNo = 347;
	char type = 'R';
	
	public LandPhone(String Name, int phNo, char type) {
	this.Name = Name;
	this.phNo = phNo;
	this.type = type;
	System.out.println("Customer is: " +Name + ", Ph no is: " +phNo + ", Type is: " +type);
	}
	@Override
	public void twoWay() {
		System.out.println("2 way radio system");
		
	}

	@Override
	public void oneWay() {
		System.out.println("1 way radio system");
		
	}
	public static void main(String[] args) {
	LandPhone lp = new LandPhone("John", 347, 'R' );
	}

	
}
