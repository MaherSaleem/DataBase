import javax.swing.JOptionPane;


public class Patient {
	Integer pid ;
	String pname;
	char gender;
	date dateOfBirth;
	String bloadType; 
	
	
	public Patient() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param pid
	 * @param pname
	 * @param gender
	 */
	public Patient(Integer pid, String pname, char gender) {
		this.pid = pid;
		this.pname = pname;
		this.gender = gender;
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
	
	
	
	/**
	 * @return the dateOfBirth
	 */
	public date getDateOfBirth() {
		return dateOfBirth;
	}
	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	/**
	 * @return the bloadType
	 */
	public String getBloadType() {
		return bloadType;
	}
	/**
	 * @param bloadType the bloadType to set
	 */
	public void setBloadType(String bloadType) {
		this.bloadType = bloadType;
	}
	public static void insertToDatabase(Patient p) {
		
		try {
			ConnectToDataBase.st.execute(String.format(
					"INSERT INTO `hospital`.`patient`"
					+ " (`pid`, `pname`, `gender`, `dateOfBirth`, `bload_type`) "
					+ "VALUES ('%d', '%s', '%c', '%s', '%s' )", p.pid ,
							p.pname , p.gender , p.dateOfBirth.toString() ,p.bloadType ));

		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"there in and error with insearting this patient");
//			System.out.println(e.getMessage().toString());
			e.printStackTrace();
		}

	}

	public static void deletToDatabase() {
		// TODO
	}

	
}
