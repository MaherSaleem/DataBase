
public class Medicine {
	Integer mid;
	String mname;
	int price;
	
	
	
	public Medicine() {
	}
	/**
	 * Constructor
	 * @param mid
	 * @param mname
	 * @param price
	 */
	public Medicine(Integer mid, String mname, int price) {
		this.mid = mid;
		this.mname = mname;
		this.price = price;
	}


	/**
	 * @return the mid
	 */
	public Integer getMid() {
		return mid;
	}


	/**
	 * @param mid the mid to set
	 */
	public void setMid(Integer mid) {
		this.mid = mid;
	}


	/**
	 * @return the mname
	 */
	public String getMname() {
		return mname;
	}


	/**
	 * @param mname the mname to set
	 */
	public void setMname(String mname) {
		this.mname = mname;
	}


	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Medicine [mid=" + mid + ", mname=" + mname + ", price=" + price
				+ "]";
	}
	
	
	static void addToDataBase(){
		//TODO (insert statement will be put here)
	}
	
	static  void deleteFromDataBase(){
		//TODO
	}
	
	
	
}
