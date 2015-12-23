
public class Test {

	int Tid;
	String Tname;
	
	/**
	 * @param tid
	 * @param tname
	 */
	public Test(int tid, String tname) {
		Tid = tid;
		Tname = tname;
	}

	/**
	 * @return the tid
	 */
	public int getTid() {
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
	
	
	static void addToDataBase(){
		//TODO (insert statement will be put here)
	}
	
	static  void deleteFromDataBase(){
		//TODO
	}
	
	
}
