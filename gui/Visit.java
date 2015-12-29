package gui;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.ButtonGroup;
import javax.swing.JApplet;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import databasep.ConnectToDataBase;
import databasep.Employee;
import databasep.MyFunctions;
import databasep.RegulerRoom;
import net.proteanit.sql.DbUtils;

import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;

public class Visit extends JApplet {
	private JTextField textField;
	JComboBox comboDoctors;
	JComboBox comboBoxRooms;
	/**
	 * Create the applet.
	 * @throws SQLException 
	 */
	public Visit() throws SQLException {
		ConnectToDataBase.go();
		getContentPane().setLayout(null);

		JRadioButton rdbtnName = new JRadioButton("name");
		rdbtnName.setBounds(113, 7, 60, 23);
		getContentPane().add(rdbtnName);

		JRadioButton rdbtnId = new JRadioButton("id");
		rdbtnId.setBounds(113, 36, 65, 23);
		getContentPane().add(rdbtnId);
		rdbtnId.setSelected(true);

		textField = new JTextField();
		textField.setBounds(206, 7, 206, 23);
		getContentPane().add(textField);
		textField.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(39, 66, 341, 64);
		getContentPane().add(scrollPane);
		JTable table = new JTable();
		scrollPane.setViewportView(table);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(39, 245, 89, 23);
		getContentPane().add(btnNewButton);

		comboDoctors = new JComboBox(Employee.getAllDoctors());
		comboDoctors.setBounds(151, 154, 82, 20);
		getContentPane().add(comboDoctors);

		JLabel lblDoctor = new JLabel("Doctor");
		lblDoctor.setBounds(44, 157, 46, 14);
		getContentPane().add(lblDoctor);

		ButtonGroup bGrb = new ButtonGroup();
		bGrb.add(rdbtnId);
		bGrb.add(rdbtnName);

		JButton btnSearch = new JButton("search");
		btnSearch.setBounds(14, 7, 76, 23);
		getContentPane().add(btnSearch);
		
		comboBoxRooms = new JComboBox(RegulerRoom.getrooms());
		comboBoxRooms.setBounds(157, 197, 76, 20);
		comboBoxRooms.setEnabled(false);
		getContentPane().add(comboBoxRooms);
		
		
		JCheckBox chckbxRoom = new JCheckBox("room");
		chckbxRoom.setBounds(46, 196, 76, 23);
		getContentPane().add(chckbxRoom);

		btnSearch.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					if (rdbtnId.isSelected()) {
						ConnectToDataBase.rs = ConnectToDataBase.st.executeQuery(
								String.format("select * from patient where pid = %s", textField.getText()));
						table.setModel(DbUtils.resultSetToTableModel(ConnectToDataBase.rs));
					}
					else{
						System.out.println(String.format("select * from patient where pname like '%s%%'", textField.getText()));
						ConnectToDataBase.rs = ConnectToDataBase.st.executeQuery(
								String.format("select * from patient where pname like '%s%%'", textField.getText()));
						table.setModel(DbUtils.resultSetToTableModel(ConnectToDataBase.rs));

					}
				}
				catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		
		chckbxRoom.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(chckbxRoom.isSelected()){
					comboBoxRooms.setEnabled(true);
				}
				else{
					comboBoxRooms.setEnabled(false);
				}
			}
		});
	}
}
