
public class Patient_Med {

	int Pid;
	Integer Eid;
	Integer Mid;
	date dat;
	Integer quantity;
	
	
	/**
	 * @param pid
	 * @param eid
	 * @param mid
	 * @param dat
	 * @param quantity
	 */
	public Patient_Med(int pid, Integer eid, Integer mid, date dat,
			Integer quantity) {
		super();
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
	 * @return the mid
	 */
	public Integer getMid() {
		return Mid;
	}





	/**
	 * @param mid the mid to set
	 */
	public void setMid(Integer mid) {
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
	public Integer getQuantity() {
		return quantity;
	}





	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(Integer quantity) {
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
