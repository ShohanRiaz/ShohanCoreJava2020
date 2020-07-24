package examJava;



public class TestPhone {

	public static void main(String[] args) {
		
	
		Phone ph = new LandPhone();
		ph.call();
		ph.interfaceInfo();
		ph.message();
		ph.wireless();
		Phone.battery();
		
		Pager pg = new LandPhone();
		pg.callBack();
		
		Wireless wl = new LandPhone();
		wl.dataTransfer();
		
		LandPhone lp = new LandPhone();
		lp.call();
		lp.callBack();
		lp.camera();
		lp.dataTransfer();
		lp.interfaceInfo();
		lp.message();
		lp.wireless();
		
		AppleWatch aw = new AppleWatchSeries5();
		aw.abstractClassInfo();
		aw.appleWatchInfo();
		
		Watch wa = new AppleWatchSeries5();
		wa.analog();
		
		DigitalWatch dw = new AppleWatchSeries5();
		dw.digital();
		
		AppleWatchSeries5 a5 = new AppleWatchSeries5();
		a5.abstractClassInfo();
		a5.analog();
		a5.appleWatchInfo();
		a5.digital();
		
		Iphone1 ip1 = new Iphone1();
		ip1.call();
		ip1.camera();
		ip1.galaxyS10();
		ip1.interfaceInfo();
		ip1.message();
		ip1.regularClassInfo();
		ip1.wireless();
		
		Iphone1 ip1Data = new Iphone1();
				ip1Data.setPrice(1100);
				ip1Data.setInfo("iPhone 11 Max");
				ip1Data.setGrade('A');
				ip1Data.setMadeInUSA(false);
		System.out.println("I bought one "+ ip1Data.getInfo()+ "\nThe price was $"+ ip1Data.getPrice() + "\nThe grade was "+ ip1Data.getGrade() + "\nIt was made in USA -" + ip1Data.isMadeInUSA());
		
		Iphone2 ip2 = new Iphone2();
		ip2.iPhone2Info();
		ip2.iPhone2Info('F');
	
		Iphone6 ip6 = new Iphone6();
		ip6.materials(200, 300);
		ip6.materials(200, 300, "400");
		
		/* 
		 1. Iphone1 = Super Class or parent class and rest of the classes are sub class or child class
		 2. Iphone2 extends Grandfather, Iphone3 extends Iphone1- they are called 'Hierarchical' inheritance
		 3. Iphone4 extends Iphone2,  - this is called 'Single' inheritance
		 4. Iphone6 extends Iphone5, Iphone5 extends Iphone4, Iphone4 extends Iphone2, Iphone2 extends Iphone1 - they are called ' Multilevel inheritance
		 
		 
		 */	
		
	
		
		
		}
		}


