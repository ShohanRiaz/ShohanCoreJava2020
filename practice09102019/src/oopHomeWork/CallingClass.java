package oopHomeWork;

public class CallingClass extends LandPhone{

	public static void main(String[] args) {
		Call call = new InterfaceInfo();
		call.autoDial();
		call.MMS();
		call.tripleCamera();
				
		Message msg = new InterfaceInfo();
		msg.MMS();
		
		Camera cam = new InterfaceInfo();
		cam.tripleCamera();
		
		Battery batt = new InterfaceInfo();
		batt.longLife();
		batt.battery();
		
		Wireless wl = new InterfaceInfo();
		wl.network();
		wl.wireless();
		
		LandPhone lp = new LandPhone();
		lp.oneWay();
		lp.twoWay();
	

		
		
		
	}

}
