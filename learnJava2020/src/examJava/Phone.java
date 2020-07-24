package examJava;

public interface Phone {
	public abstract void interfaceInfo();
	public abstract void call();
	public abstract void message();
	public abstract void camera();
	
	public static void battery() {
		System.out.println("battery is a static method can be initialized from Java 8");
	}
	public default void wireless() {
		System.out.println("wirelessis a default method can be initialized from Java 8");
	}
}
