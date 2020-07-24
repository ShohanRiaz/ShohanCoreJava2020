package examJava;

public class Iphone6 {
	public int materials(int ramPrice, int cameraPrice) {
		int total = ramPrice+ cameraPrice;
		System.out.println("Price of RAM and Camera: "+ total);
		return total;
	}
	// we can use method overloading process here
	public int materials(int ramPrice, int cameraPrice,String ProcessorPrice) {
		int total = ramPrice+ cameraPrice+ (Integer.parseInt(ProcessorPrice));
		System.out.println("Price of RAM, Camera and Processor: "+ total);
		return total;
	}
	// we can use final and static methods here
}
