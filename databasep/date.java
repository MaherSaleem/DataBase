package databasep;

public class date {
	
	
	int day;
	int month;
	int year;
	
	


	/**
	 * Constructor
	 * @param day
	 * @param month
	 * @param year
	 */
	public date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}


	/**
	 * @return the day
	 */
	public int getDay() {
		return day;
	}


	/**
	 * @param day the day to set
	 */
	public void setDay(int day) {
		this.day = day;
	}


	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}


	/**
	 * @param month the month to set
	 */
	public void setMonth(int month) {
		this.month = month;
	}


	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}


	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	
	
	@Override
	public String toString(){
		return String.format("%d-%d-%d", this.year , this.month , this.day);
	}
	
	
	
	
}
