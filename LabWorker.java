
public class LabWorker extends Employee{
	int eid ;
	int lid ;
	public LabWorker(int eid, String ename, int did, date dbirth, int sallary, int cid, int superviseid, int rid , int lid) {
		super(eid, ename, did, dbirth, sallary, cid, superviseid, rid);
		this.lid = lid;
		// TODO Auto-generated constructor stub
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	
	
	
	
	public static void insertToDatabase() {
		//To Do
	}
	public static void deletToDatabase() {
		//To Do
	}
}
