
public class Manage {
	int eid ;
	int did;
	date starteDate ;
	date enddate ;
	public Manage(int eid, int did, date starteDate, date enddate) {
		super();
		this.eid = eid;
		this.did = did;
		this.starteDate = starteDate;
		this.enddate = enddate;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public date getStarteDate() {
		return starteDate;
	}
	public void setStarteDate(date starteDate) {
		this.starteDate = starteDate;
	}
	public date getEnddate() {
		return enddate;
	}
	public void setEnddate(date enddate) {
		this.enddate = enddate;
	}
	
	public static void insertToDatabase() {
		//To Do
	}
	public static void deletToDatabase() {
		//To Do
	}
	

}
