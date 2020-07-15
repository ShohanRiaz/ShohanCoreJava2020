package encapsulation;

public class TestStudent {

	public static void main(String[] args) {
		
		Student st1 = new Student(); 
		st1.setName("Sohan"); //private variable can not be initialized
		st1.setId(3423);
		st1.setGrade('A');
		st1.setWeeklyStudent(true);
		System.out.println("Student info: Name-"+st1.getName()+", Id- "+st1.getId()+", grade- "+st1.getGrade()+", weekly student- "+st1.isWeeklyStudent());
		
		Student st2 = new Student(); 
		st2.setName("Tofael"); //private variable can not be initialized
		st2.setId(4523);
		st2.setGrade('B');
		st2.setWeeklyStudent(false);
		System.out.println("Student info: Name-"+st2.getName()+", Id- "+st2.getId()+", grade- "+st2.getGrade()+", weekly student- "+st2.isWeeklyStudent());
		
		
		
		
		
		
		
		
	}


}
