package homeworkoop;
/*

 can remember] . 
Can we write variable inside Interface?



 */
public interface Phone extends Pager, WakiTaki { 
	
	/* public Phone() {
		Interface can NOT have Constructor.
	}*/
	public void interfaceInfo();
	
	public void call();
		
	public void message();
	
	public void camera();
	
	public static void battery() {
		System.out.println("battery is a static method from Java 1.8");
	}
	
	public default void wireless() {
		System.out.println("wireless is a default method from Java 1.8");
	}
	
	
	
	

}
