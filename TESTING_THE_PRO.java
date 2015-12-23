
public class TESTING_THE_PRO {

	public static void main(String[] args) {
		ConnectToDataBase.go();
		Test t = new Test(8, "ali");
		Test.addToDataBase(t);
	}
}
