
public class Patient {
	int pid ;
	String pname;
	char gender;
	
	
	/**
	 * @param pid
	 * @param pname
	 * @param gender
	 */
	public Patient(int pid, String pname, char gender) {
		this.pid = pid;
		this.pname = pname;
		this.gender = gender;
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
	 * @return the pname
	 */
	public String getPname() {
		return pname;
	}


	/**
	 * @param pname the pname to set
	 */
	public void setPname(String pname) {
		this.pname = pname;
	}


	/**
	 * @return the gender
	 */
	public char getGender() {
		return gender;
	}


	/**
	 * @param gender the gender to set
	 */
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	
	public static void insertToDatabase() {
		// TODO
	}

	public static void deletToDatabase() {
		// TODO
	}

	
}
