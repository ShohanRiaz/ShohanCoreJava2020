package constructor;

public class Student {
	
	public String Name; //global variable //class variable
	public int id;
	public char grade;
	public boolean usCitizen;
	//constrauctor1
	public Student() { //default constructor //you can't write a parameterized constructor without a default constructor
		System.out.println("This is from default constructor"); 
	}
	//constructor2
	public Student(String Name, int id) { //parameterized constructor declared //String Name, int id is called local variable 
		this.Name = Name; //this keyword
		this.id = id;
		System.out.println("Student is: "+Name+ " and his ID is: "+id); 
	}
	//constructor3
	public Student(String Name, int id, char grade, boolean usCitizen) { //parameterized constructor  //local variable
		this.Name = Name;
		this.id = id;
		this.grade = grade;
		this.usCitizen = usCitizen;
		System.out.println("Student is: "+Name+ ", his/her ID is: "+id+ ", his/her grade: "+grade+ ", US Citizen: "+usCitizen); 
	}
	public void schoolName() {
		System.out.println("We are from CUNY");
	}
	public static void main(String[] args) {
		Student st1 = new Student(); //initialization of default constructor or constructor1
		st1.schoolName();
		Student st2 = new Student("Shohan", 007, 'A', true); //"Shohan", 007, A, TRUE --- they are called argument// constructor 
		Student st3 = new Student("Tofael", 8); //initialization of constructor2
		Student st4 = new Student("Dalia", 9, 'A', true);//initialization of constructor3
		}

}
