package homeworkoop;

public abstract class AppleWatch extends AppleWatchSeries5 implements Watch, DigitalWatch{
	public String Color;
	public int price;
	
	public AppleWatch() {
		System.out.println("Yes, we can create a Constructor inside abstract class");
	}
	
	public AppleWatch(String Color, int price) {
		this.Color = Color;
		this.price = price;
		System.out.println("My Apple watch Color is "+ Color+ " Price is: $"+ price);
	}
	
	public abstract void appleWatch(); // the other one is non-abstract method
	
	public void abstractClassInfo() {
		System.out.println("An abstract class can have both abstract and nonabstract methods. Abstract class can extend to only one absrtract or nonabstract class but can implement several interface");
		
	}
	

}
