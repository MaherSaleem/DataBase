
public class Room {
	int rid ;
	Integer did ;
	
	
	/**
	 * @param rid
	 * @param did
	 */
	public Room(int rid, Integer did) {
		super();
		this.rid = rid;
		this.did = did;
	}
	
	
	
	/**
	 * @return the rid
	 */
	public int getRid() {
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



	public static void insertToDatabase() {
		//To Do
	}
	public static void deletToDatabase() {
		//To Do
	}
	

}
