package hw7Q2Polymorphism;

public class Cousin2 extends Cousin1{
	//Method overriding(same method name, same parameter but different syntax or logic)
	//Late binding or dynamic binding or runtime polymorphism
	
	public int ageOfCousins (int age1, int age2) {
		int ageTotal = age1+age2+5;
		System.out.println("Age of Cousins" +ageTotal);
		return ageTotal;
	}
	
	public int ageOfCousins (int age1, String age4) {
		int ageTotal = age1 + (Integer.parseInt(age4) + 20);
		System.out.println("Age of Cousins" +ageTotal);
		return ageTotal;
	}
	
	public int ageOfCousins (int age1, int age2, String age4) {
		int ageTotal = age1 + age2+ (Integer.parseInt(age4)+ 30);
		System.out.println("Age of Cousins" +ageTotal);
		return ageTotal;
	}
	
		public int ageOfCousins (int age1, int age2, int age3) {
		int ageTotal = age1+age2+age3+40;
		System.out.println("Age of Cousins" +ageTotal);
		return ageTotal;
	}
		
		/*Final method can not be overridden (Because final method can not be changed)
		public final int ageOfCousins (int age1, int age2, int age3, int age5) {
			int ageTotal = age1+age2+age3+age5+50;
			System.out.println("Age of Cousins" +ageTotal);
			return ageTotal;
			
	}
		Static method can not be overridden(Because static method is a common method in parent class)
		public static int ageOfCousins (int age1, int age2, int age3, int age5, int age6) {
			int ageTotal = age1+age2+age3+age5+age6+60;
			System.out.println("Age of Cousins" +ageTotal);
			return ageTotal;
	}*/

		

}
