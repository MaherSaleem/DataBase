import javax.swing.JOptionPane;

public class Office extends Room {

	Integer eid;

	public Office() {
		super();
	}

	
	/**
	 * @param rid
	 * @param did
	 */
	public Office(int rid, Integer did , Integer eid) {
		super(rid, did);
		this.eid = eid;
	}


	public Integer getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public Office(int rid, int did, int eid) {
		super(rid, did);
		this.eid = eid;
	}

	public static void insertToDatabase(Office o) {
		
		//
		try {
			Room.insertToDatabase(o);
			
			
			ConnectToDataBase.st.execute(String.format(
					"INSERT INTO `hospital`.`office_room` (`rid`, `eid`) "
					+ "VALUES ('%d', '%d')", o.rid, o.eid));

		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"there in and error with insearting this office");
		}

	}

	public static void deletToDatabase() {
		// To Do
	}

}
