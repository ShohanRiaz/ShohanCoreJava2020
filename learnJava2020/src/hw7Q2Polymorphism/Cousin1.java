package hw7Q2Polymorphism;

public class Cousin1 {
	 //Method overloading(same method name but different type of parameter)
	 //Early binding or static binding or compile time polymorphism.

		public int ageOfCousins (int age1, int age2) {
			int ageTotal = age1+age2;
			System.out.println("Age of Cousins" +ageTotal);
			return ageTotal;
		}
		
		public int ageOfCousins (int age1, String age4) {
			int ageTotal = age1 + (Integer.parseInt(age4));
			System.out.println("Age of Cousins" +ageTotal);
			return ageTotal;
		}
		
		public int ageOfCousins (int age1, int age2, String age4) {
			int ageTotal = age1 + age2+ (Integer.parseInt(age4));
			System.out.println("Age of Cousins" +ageTotal);
			return ageTotal;
		}
		
			public int ageOfCousins (int age1, int age2, int age3) {
			int ageTotal = age1+age2+age3;
			System.out.println("Age of Cousins" +ageTotal);
			return ageTotal;
		}
			
			public final int ageOfCousins (int age1, int age2, int age3, int age5) {
				int ageTotal = age1+age2+age3+age5;
				System.out.println("Age of Cousins" +ageTotal);
				return ageTotal;
		}
			
			public static int ageOfCousins (int age1, int age2, int age3, int age5, int age6) {
				int ageTotal = age1+age2+age3+age5+age6;
				System.out.println("Age of Cousins" +ageTotal);
				return ageTotal;
		}
	}
