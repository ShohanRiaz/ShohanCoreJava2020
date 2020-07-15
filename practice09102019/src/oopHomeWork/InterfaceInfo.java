package oopHomeWork;

public class InterfaceInfo extends Battery implements Call, Message, Camera {

	@Override
	public void tripleCamera() {
		System.out.println("Takes wideangle pics");
		
	}

	@Override
	public void MMS() {
		System.out.println("Send picture messages");
		
	}

	@Override
	public void autoDial() {
		System.out.println("Can call upto six persons");
		
	}

	@Override
	public void battery() {
		System.out.println("An abstract or regular class extend to only one reular or abstract class but can implement more than one interface class");
		
	}

	@Override
	public void wireless() {
		System.out.println("Whereas, an interface class can extend to more than one interface class");
		
	}

}
