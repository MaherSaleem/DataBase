import java.io.ObjectInputStream.GetField;


public class TESTING_THE_PRO {

	public static void main(String[] args) {
		ConnectToDataBase.go();
		Test t = new Test(99, "ahmad");
		Test.addToDataBase(t);
		
		LabWorker L = new LabWorker();
		L.setEid(130);
		L.setLid(8);
		L.setDid(MyFunctions.getRealValueInt(""));
		LabWorker.insertToDatabase(L);
		
	}
}
