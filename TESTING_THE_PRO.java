import java.io.ObjectInputStream.GetField;


public class TESTING_THE_PRO {

	public static void main(String[] args) {
		ConnectToDataBase.go();
//		Test t = new Test(99, "ahmad");
//		Test.addToDataBase(t);
//		
//		LabWorker L = new LabWorker();
//		L.setEid(1311);
//		L.setLid(8);
//		L.setDid(MyFunctions.getRealValueInt(""));
//		LabWorker.insertToDatabase(L);
//		
//		Office o = new Office(10 , 9 , 9);
//		Office.insertToDatabase(o);
		
//		RegulerRoom R = new RegulerRoom();
//		R.setRid(13);
//		R.setNoBed(20);
//		RegulerRoom.insertToDatabase(R);
		
		
//		Patient p = new Patient();
//		p.setPid(5);
//		p.setGender('c');
//		p.setDateOfBirth(new date(10, 12, 2015));
//		Patient.insertToDatabase(p);
		
//		Patient_Med P_M = new Patient_Med();
//		P_M.setMid(1);
//		P_M.setPid(5);
//		P_M.setEid(11);
//		P_M.setDat(new date(10, 12, 2015));
//		Patient_Med.insertToDataBase(P_M);
		
//		Patient_Test P_T = new Patient_Test(5,11 ,8 ,new date(10, 12, 2015));
//		Patient_Test.insertToDataBase(P_T);
		
		
		Medicine M = new Medicine(11, "acamool", 10);
		Medicine.insertToDataBase(M);
	}
}
