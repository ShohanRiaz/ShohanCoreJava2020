package abstraction;

public interface Car extends Dmv, Tlc{//an interface can extend more than one interface class
	public abstract void start();// curly brace absent means that method is declared, in an interface, method can NOT be implemented
	public void stop();// by default, methods in interface are Abstract so need to write 'abstract'
	// from java 1.8, static and default method is implemented in interface
	
	public static void honk () {
	System.out.println("Hydrolic Honk");
	}
	
	public default void gear() {
		System.out.println("Automatic Gear");
	}
}


