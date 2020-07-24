package examJava;

public class Iphone1 extends Samsung implements Phone{
	

		private int price;
		private String info;
		private char grade;
		private boolean madeInUSA;
		
		public Iphone1() {
		}
		
		public Iphone1( int price, String info, char grade, boolean madeInUSA) {
			this.price = price;
			this.info = info;
			this.grade = grade;
			this.madeInUSA = madeInUSA;
			System.out.println("My phone info: " + price + " " + info + " "+ grade + " "+ madeInUSA);
		}
		

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public String getInfo() {
			return info;
		}

		public void setInfo(String info) {
			this.info = info;
		}

		public char getGrade() {
			return grade;
		}

		public void setGrade(char grade) {
			this.grade = grade;
		}

		public boolean isMadeInUSA() {
			return madeInUSA;
		}

		public void setMadeInUSA(boolean madeInUSA) {
			this.madeInUSA = madeInUSA;
		}




		public void regularClassInfo () {
			System.out.println("Features of Regular Class:\n Regular class name starts with uppercase \n Can have only non abstract methods \n Methods can only be implemented here NOT declared \n Can extend only one abstract class or a regular class \n Can implement many interfaces");
		}

		@Override
		public void interfaceInfo() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void call() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void message() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void camera() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void galaxyS10() {
			// TODO Auto-generated method stub
			
		}
		
}
