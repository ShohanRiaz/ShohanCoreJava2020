package homeworkoop;

public class TestPhone {

	public static void main(String[] args) {
		Phone ph = new Iphone1();
		ph.interfaceInfo();
		ph.call();
		ph.message();
		ph.camera();
		Phone.battery();
		ph.wireless();
		System.out.println("\n");
		
		AppleWatch aw = new Iphone1(); //QUE: where to initialize the parameterized constructor in abstract class
		aw.appleWatch();
		aw.abstractClassInfo();
		aw.watch();
		aw.digitalWatch();
		aw.appleWatchSeies5();
		System.out.println("\n");
		
		Iphone1 ip1 = new Iphone1();
		ip1.regularClassInfo();
		ip1.interfaceInfo();
		ip1.call();
		ip1.message();
		ip1.camera();
		//ip1.battery(); //battery is a STATIC method of interface and its local for that interface so ip1 can NOT call it
		ip1.wireless();
		ip1.appleWatch();
		ip1.abstractClassInfo();
		ip1.watch();
		ip1.digitalWatch();
		ip1.appleWatchSeies5();
		
		
	}

}
