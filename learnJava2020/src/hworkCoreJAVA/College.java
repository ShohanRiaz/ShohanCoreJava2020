package hworkCoreJAVA;

public interface College {
	public void commonRoom();
	public void laboratory();
	public void languageClub();
	
	public default void dorm() {
		System.out.println("From the default method of College");
	}
	
	public static void studyRoom() {
		System.out.println("From the static method of College");
	}
	// from java 8, default and static methods are implemented in interface
}
