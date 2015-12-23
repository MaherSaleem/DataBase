
public class Employee {
	int eid ;
	String ename;
	int did;
	date dbirth;
	int sallary;
	int cid ;
	int superviseid;
	int rid;
	public Employee() {
		super();
	}
	public Employee(int eid, String ename, int did, date dbirth, int sallary, int cid, int superviseid, int rid) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.did = did;
		this.dbirth = dbirth;
		this.sallary = sallary;
		this.cid = cid;
		this.superviseid = superviseid;
		this.rid = rid;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public date getDbirth() {
		return dbirth;
	}
	public void setDbirth(date dbirth) {
		this.dbirth = dbirth;
	}
	public int getSallary() {
		return sallary;
	}
	public void setSallary(int sallary) {
		this.sallary = sallary;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getSuperviseid() {
		return superviseid;
	}
	public void setSuperviseid(int superviseid) {
		this.superviseid = superviseid;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	
	public static void insertToDatabase() {
		//To Do
	}
	public static void deletToDatabase() {
		//To Do
	}

}
