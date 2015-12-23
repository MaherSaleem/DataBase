import javax.swing.JOptionPane;

public class Department {
	int did;
	String dname;

	
	
	public Department(){
		
	}
	
	public Department(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public static void insertToDatabase(Department d) {
		try {
			ConnectToDataBase.st.execute(String.format(
					"INSERT INTO `hospital`.`departement` (`did`, `dname`) "
							+ "VALUES ('%d', '%s')", d.did, d.dname));

		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"there in and error with insearting this dep");
		}

	}

	public static void deletToDatabase() {
		// TODO
	}
}
