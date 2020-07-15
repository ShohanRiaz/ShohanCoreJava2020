package hworkCoreJAVA;

public abstract class EngineeringSchool extends NYUniversity {
	public EngineeringSchool() {
		System.out.println("This is from default constructor of EngineeringSchool");
	}
	public void mechanicalLab() {
		System.out.println("Mechanical Lab");
	}
	public abstract void computerLab();

}
