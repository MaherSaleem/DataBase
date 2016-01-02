package gui;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import databasep.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NewEmployee extends JApplet {
	private JTextField txtEName;
	public JPanel pnlCenter;
	private JButton btnAdd;
	private JButton btnClose;
	private JComboBox comboBox;
	/**
	 * Create the applet.
	 */
	public NewEmployee() {
		JPanel pnlCenter = new JPanel();
		pnlCenter.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,},
			new RowSpec[] {
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
		
		String types[] = {"Doctor", "Nurse", "Lab Worker"};
		JComboBox cmbType = new JComboBox(types);
		pnlCenter.add(cmbType, "8, 2, fill, default");
		
		JLabel lblEmployeeName = new JLabel("Employee Name");
		pnlCenter.add(lblEmployeeName, "4, 4, left, default");
		
		txtEName = new JTextField();
		pnlCenter.add(txtEName, "8, 4, fill, default");
		txtEName.setColumns(10);
		
		JLabel lblBirthdate = new JLabel("Birthdate");
		pnlCenter.add(lblBirthdate, "4, 6, left, default");
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		pnlCenter.add(formattedTextField, "8, 6, fill, default");
		
		JLabel lblCity = new JLabel("City");
		pnlCenter.add(lblCity, "4, 8");
		
		JComboBox cmbCities = new JComboBox();
		pnlCenter.add(cmbCities, "8, 8, fill, default");
		
		JLabel lblNewLabel = new JLabel("Department");
		pnlCenter.add(lblNewLabel, "4, 10, left, default");
		
		JComboBox cmbDep = new JComboBox();
		pnlCenter.add(cmbDep, "8, 10, fill, default");
		
		btnAdd = new JButton("Add");
		pnlCenter.add(btnAdd, "4, 20");
		
		btnClose = new JButton("Close");
		pnlCenter.add(btnClose, "8, 20, right, default");
		
	}
	
	public void whenFinish(JTabbedPane tabbedPane) {
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {			
				//Insert new employee
				tabbedPane.remove(tabbedPane.getSelectedComponent());
			}
		});
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {			
				tabbedPane.remove(tabbedPane.getSelectedComponent());
			}
		});
	}

	
	
}
