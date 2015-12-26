package databasep;

public class MyFunctions {
	
	
	/*
	 * to be used when we read a text from textbox
	 */
	static Integer getRealValueInt(String s){
		if (s == null) return null;
		s=s.trim();
		if(s.isEmpty()) return null;//"" string (to add it as NULL in datebase)
		return Integer.parseInt(s);	
	}
}
