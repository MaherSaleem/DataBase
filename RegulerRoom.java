
public class RegulerRoom extends Room{
	int noBed ;

	public RegulerRoom(int rid, int did, int noBed) {
		super(rid, did);
		this.noBed= noBed;
		// TODO Auto-generated constructor stub
	}

	public int getNoBed() {
		return noBed;
	}

	public void setNoBed(int noBed) {
		this.noBed = noBed;
	}
	
	public static void insertToDatabase() {
		//To Do
	}
	public static void deletToDatabase() {
		//To Do
	}
	

}
