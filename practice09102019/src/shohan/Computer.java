package shohan;

public class Computer { //class
	
	public String OperatingSystem; //variable declared
	public int price;
	
	public Computer() { //default constructor
		
	}
	
	public void configuration(){ //method implemented
	System.out.println("My operating system is: " + OperatingSystem + " And the price is: " + price + "$" );
	}
	
	
	public static void main(String[] args) { //main method
		Computer computer1 = new Computer(); //instantiate of Class 
		computer1.OperatingSystem = "Windows"; //variable initialize
		computer1.price = 1200;
		computer1.configuration(); //method initialized
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
