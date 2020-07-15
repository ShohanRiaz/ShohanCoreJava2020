package simpleTest;

public class House {
	 String Name; //variable declared
	 String Type = "Duplex"; //variable initialized
	 int number = 512;    
	 char apartment = 'C';     
	 boolean basement = true;   
	 
	 public House() { // default constructor
		System.out.println("This is our house");
	 }
	 
	 public void houseDetails(){ //method implemented //method name can be same as class name but not a good practice
		 	System.out.println("My house is: " + Type + " \nAnd the house number is: " + 
			number + ", \nApartment number is '" +apartment+ "' type house " + "\nIs there a basement?: "+basement ); 
			
			}
	
	public static void main(String[] args) {
		House house1 = new House();  //default constructor initialized
		house1.houseDetails(); //method initialized
		house1.Name ="Shohan"; // method called
	}	

}
//Java is all about class and object