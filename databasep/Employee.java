package databasep;
import javax.swing.JOptionPane;

import com.mysql.jdbc.PreparedStatement;

public class Employee {
	Integer eid;
	String ename;
	Integer did;
	int type;
	date ebirth;
	int sallary;
	Integer cid;
	int superviseid;
	Integer rid;
	
	//assign them the index of the combo box
	final static int DOCTOR =0;
	final static int NURSE =0;
	final static int LAB_WORKER =0;

	public Employee() {
		super();
	}

	

	/**
	 * @param eid
	 * @param ename
	 * @param did
	 * @param ebirth
	 * @param sallary
	 * @param cid
	 * @param superviseid
	 * @param rid
	 */
	public Employee(Integer eid, String ename, Integer did,int type, date ebirth,
			int sallary, Integer cid, int superviseid, Integer rid) {
		this.eid = eid;
		this.ename = ename;
		this.did = did;
		this.ebirth = ebirth;
		this.sallary = sallary;
		this.cid = cid;
		this.superviseid = superviseid;
		this.rid = rid;
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
	 * @return the ename
	 */
	public String getEname() {
		return ename;
	}



	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}



	/**
	 * @param type the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}



	/**
	 * @param ename the ename to set
	 */
	public void setEname(String ename) {
		this.ename = ename;
	}



	/**
	 * @return the did
	 */
	public Integer getDid() {
		return did;
	}



	/**
	 * @param did the did to set
	 */
	public void setDid(Integer did) {
		this.did = did;
	}



	/**
	 * @return the ebirth
	 */
	public date getEbirth() {
		return ebirth;
	}



	/**
	 * @param ebirth the ebirth to set
	 */
	public void setEbirth(date ebirth) {
		this.ebirth = ebirth;
	}



	/**
	 * @return the sallary
	 */
	public int getSallary() {
		return sallary;
	}



	/**
	 * @param sallary the sallary to set
	 */
	public void setSallary(int sallary) {
		this.sallary = sallary;
	}



	/**
	 * @return the cid
	 */
	public Integer getCid() {
		return cid;
	}



	/**
	 * @param cid the cid to set
	 */
	public void setCid(Integer cid) {
		this.cid = cid;
	}



	/**
	 * @return the superviseid
	 */
	public int getSuperviseid() {
		return superviseid;
	}



	/**
	 * @param superviseid the superviseid to set
	 */
	public void setSuperviseid(int superviseid) {
		this.superviseid = superviseid;
	}



	/**
	 * @return the rid
	 */
	public Integer getRid() {
		return rid;
	}



	/**
	 * @param rid the rid to set
	 */
	public void setRid(Integer rid) {
		this.rid = rid;
	}



	public static void insertToDatabase(Employee e) {
		try {
			ConnectToDataBase.st
					.execute(String
							.format("INSERT INTO `hospital`.`employee` "
									+ "(`Eid`, `Ename`, `did`, `salary`, `cid`, `supervise_eid`, `rid`) "
									+ "VALUES ('%d', '%s', %d , %d, %d, %d , %d  )",
									e.eid , e.ename , e.did   , e.sallary , e.cid , e.superviseid , e.rid));

		}
		catch (Exception ex) {
			JOptionPane.showMessageDialog(null,
					"there in and error with insearting this employee");
//			ex.printStackTrace();
		}

	}

	public static void deletToDatabase() {
		// To Do
	}

}
