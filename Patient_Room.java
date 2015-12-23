
public class Patient_Room {

	int pid;
	int Eid;
	int Rid;
	date dat;
	date endDate;
	
	
	/**
	 * Constructor
	 * @param pid
	 * @param eid
	 * @param rid
	 * @param dat
	 * @param endDate
	 */
	public Patient_Room(int pid, int eid, int rid, date dat, date endDate) {
		this.pid = pid;
		Eid = eid;
		Rid = rid;
		this.dat = dat;
		this.endDate = endDate;
	}


	/**
	 * @return the pid
	 */
	public int getPid() {
		return pid;
	}


	/**
	 * @param pid the pid to set
	 */
	public void setPid(int pid) {
		this.pid = pid;
	}


	/**
	 * @return the eid
	 */
	public int getEid() {
		return Eid;
	}


	/**
	 * @param eid the eid to set
	 */
	public void setEid(int eid) {
		Eid = eid;
	}


	/**
	 * @return the rid
	 */
	public int getRid() {
		return Rid;
	}


	/**
	 * @param rid the rid to set
	 */
	public void setRid(int rid) {
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
