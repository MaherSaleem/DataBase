import javax.swing.JOptionPane;

public class Patient_Test {

	Integer Pid;
	Integer Eid;
	Integer Tid;
	date dat;

	public Patient_Test() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param pid
	 * @param eid
	 * @param tid
	 * @param dat
	 */
	public Patient_Test(Integer pid, Integer eid, Integer tid, date dat) {
		super();
		Pid = pid;
		Eid = eid;
		Tid = tid;
		this.dat = dat;
	}

	/**
	 * @return the pid
	 */
	public Integer getPid() {
		return Pid;
	}

	/**
	 * @param pid
	 *            the pid to set
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
	 * @param eid
	 *            the eid to set
	 */
	public void setEid(Integer eid) {
		Eid = eid;
	}

	/**
	 * @return the tid
	 */
	public Integer getTid() {
		return Tid;
	}

	/**
	 * @param tid
	 *            the tid to set
	 */
	public void setTid(Integer tid) {
		Tid = tid;
	}

	/**
	 * @return the dat
	 */
	public date getDat() {
		return dat;
	}

	/**
	 * @param dat
	 *            the dat to set
	 */
	public void setDat(date dat) {
		this.dat = dat;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Patient_Test [Pid=" + Pid + ", Eid=" + Eid + ", Tid=" + Tid
				+ ", dat=" + dat + "]";
	}

	static void insertToDataBase(Patient_Test p) {
		try {

			ConnectToDataBase.st.execute(String.format(
					"INSERT INTO `hospital`.`patient_test` "
					+ "(`pid`, `tid`, `eid`, `date`) "
					+ "VALUES (%d, %d, %d, '%s')" ,
					p.Pid, p.Tid,p.Eid, p.dat.toString()));

		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"there in and error with insearting this pateint test");
			e.printStackTrace();
		}
	}

	static void deleteFromDataBase() {
		// TODO
	}

}
