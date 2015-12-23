
public class Patient_Test {

	int Pid;
	int Eid;
	int Tid;
	date dat;
	
	
	/**
	 * Constructor
	 * @param pid
	 * @param eid
	 * @param tid
	 * @param dat
	 */
	public Patient_Test(int pid, int eid, int tid, date dat) {
		Pid = pid;
		Eid = eid;
		Tid = tid;
		this.dat = dat;
	}


	/**
	 * @return the pid
	 */
	public int getPid() {
		return Pid;
	}


	/**
	 * @param pid the pid to set
	 */
	public void setPid(int pid) {
		Pid = pid;
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
	 * @return the tid
	 */
	public int getTid() {
		return Tid;
	}


	/**
	 * @param tid the tid to set
	 */
	public void setTid(int tid) {
		Tid = tid;
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
	
	
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Patient_Test [Pid=" + Pid + ", Eid=" + Eid + ", Tid=" + Tid
				+ ", dat=" + dat + "]";
	}


	static void addToDataBase(){
		//TODO (insert statement will be put here)
	}
	
	static  void deleteFromDataBase(){
		//TODO
	}
	
	
}
