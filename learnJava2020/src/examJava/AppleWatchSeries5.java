package examJava;

public class AppleWatchSeries5 extends AppleWatch implements Watch, DigitalWatch{

	@Override
	public void digital() {
		// TODO Auto-generated method stub
		System.out.println("Digital watches are easy to read");
	}

	@Override
	public void analog() {
		// TODO Auto-generated method stub
		System.out.println("Analog watches look nice");
	}

	@Override
	public void appleWatchInfo() {
		// TODO Auto-generated method stub
		System.out.println("New Apple watches have virual SIM");
	}

}
