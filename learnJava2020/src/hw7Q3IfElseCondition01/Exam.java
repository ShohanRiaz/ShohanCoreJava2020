package hw7Q3IfElseCondition01;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 80;
		
		if (a < 0 || a > 100) {
		System.out.println("This is an invalid number");
	}
	else if (a <=30) {
		System.out.println("You've Failed");
	}
	else if (a >= 31 && a <= 60) {
		System.out.println("You've Passed");
	}
	else if (a >= 61 && a <= 100) {
		System.out.println(" You've Passed with Honors");
	}
		
		else {
		System.out.println("Your score is "+ a);
	}
}
}

