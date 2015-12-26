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

import databasep.Patient;
import databasep.date;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NewDoctor extends JApplet {
	private JTextField txtDName;
	public JPanel pnlCenter;
	JButton btnAdd;
	JButton btnClose;
	JComboBox comboBox;
	/**
	 * Create the applet.
	 */
	public NewDoctor() {
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
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JLabel lblDoctorName = new JLabel("Doctor Name");
		pnlCenter.add(lblDoctorName, "4, 4, left, default");
		
		txtDName = new JTextField();
		pnlCenter.add(txtDName, "8, 4, fill, default");
		txtDName.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Department");
		pnlCenter.add(lblNewLabel, "4, 6, left, default");
		
		JComboBox comboBox = new JComboBox();
		pnlCenter.add(comboBox, "8, 6, fill, default");
		
		JLabel lblNewLabel_1 = new JLabel("Office Room");
		pnlCenter.add(lblNewLabel_1, "4, 8, left, default");
		
		JComboBox comboBox_1 = new JComboBox();
		pnlCenter.add(comboBox_1, "8, 8, fill, default");
		
		JLabel lblBirthdate = new JLabel("Birthdate");
		pnlCenter.add(lblBirthdate, "4, 10, left, default");
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		pnlCenter.add(formattedTextField, "8, 10, fill, default");
		
		JButton btnAdd = new JButton("Add");
		pnlCenter.add(btnAdd, "4, 16");
		
		JButton btnClose = new JButton("Close");
		pnlCenter.add(btnClose, "8, 16, right, default");
				
		
	}
	
	public void whenFinish(JTabbedPane tabbedPane) {
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {			
				Patient p = new Patient(188, txtDName.getText(), ((String)comboBox.getSelectedItem()).charAt(0));
				p.setDateOfBirth(new date(20, 05, 1995));
				p.insertToDatabase(p);
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
