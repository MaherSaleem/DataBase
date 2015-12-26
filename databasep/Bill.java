package databasep;
import javax.swing.JOptionPane;

import com.mysql.jdbc.PreparedStatement;


/**
 * @author Maher
 *
 */
public class Bill {
	Integer pid;
	Integer eid;
	date dat;
	double amount;
	
	
	
	public Bill(){
		
	}
	
	/**
	 * @param pid
	 * @param eid
	 * @param dat
	 * @param amount
	 */
	public Bill(Integer pid, Integer eid, date dat, double amount) {
		this.pid = pid;
		this.eid = eid;
		this.dat = dat;
		this.amount = amount;
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
		return eid;
	}





	/**
	 * @param eid the eid to set
	 */
	public void setEid(Integer eid) {
		this.eid = eid;
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
		return "Bill [pid=" + pid + ", did=" + eid + ", dat=" + dat
				+ ", amount=" + amount + "]";
	}


	static void addToDataBase(Bill b){
		try{
		
		ConnectToDataBase.st.execute(
				String.format(
						"INSERT INTO `hospital`.`bill` (`pid`, `eid`, `date`, `amount`) "
						+ "VALUES ('%d', '%d', '%s', %d)" ,b.pid, b.eid , b.dat , b.amount));
		
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, "there in and error with insearting this bill");
		}

		//
	}
	static  void deleteFromDataBase(){
		//TODO
	}
	
	
	
	
	
	
}
