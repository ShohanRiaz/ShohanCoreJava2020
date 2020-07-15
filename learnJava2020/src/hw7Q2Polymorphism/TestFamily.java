package hw7Q2Polymorphism;

public class TestFamily {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cousin1 co1 = new Cousin1 ();
		co1.ageOfCousins(13, 15);
		co1.ageOfCousins(13, "18");
		co1.ageOfCousins(13, 15, 17);
		co1.ageOfCousins(13, 15, "18");
		co1.ageOfCousins(13, 15, 17, 21);
		Cousin1.ageOfCousins(13, 15, 17, 21, 25);
		//Final method can not be overridden (Because final method can not be changed)
		
		System.out.println("-------------------");
	
		Cousin2 co2 = new Cousin2 ();
		co2.ageOfCousins(13, 15);
		co2.ageOfCousins(13, "18");
		co2.ageOfCousins(13, 15, 17);
		co2.ageOfCousins(13, 15, "18");
		co2.ageOfCousins(13, 15, 17, 21);
		//Static method can not be overridden(Because static method is a common method in parent class)
	}
}