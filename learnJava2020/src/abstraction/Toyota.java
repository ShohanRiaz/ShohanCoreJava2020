package abstraction;

public class Toyota extends FlyingCar implements Car, Lirr{//  a class can implement more than one interface 
	public void price() {// curly brace represent that method is implemented, in a class method is implemented, method can NOT be declared
		System.out.println("Price is reasonable");
	}

@Override
public void license() {
	System.out.println("License NO: ");
	
}

@Override
public void taxi() {
	System.out.println("Taxi");
	
}

@Override
public void start() {
	System.out.println("Start");
	
}

@Override
public void stop() {
	System.out.println("Stop");
}

@Override
public void flyingFeature() {
	System.out.println("Fly");
	
}

@Override
public void station() {
	System.out.println("Lirr Station");
	
}

@Override
public void track() {
	 System.out.println("Metro North Track");
	
}

@Override
public void marta() {
	 System.out.println("MARTA");
	
}

@Override
public void nissan() {
	System.out.println("Sentra");
	
}
	
	

}
