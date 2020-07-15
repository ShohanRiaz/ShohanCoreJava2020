package inheritance;
//Test Family Class
public class FamilyHierarchy {

	public static void main(String[] args) {
		GrandFather gf = new GrandFather();
		//gf.grandFatherInfo();
		
		GrandFather gf2 = new GrandFather("Mohammad", 78, 'W', false);
		
		
		Father fa = new Father();
		fa.fatherInfo();
		fa.grandFatherInfo();
		
		Uncle un = new Uncle();
		un.uncleInfo();
		un.grandFatherInfo();
		
		Aunt au = new Aunt();
		au.auntInfo();
		au.grandFatherInfo();
		
		Son sn = new Son();
		sn.sonInfo();
		sn.fatherInfo();
		sn.grandFatherInfo();
		
		Cousin co = new Cousin();
		co.cousinInfo();
		co.uncleInfo();
		co.grandFatherInfo();
		
		GrandSon gs = new GrandSon();
		gs.grandSonInfo();
		gs.sonInfo();
		gs.fatherInfo();
		gs.grandFatherInfo();
		
		GrandDaughter gd = new GrandDaughter();
		gd.grandDaughterInfo();
		gd.sonInfo();
		gd.fatherInfo();
		gd.grandFatherInfo();
		
	}

}
/* 
 1. GrandFather = Super Class or parent class and rest of the classes are sub class or child class
 2. Father extends Grandfather, Uncle extends Grandfather, Aunt extends Grandfather - they are called 'Hierarchical' inheritance
 3. Son extends Father,  - this is called 'Single' inheritance
 4. GrandSon Extends son, Son extends father, Father extends GrandFather - they are called ' Multilevel inheritance
 
 
 */








