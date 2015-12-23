import javax.swing.JOptionPane;

public class City {
	int cid;
	String cname;

	public City(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}

	public City() {
		super();
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	static void addToDataBase(City c) {
		try {
			ConnectToDataBase.st.execute(String.format(
					"INSERT INTO `hospital`.`city` (`cid`, `cname`)"
							+ " VALUES (%d, '%s')", c.cid, c.cname));

		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"there in and error with insearting this city");
		}

	}

	static void deleteFromDataBase() {
		// TODO
	}
}
