
public class Manage {
	int eid ;
	Integer did;
	date starteDate ;
	date enddate ;

	
	
	public Manage(){
		
	}
	/**
	 * @param eid
	 * @param did
	 * @param starteDate
	 * @param enddate
	 */
	public Manage(int eid, Integer did, date starteDate, date enddate) {
		super();
		this.eid = eid;
		this.did = did;
		this.starteDate = starteDate;
		this.enddate = enddate;
	}
	
	
	
	/**
	 * @return the eid
	 */
	public int getEid() {
		return eid;
	}



	/**
	 * @param eid the eid to set
	 */
	public void setEid(int eid) {
		this.eid = eid;
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
	 * @return the starteDate
	 */
	public date getStarteDate() {
		return starteDate;
	}



	/**
	 * @param starteDate the starteDate to set
	 */
	public void setStarteDate(date starteDate) {
		this.starteDate = starteDate;
	}



	/**
	 * @return the enddate
	 */
	public date getEnddate() {
		return enddate;
	}



	/**
	 * @param enddate the enddate to set
	 */
	public void setEnddate(date enddate) {
		this.enddate = enddate;
	}



	public static void insertToDatabase() {
		
	}
	public static void deletToDatabase() {
		//To Do
	}
	

}
