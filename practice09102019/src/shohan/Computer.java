package shohan;

public class Computer { //class
	
	
	public String OperatingSystem; //variable declared
	public int price;
	public String $;
	
	public Computer() { //default constructor
		System.out.println("This is from default constructor");
	}
	
	public Computer(String OperatingSystem) {
		this.OperatingSystem = OperatingSystem;
		System.out.println("OperatingSystem is "+ OperatingSystem);
	}
	public Computer(String OperatingSystem, int price) {
		this.OperatingSystem = OperatingSystem;
		this.price = price;
		System.out.println("OperatingSystem is "+ OperatingSystem + price);
	}
	public Computer(String OperatingSystem, int price, String $) {
		this.OperatingSystem = OperatingSystem;
		this.price = price;
		System.out.println("OperatingSystem is "+ OperatingSystem + price + $);
	}
	public void configuration(){ //method implemented
		System.out.println("My operating system is: " + OperatingSystem + " And the price is: " + price + "$" );
	}
	
	
	public static void main(String[] args) { //main method
		Computer computer1 = new Computer(); //instantiate of Class 
		computer1.OperatingSystem = "Windows"; //variable initialize
		computer1.price = 1500;
		computer1.configuration(); //method initialized
		Computer computer2 = new Computer("Windows 10");
		Computer computer3 = new Computer("MacOS " + 2000);
		Computer computer4 = new Computer("Linux " + 3000 + "$");

		}
		
	}


