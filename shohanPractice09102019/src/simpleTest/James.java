package simpleTest;



public class James {

	
		public String Name; 
		public char grade;
		public int id;
		public boolean female;

		public James() { 
			System.out.println("In parameterized constructor, we can initialize as much data as we can, like:"); 
	
	
		}
		
		public James(String Name, char grade, int id, boolean female) { 
			this.Name = Name;
			this.grade = grade;
			this.id = id;		
			this.female = female;
			System.out.println(Name);
			System.out.println(grade);
			System.out.println(id);
			System.out.println(female);
		}
			public void studentName() {

			}
		public static void main(String[] args) {
			James student1 = new James();
			student1.studentName();
			James student2 = new James("James", 'C', 22342, false); 
					}
}
