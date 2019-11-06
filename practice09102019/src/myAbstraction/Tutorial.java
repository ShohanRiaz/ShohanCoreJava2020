//package myAbstraction;
//
//public class Tutorial {
//
//}
////
//package abstraction; //hiding of implementation details from users
//
//public interface Car {
//	public abstract void start(); //method declared //they are generally abstract type method
//    public void stop(); //method can't be implemented
//    public void brake();
//}
//
////
//package abstraction;
//
//public interface ElectricCar {
//	public void battery ();
//	
//}
////
//package abstraction;
//
//public abstract class FlexCar {
//	an abstract class can be extended from abstract class
//	default and static method?
//	interface can extends or implement?
//
//}
////
//package abstraction;
//an abstract class can implement more than one interface
//
//import abstraction.Car;
//import abstraction.Drone;
//import abstraction.ElectricCar;
//import abstraction.FlyingCar;
//import abstraction.FlyingObject;
//import abstraction.Toyota;
//
//public abstract class FlyingCar implements Drone, FlyingObject { //abstract class contain abstract and non abstract method
//
//	public abstract void autopilot(); //method declared
//
//	public void flyingFeature() { //method implemented
//		System.out.println("Dreaming for a car to fly");
//	}
//}
////
//package abstraction;
//
//public class TestCar {
//
//	public static void main(String[] args) {
//		Car car = new Toyota(); //Interface Cannot be instantiated
//		car.start();
//		car.stop();
//		car.brake();
//		
//		Toyota ty = new Toyota();
//		ty.price();
//		ty.start();
//		ty.stop();
//		ty.brake();
//		
//		ty.autopilot();
//		ty.flyingFeature();
//		
//		ty.battery();
//		
//		ty.weight();
//		
//		ty.shape();
//		
//		FlyingCar fc = new Toyota();//Abstract class Cannot be instantiate
//		fc.autopilot();
//		fc.flyingFeature();
//		
//		ElectricCar ec = new Toyota();
//		ec.battery();
//		
//		Drone dr = new Toyota();
//		dr.weight();
//		
//		FlyingObject fo = new Toyota();
//		fo.shape();
//
////		
//package abstraction;
//		// here Toyota is called concrete class
//		//a class can implement more than one interface
//		// a class can extend only one abstract class
//		public class Toyota extends FlyingCar implements Car, ElectricCar{
//			public void price() {//in class, method can't be declared, can be implemented
//				System.out.println("The price for Toyota is reasonable");
//			}
//
//
//			public void start() {
//				System.out.println("Toyota ignite key to start the car");
//				
//			}
//
//			
//			public void stop() {
//				
//				System.out.println("Toyota use key to stop the car");
//			}
//
//			
//			public void brake() {
//				System.out.println("Our break is manual");
//				
//			}
//
//
//			
//			public void autopilot() {
//				System.out.println("Autopilot is still a dream for toyota");
//				
//			}
//
//
//			public void battery() {
//			
//				System.out.println("We are improving our battery");
//				
//			}
//
//
//			public void weight() {
//				System.out.println("Toyota have a research lab to improve Drone's weight");
//				
//			}
//
//
//			public void shape() {
//				System.out.println("We are not thiking about flying object research now");
//				
//			}
//
//		}
//		
