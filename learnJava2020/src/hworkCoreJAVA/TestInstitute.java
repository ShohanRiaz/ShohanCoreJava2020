package hworkCoreJAVA;

public class TestInstitute {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColumbiaUniversity colUni = new ColumbiaUniversity();
		colUni.anatomyLab();
		colUni.anthropology();
		colUni.biochemistryLab();
		colUni.cafeteria();
		colUni.caring();
		colUni.chemistry();
		colUni.classSize();
		colUni.commonRoom();
		colUni.computerLab();
		colUni.dorm();
		colUni.emergencyRoom();
		colUni.field();
		colUni.gymnasium();
		colUni.hygiene();
		colUni.laboratory();
		colUni.languageClub();
		colUni.morgue();
		colUni.maths();
		colUni.mechanicalLab();
		colUni.surgeryRoom();
		colUni.teacher();
		colUni.aeronauticalInfo();
		
		VocationalSchool vocSch = new ColumbiaUniversity ();
		vocSch.vocationalInfo();
		
		AeronauticalSchool aerSch = new RockefellerUniversity ();
		aerSch.aeronauticalInfo();
		
		RockefellerUniversity rocUni = new RockefellerUniversity();
		rocUni.aeronauticalInfo();
		rocUni.anthropology();
		rocUni.computerLab();
		rocUni.maths();
		rocUni.mechanicalLab();
		
		University uni = new ColumbiaUniversity ();
		uni.cafeteria();
		uni.classSize();
		uni.commonRoom();
		uni.dorm();
		uni.emergencyRoom();
		uni.field();
		uni.gymnasium();
		uni.laboratory();
		uni.languageClub();
		uni.morgue();
		uni.surgeryRoom();
		uni.teacher();
		
		
	}

}