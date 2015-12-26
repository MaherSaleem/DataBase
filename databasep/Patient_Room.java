package databasep;

public class Patient_Room {

	Integer pid;
	Integer Eid;
	Integer Rid;
	date dat;
	date endDate;
	
	
	
	public Patient_Room() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param pid
	 * @param eid
	 * @param rid
	 * @param dat
	 * @param endDate
	 */
	public Patient_Room(Integer pid, Integer eid, Integer rid, date dat,
			date endDate) {
		super();
		this.pid = pid;
		Eid = eid;
		Rid = rid;
		this.dat = dat;
		this.endDate = endDate;
	}

	
	

	/**
	 * @return the pid
	 */
	public Integer getPid() {
		return pid;
	}




	/**
	 * @param pid the pid to set
	 */
	public void setPid(Integer pid) {
		this.pid = pid;
	}




	/**
	 * @return the eid
	 */
	public Integer getEid() {
		return Eid;
	}




	/**
	 * @param eid the eid to set
	 */
	public void setEid(Integer eid) {
		Eid = eid;
	}




	/**
	 * @return the rid
	 */
	public Integer getRid() {
		return Rid;
	}




	/**
	 * @param rid the rid to set
	 */
	public void setRid(Integer rid) {
		Rid = rid;
	}




	/**
	 * @return the dat
	 */
	public date getDat() {
		return dat;
	}




	/**
	 * @param dat the dat to set
	 */
	public void setDat(date dat) {
		this.dat = dat;
	}




	/**
	 * @return the endDate
	 */
	public date getEndDate() {
		return endDate;
	}




	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(date endDate) {
		this.endDate = endDate;
	}




	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Patient_Room [pid=" + pid + ", Eid=" + Eid + ", Rid=" + Rid
				+ ", dat=" + dat + ", endDate=" + endDate + "]";
	}
	
	
	static void addToDataBase(){
		//TODO (insert statement will be put here)
	}
	
	static  void deleteFromDataBase(){
		//TODO
	}
	
}
