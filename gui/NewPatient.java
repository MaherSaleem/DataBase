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

import java.util.*;

import org.jdatepicker.impl.*;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import com.sun.xml.internal.fastinfoset.sax.Properties;

import databasep.DateLabelFormatter;
import databasep.Patient;
import databasep.date;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NewPatient extends JApplet {
	public JPanel pnlCenter;
	
	JButton btnAdd;
	JButton btnClose;
	
	private JComboBox cmbGender;
	private JComboBox cmbBloodType;
	private JTextField txtPName;
	private JLabel lblBloodType;
	/**
	 * Create the applet.
	 */
	public NewPatient() {
		// {{ initialize Panel
		pnlCenter = new JPanel();
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
		
		// }}
		
		JLabel lblDoctorName = new JLabel("Patient Name");
		pnlCenter.add(lblDoctorName, "4, 4, left, default");
		
		txtPName = new JTextField();
		pnlCenter.add(txtPName, "8, 4, fill, default");
		txtPName.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Gender");
		pnlCenter.add(lblNewLabel, "4, 6, left, default");
		String[] gender = {"Male", "Female"};
		cmbGender = new JComboBox(gender);
		pnlCenter.add(cmbGender, "8, 6, fill, default");
		
		JLabel lblBirthdate = new JLabel("Date of birth");
		pnlCenter.add(lblBirthdate, "4, 8, left, default");

		UtilDateModel model = new UtilDateModel();
		java.util.Properties p = new java.util.Properties();
		p.put("text.today", "Today");
		p.put("text.month", "Month");
		p.put("text.year", "Year");		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
		JFormattedTextField txtBD = new JFormattedTextField();
		
		// Don't know about the formatter, but there it is...
		pnlCenter.add(datePicker, "8, 8, fill, default");
		lblBloodType = new JLabel("Blood Type");
		pnlCenter.add(lblBloodType, "4, 10");
		
		String[] bloodTypes = {"AB+", "AB-", "A+", "A-", "B+", "B-", "O+", "O-"};
		cmbBloodType = new JComboBox(bloodTypes);
		pnlCenter.add(cmbBloodType, "8, 10, fill, default");
		
		btnAdd = new JButton("Add");
		pnlCenter.add(btnAdd, "4, 16");
		
		btnClose = new JButton("Close");
		pnlCenter.add(btnClose, "8, 16, right, default");
		
		
	}
	
	public void whenFinish(JTabbedPane tabbedPane) {
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {			
<<<<<<< HEAD
				Patient p = new Patient(188, txtPName.getText(), ((String)cmbGender.getSelectedItem()).charAt(0));
=======
				Patient p = new Patient(null, txtPName.getText(), ((String)comboBox.getSelectedItem()).charAt(0));
>>>>>>> f3b348a886c343029a50c2833dccd4b55e099ada
				p.setDateOfBirth(new date(20, 05, 1995));
				p.setBloadType(cmbBloodType.getSelectedItem().toString());
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
