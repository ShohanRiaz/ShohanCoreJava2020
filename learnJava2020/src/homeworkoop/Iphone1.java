package homeworkoop;
/*
  
 what is the relation between regular class, Abstract class and Interface? Can you make a relation of Iphone1 with Phone Interface and AppleWatch Abstract class.
 
 
 */
public class Iphone1 extends AppleWatch implements Phone{
	

	
	public void regularClassInfo() {
		System.out.println("A regular class can extend to only one regular or abstract class but can implement several interface. ");
	}

	@Override
	public void pager() {
		System.out.println("From Pager Interface");
		
	}

	@Override
	public void wakiTaki() {
		System.out.println("From WakiTaki Interface");
		
	}

	@Override
	public void watch() {
		System.out.println("From Watch Interface");
		
	}

	@Override
	public void digitalWatch() {
		System.out.println("From DigitalWatch Interface");
		
	}

	@Override
	public void interfaceInfo() {
		System.out.println("An interface can NOT instantiate itself, can ONLY declare method. Can NOT extend a regular or abstract class but can extends several interface. ");
		
	}

	@Override
	public void call() {
		System.out.println("Abstract method call from Phone Interface");
		
	}

	@Override
	public void message() {
		System.out.println("Abstract method message from Phone Interface");
		
	}

	@Override
	public void camera() {
		System.out.println("Abstract method camera from Phone Interface");
		
	}

	@Override
	public void appleWatch() {
		System.out.println("Abstract method appleWatch from AppleWatch abstract class");
		
	}

}
