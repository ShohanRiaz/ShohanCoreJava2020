package abstraction;
//abstract class can contain abstract and non abstract methods
public abstract class FlyingCar extends Nissan implements MetroNorth, Marta{//a class can extend ONLY one class or abstract class
	public void autopilot() {
		System.out.println("Has Auto Pilot Facility");
	}
	public abstract void flyingFeature();
	
	
	

}
