package databasep;
import javax.swing.JOptionPane;


public class Test {

	Integer Tid;
	String Tname;
	
	/**
	 * @param tid
	 * @param tname
	 */
	public Test(Integer tid, String tname) {
		Tid = tid;
		Tname = tname;
	}

	/**
	 * @return the tid
	 */
	public Integer getTid() {
		return Tid;
	}

	/**
	 * @param tid the tid to set
	 */
	public void setTid(int tid) {
		Tid = tid;
	}

	/**
	 * @return the tname
	 */
	public String getTname() {
		return Tname;
	}

	/**
	 * @param tname the tname to set
	 */
	public void setTname(String tname) {
		Tname = tname;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Test [Tid=" + Tid + ", Tname=" + Tname + "]";
	}
	
	
	static void addToDataBase(Test t){
		try{
			ConnectToDataBase.st.execute(
					String.format(
							"INSERT INTO `test` (`tid`, `tname`) VALUES (%d, '%s')" ,t.Tid , t.Tname));
			
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, "there in and error with insearting this test");
		}

	}
	
	static  void deleteFromDataBase(){
		//TODO
	}
	
	
}
