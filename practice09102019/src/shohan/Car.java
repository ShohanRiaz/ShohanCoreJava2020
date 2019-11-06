package shohan;

public class Car { //opening of class body

	//class body	
	//variable declared or initialize
	//constructor declared or initialize
	//method implemented or initialize
		
		 String Brand = "Acura"; //String always in caps lock: Brand and double quotation is used
		 int mileage = 23415;    //except String every variable is in small letter, int represent number
		 char grade = 'A';       //char always in a single character and surrounded by single quotation
		 boolean electrical = false;   //true or false, (by default false)
		 
		 public Car() {//constructor declared //default constructor
			 System.out.println("This is from default constructor");
		 }
		 
		 public void carInfo(){ //method implemented
				//void type method or non return method or non static method, simplest presentation of method
				//method name always in small letter	
				//after method name there is ()
				System.out.println("My car is: " + Brand + " And the mileage is: " + 
				mileage + ", It's an '" +grade+ "' grade car. " + " Is it an electric car? Ans: "+electrical ); //concatenation - joining of 2 or 3
				
				}
		
		public static void main(String[] args) {
			Car car1 = new Car(); //here car is an object //instantiate the class //default constructor initialize
			car1.carInfo(); //method initialize
		}	

	}//closing of class body