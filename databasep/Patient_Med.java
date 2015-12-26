package databasep;
import javax.swing.JOptionPane;


public class Patient_Med {

	Integer Pid;
	Integer Eid;
	Integer Mid;
	date dat;
	Integer quantity;
	
	
	public Patient_Med() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param pid
	 * @param eid
	 * @param mid
	 * @param dat
	 * @param quantity
	 */
	public Patient_Med(Integer pid, Integer eid, Integer mid, date dat,
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
	public Integer getPid() {
		return Pid;
	}





	/**
	 * @param pid the pid to set
	 */
	public void setPid(Integer pid) {
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
	
	
	static void insertToDataBase(Patient_Med p){
		
		try {
			
			
			ConnectToDataBase.st.execute(String.format(
					"INSERT INTO `hospital`.`pat-med` (`pid`, `eid`, `mid`, `date`, `quantity`)"
					+ " VALUES (%d, %d, %d, '%s', %d)" ,p.Pid , p.Eid , p.Mid  , p.dat , p.quantity ));

		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"there in and error with insearting this pateint medicine");
			e.printStackTrace();
		}
	}
	
	static  void deleteFromDataBase(){
		//TODO
	}
	
	
	
}
