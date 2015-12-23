
public class Patient_Med {

	int Pid;
	int Eid;
	int Mid;
	date dat;
	int quantity;
	
	/**
	 * Constructor
	 * @param pid
	 * @param eid
	 * @param mid
	 * @param dat
	 * @param quantity
	 */
	public Patient_Med(int pid, int eid, int mid, date dat, int quantity) {
		Pid = pid;
		Eid = eid;
		Mid = mid;
		this.dat = dat;
		this.quantity = quantity;
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
	 * @return the mid
	 */
	public int getMid() {
		return Mid;
	}

	/**
	 * @param mid the mid to set
	 */
	public void setMid(int mid) {
		Mid = mid;
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
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Patient_Med [Pid=" + Pid + ", Eid=" + Eid + ", Mid=" + Mid
				+ ", dat=" + dat + ", quantity=" + quantity + "]";
	}
	
	
	static void addToDataBase(){
		//TODO (insert statement will be put here)
	}
	
	static  void deleteFromDataBase(){
		//TODO
	}
	
	
	
}
