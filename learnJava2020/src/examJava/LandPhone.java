package examJava;

public class LandPhone implements Phone, Pager, Wireless{

	@Override
	public void dataTransfer() {
		// TODO Auto-generated method stub
		System.out.println("You can transfer data");
	}

	@Override
	public void callBack() {
		// TODO Auto-generated method stub
		System.out.println("You need to call back the number");
	}

	@Override
	public void interfaceInfo() {
		// TODO Auto-generated method stub
		System.out.println("Features of interface: \n The name starts with uppercase \n Can have ONLY abstract methods \n You may write 'abstract' or not \n Methods can ONLY be declared NOT implemented \n Can not extend to a regular or abstract class \n But can implement many interfaces");
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("You can make a call");
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("You can send message");
	}

	@Override
	public void camera() {
		// TODO Auto-generated method stub
		System.out.println("You can take photos");
	}

}
