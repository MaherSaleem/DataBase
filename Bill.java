
/**
 * @author Maher
 *
 */
public class Bill {
	int pid;
	int did;
	date dat;
	double amount;
	
	
	/**
	 * Constructor
	 * @param pid
	 * @param did
	 * @param dat
	 * @param amount
	 */
	public Bill(int pid, int did, date dat, double amount) {
		this.pid = pid;
		this.did = did;
		this.dat = dat;
		this.amount = amount;
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
	 * @return the did
	 */
	public int getDid() {
		return did;
	}


	/**
	 * @param did the did to set
	 */
	public void setDid(int did) {
		this.did = did;
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
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}


	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Bill [pid=" + pid + ", did=" + did + ", dat=" + dat
				+ ", amount=" + amount + "]";
	}


	static void addToDataBase(){
		//TODO (insert statement will be put here)
	}
	
	static  void deleteFromDataBase(){
		//TODO
	}
	
	
	
	
	
	
}
