
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sara
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConnectToDataBase {

	public Connection con = null;
	public Statement st = null;// object to write sql on it
	public String url = "jdbc:mysql://localhost/hospital";
	public String user = "root";
	public String pass = "";

	// function to connect
	public void go() {

		try {
			Class.forName("com.mysql.jdbc.Driver");

		}
		catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, e);
		}


		try {
			con = DriverManager.getConnection(url, user, pass);
			st = con.createStatement();// ���� ��� ��� ��� ��� SQL
			System.out.println(" >>>>>>>>>>>>>>>connected <<<<<<<<<<<<< ");
		}
		catch (SQLException e) {

			System.out.println("Cant connect to the data base !!");

		}


	}

	public static void main(String args[]) throws SQLException {
		ConnectToDataBase DB = new ConnectToDataBase();
		DB.go();
//		DB.st.execute("update tabl set id =10 where id=2");
//		System.out.println(DB.st.getFetchSize());
//		ResultSet rs = DB.st.executeQuery("SELECT * FROM departement");
//		while (rs.next())
//			System.out.println(rs.getInt("did") + " " + rs.getString("dname"));

	}
	
	
}
