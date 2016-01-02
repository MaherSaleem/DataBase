package gui;

import java.sql.SQLException;

import javax.swing.JApplet;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;

import databasep.ConnectToDataBase;
import databasep.Patient;
import databasep.date;

import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JButton;

import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ShowTable extends JApplet {
	private String tableName;
	private JTable table;
	private JButton btnInsert;
	private JButton btnModify;
	private JButton btnRemove;
	private JButton btnClose;
	
	public ShowTable(String tableName) {
		this.tableName = tableName;
		getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
	    JScrollPane scrollPane = new JScrollPane();
	    getContentPane().add(scrollPane, "2, 4, 20, 17, fill, fill");
	    
	    table = new JTable();
	    scrollPane.setViewportView(table);
	    refreshTable();
	    btnInsert = new JButton("Insert");

		getContentPane().add(btnInsert, "4, 22");
		
		btnModify = new JButton("Modify");
		getContentPane().add(btnModify, "10, 22");
		
		btnRemove = new JButton("Remove");
		getContentPane().add(btnRemove, "16, 22");
		
		btnClose = new JButton("Close");
		getContentPane().add(btnClose, "20, 22");

		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int row = table.getSelectedRow();
				int id = (int)table.getValueAt(row, 0);
				try {
					ConnectToDataBase.st.execute(String.format("delete from "+tableName+" where pid=%d", id));
					refreshTable();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}

	public void whenFinish(JTabbedPane tabbedPane) {
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {			
				if (tableName=="Patient") {
					NewPatient np = new NewPatient();
					tabbedPane.addTab("New Patient", null, np.pnlCenter, null);
					np.whenFinish(tabbedPane);
					tabbedPane.setSelectedIndex(tabbedPane.getTabCount() - 1);
				}
				else {
					NewEmployee np = new NewEmployee();
					tabbedPane.addTab("New " + tableName, null, np.pnlCenter, null);
					np.whenFinish(tabbedPane);
					tabbedPane.setSelectedIndex(tabbedPane.getTabCount() - 1);
				}
			}
		});
		btnModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Edit Employee
			}
		});
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {			
				tabbedPane.remove(tabbedPane.getSelectedComponent());
			}
		});
	}

	
	void refreshTable() {
		try {
			ConnectToDataBase.rs = ConnectToDataBase.st.executeQuery("select * from "+ tableName);
			table.setModel(DbUtils.resultSetToTableModel(ConnectToDataBase.rs));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
