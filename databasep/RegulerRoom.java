package databasep;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;


public class RegulerRoom extends Room{
	Integer noBed ;

	
	public RegulerRoom() {
		// TODO Auto-generated constructor stub
	}
	
	public RegulerRoom(Integer rid, Integer did, Integer noBed) {
		super(rid, did);
		this.noBed= noBed;
		// TODO Auto-generated constructor stub
	}

	public Integer getNoBed() {
		return noBed;
	}

	public void setNoBed(Integer noBed) {
		this.noBed = noBed;
	}
	
	public static void insertToDatabase(RegulerRoom R) {
		try{
			
			Room.insertToDatabase(R);
			
			ConnectToDataBase.st.execute(
					String.format(
							"INSERT INTO `hospital`.`regular_room` "
							+ "(`rid`, `numOfBeds`) VALUES (%d, %d)"  , R.rid , R.noBed));
			
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, "there in and error with insearting this Room");
			e.printStackTrace();
		}
	}
	public static void deletToDatabase() {
		//TODO
	}
	
	public static String [] getrooms() throws SQLException{
		
		ArrayList<String> a = new ArrayList<String>();
		ConnectToDataBase.rs = ConnectToDataBase.st.executeQuery(
				String.format("SELECT * FROM `regular_room`"));
		
		ResultSet r = ConnectToDataBase.rs;
		while(r.next()){
			a.add(r.getInt("rid") + " ") ;
		}
		
		String resultArray [] = new String [a.size()];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = a.get(i);
		}
		System.out.println(Arrays.toString(resultArray));
		return resultArray;
	}

	

}
