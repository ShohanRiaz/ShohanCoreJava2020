package inheritance;

public class Father extends GrandFather {
	
	public Father() {
		//super();// we comment out it, because only ONE constructor can be called
		super("Syed", 65, 'B', true);// super keyword can inherit either default or parameterized constructor
		// super keyword can NOT go below sysout
		super.property();// super keyword can call the method of parent class
		System.out.println("Our Family Name is: " + super.familyName);
		System.out.println("Default from Father");
	}
	
	
	
	public void fatherInfo() {
		System.out.println("Father: Ghulam Mustafa");
	}


}


