package shohan;

public class Casino {

public String Jackpot;
public int winningNumber;
public double prizeMoney;

public Casino(){
	System.out.println("Constructor called");
}

public Casino(String Jackpot, int winningNumber, double prizeMoney) {
	this.Jackpot = Jackpot;
	this.winningNumber = winningNumber;
	this.prizeMoney = prizeMoney;
	System.out.println("Tomorrow's info " +Jackpot + winningNumber + prizeMoney);
}

public void goToCasino() {
	System.out.println("Today's info " +Jackpot + winningNumber + prizeMoney);
}


public static void main(String[] args) {
Casino c1 = new Casino();
c1.Jackpot = "million";
c1.winningNumber = 12;
c1.prizeMoney = 100000;
c1.goToCasino();

Casino c2 = new Casino("Gillion", 19, 3645589);
c2.Jackpot = "billion";
c2.winningNumber = 14;
c2.prizeMoney = 200000;
c2.goToCasino();

Casino c3 = new Casino();
c3.Jackpot = "trillion";
c3.winningNumber = 19;
c3.prizeMoney = 890000;
c3.goToCasino();





}

}