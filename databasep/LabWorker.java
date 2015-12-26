package databasep;
import javax.swing.JOptionPane;

public class LabWorker extends Employee {
	// int eid;
	Integer lid;

	public LabWorker() {
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
	public LabWorker(Integer eid, String ename, Integer did, date ebirth,
			int sallary, Integer cid, int superviseid, Integer rid, Integer lid) {
		super(eid, ename, did, ebirth, sallary, cid, superviseid, rid );
		// TODO Auto-generated constructor stub
		this.lid = lid;
	}
	
	






	/**
	 * @return the lid
	 */
	public Integer getLid() {
		return lid;
	}






	/**
	 * @param lid the lid to set
	 */
	public void setLid(Integer lid) {
		this.lid = lid;
	}






	public static void insertToDatabase(LabWorker em) {
		try {
			// first : insert to employee first
			Employee.insertToDatabase(em);

			// second :insert into labworker table
			ConnectToDataBase.st.execute(String.format(
					"INSERT INTO `hospital`.`lab_worker` (`eid`, `lid` ) "
							+ "VALUES ('%d', '%d')", em.eid, em.lid));

		}

		catch (Exception ex) {
			JOptionPane.showMessageDialog(null,
					"there in and error with insearting this employee");

		}
	}

	public static void deletToDatabase() {
		// To Do
	}
}
