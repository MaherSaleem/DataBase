
public class Office  extends Room{

	 int rid ;
	 int eid;
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public Office(int rid, int did , int eid) {
		super(rid, did);
		this.eid= eid ;
		}
	
	public static void insertToDatabase() {
		//To Do
	}
	public static void deletToDatabase() {
		//To Do
	}
	

}
