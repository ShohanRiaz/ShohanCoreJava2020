package abstraction;

public class TestAllTheInfo {

	public static void main(String[] args) {
		Car car = new Toyota();
		car.start();
		car.stop();
		car.gear();
		Car.honk();// static method can be called DIRCTLY by the Class or Interface
		// when a method is static, object can NOT call that method
		
		System.out.println("------------------------");
		
		FlyingCar fc = new Toyota();
		fc.autopilot();
		fc.flyingFeature();
		fc.brake();
		fc.marta();
		fc.nissan();
		fc.track();
	
		
		System.out.println("------------------------");
		
		
		Toyota ty = new Toyota();
		ty.autopilot();
		ty.brake();
		ty.license();
		ty.marta();
		ty.nissan();
		ty.price();
		ty.start();
		ty.stop();
		ty.taxi();
		ty.flyingFeature();
		ty.station();
		ty.track();

	
		System.out.println("------------------------");
		
		Corolla co = new Corolla();
		co.corollainfo();
		
		System.out.println("------------------------");
		
		Tesla ts = new Tesla();
		ts.tesla();
		
		System.out.println("------------------------");
		
		Nissan ns = new Toyota();
		ns.brake();
		
		
		
		
		
		

	}

}
