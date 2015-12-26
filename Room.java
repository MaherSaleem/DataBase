import javax.swing.JOptionPane;


public class Room {
	
	
	Integer rid ;
	Integer did ;
	
	
	
	public Room(){}
	/**
	 * @param rid
	 * @param did
	 */
	public Room(Integer rid, Integer did) {
		super();
		this.rid = rid;
		this.did = did;
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
	public void setRid(int rid) {
		this.rid = rid;
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



	public static void insertToDatabase(Room r) {
		try {
			ConnectToDataBase.st.execute(String.format(
					"INSERT INTO `hospital`.`room` (`rid`, `did`) "
					+ "VALUES ('%d', '%d')", r.rid, r.did));

		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"there in and error with insearting this room");
			e.printStackTrace();
		}


	}
	public static void deletToDatabase() {
		//To Do
	}
	

}
