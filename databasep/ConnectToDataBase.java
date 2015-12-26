package databasep;
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

	public static Connection con = null;
	public static Statement st = null;// object to write sql on it
	public static String url = "jdbc:mysql://localhost/hospital";
	public static String user = "root";
	public static String pass = "";

	// function to connect
	public static void go() {

		try {
			Class.forName("com.mysql.jdbc.Driver");

		}
		catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, e);
		}

		try {
			con = DriverManager.getConnection(url, user, pass);
			st = con.createStatement();// ���� ��� ���
										// ��� ��� SQL
			System.out.println(" >>>>>>>>>>>>>>>connected <<<<<<<<<<<<< ");
		}
		catch (SQLException e) {

			JOptionPane.showMessageDialog(null,
					"Cant connect to the data base !!");
			System.exit(0);// terminate the program

		}

	}

	public static void main(String args[]) throws SQLException {
		ConnectToDataBase DB = new ConnectToDataBase();
		DB.go();
		// DB.st.execute("update tabl set id =10 where id=2");
		// System.out.println(DB.st.getFetchSize());
		// ResultSet rs = DB.st.executeQuery("SELECT * FROM departement");
		// while (rs.next())
		// System.out.println(rs.getInt("did") + " " + rs.getString("dname"));


	}

}
