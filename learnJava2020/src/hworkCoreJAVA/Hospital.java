package hworkCoreJAVA;

public interface Hospital {
	public void cafeteria();
	public void emergencyRoom();
	public void surgeryRoom();
	
	public default void morgue() {
		System.out.println("From the default method of Hospital");
	}
	
	public static void pharmacy() {
		System.out.println("From the static method of Hospital");
	}
	// from java 8, default and static methods are implemented in interface	
	
}
