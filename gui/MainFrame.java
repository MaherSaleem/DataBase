package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JTree;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;

import javax.swing.JTextField;

import com.jgoodies.common.base.*;
import com.jgoodies.forms.factories.DefaultComponentFactory;

import databasep.ConnectToDataBase;

import javax.swing.JEditorPane;
import javax.swing.JSlider;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;

import java.awt.FlowLayout;

import javax.swing.JMenuBar;
import javax.swing.JMenu;

import java.awt.Font;

import javax.swing.border.EtchedBorder;
import javax.swing.JPopupMenu;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Label;
import java.awt.Button;

import javax.swing.border.TitledBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;

public class MainFrame {

	private JFrame frame;
	private JTextField textField;
	static int num;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ConnectToDataBase.go();
		frame = new JFrame();
		frame.setBounds(100, 100, 640, 380);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				System.out.println(info.getName());
				if ("Windows".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		}
		catch (Exception e) {
			// If Nimbus is not available, fall back to cross-platform
			try {
				UIManager.setLookAndFeel(UIManager
						.getCrossPlatformLookAndFeelClassName());
			}
			catch (Exception ex) {
				// not worth my time
			}
		}

		JPanel pnlNorth = new JPanel();
		frame.getContentPane().add(pnlNorth, BorderLayout.NORTH);
		pnlNorth.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		tabbedPane.setForeground(new Color(0, 102, 204));
		tabbedPane.setBackground(new Color(0, 102, 153));
		tabbedPane.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);

		JPanel panel = new JPanel();
		tabbedPane.addTab("Dashboard", null, panel, null);
		panel.setLayout(new GridLayout(0, 3, 3, 3));

		// {{ Initialize Doctor Dashboard Component
		
		/**print the number of doctor in database*/
		try {
			ConnectToDataBase.rs = ConnectToDataBase.st.executeQuery("SELECT COUNT(*) as cou FROM `employee` e WHERE e.type=0");
			ConnectToDataBase.rs.next();
			num = ConnectToDataBase.rs.getInt("cou");
		}
		catch (SQLException e1) {
			e1.printStackTrace();
		}

		DashboardComponent dshDoctors = new DashboardComponent("Doctors", num);
		panel.add(dshDoctors);

		JButton btnShowAllDoctors = new JButton("Show All Doctors");
		dshDoctors.pnlMain.add(btnShowAllDoctors);

		JButton btnAddNewDoctors = new JButton("new Doctors");

		dshDoctors.pnlMain.add(btnAddNewDoctors);

		// }}

		// {{ Initialize Patient Dashboard Component
		
		/**print the number of patient in database*/
		try {
			ConnectToDataBase.rs = ConnectToDataBase.st.executeQuery("SELECT COUNT(*) as cou FROM `patient` WHERE 1");
			ConnectToDataBase.rs.next();
			num = ConnectToDataBase.rs.getInt("cou");
		}
		catch (SQLException e1) {
			e1.printStackTrace();
		}
		DashboardComponent dshPatients = new DashboardComponent("Patients", num);
		panel.add(dshPatients);

		JButton btnShowAllPatients = new JButton("Show All Patients");
		dshPatients.pnlMain.add(btnShowAllPatients);

		JButton btnAddNewPatients = new JButton("new Patients");

		dshPatients.pnlMain.add(btnAddNewPatients);
		// }}

		// {{ Initialize Nurse Dashboard Component
		
		/**print the number of doctor in database*/
		try {
			ConnectToDataBase.rs = ConnectToDataBase.st.executeQuery("SELECT COUNT(*) as cou FROM `employee` e WHERE e.type=1");
			ConnectToDataBase.rs.next();
			num = ConnectToDataBase.rs.getInt("cou");
		}
		catch (SQLException e1) {
			e1.printStackTrace();
		}

		DashboardComponent dshNurses = new DashboardComponent("Nurse", num);
		panel.add(dshNurses);
		// }}

		// {{ Initialize Laboratorist Dashboard Component
		
		/**read the number of labworkers in database*/
		try {
			ConnectToDataBase.rs = ConnectToDataBase.st.executeQuery("SELECT COUNT(*) as cou FROM `lab_worker` ");
			ConnectToDataBase.rs.next();
			num = ConnectToDataBase.rs.getInt("cou");
		}
		catch (SQLException e1) {
			e1.printStackTrace();
		}

		DashboardComponent dshLabs = new DashboardComponent("Laboratorist", num);
		panel.add(dshLabs);
		// }}

		// {{ Initialize Reports Dashboard Component
		DashboardComponent dshReports = new DashboardComponent("Reports", 5);
		panel.add(dshReports);
		// }}

		// {{ Menu Bar --- Later
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);

		JLabel lblClose = new JLabel("Close");
		mnNewMenu.add(lblClose);
		// }}

		btnAddNewPatients.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				NewPatient np = new NewPatient();
				tabbedPane.addTab("New Patient", null, np.pnlCenter, null);
				np.whenFinish(tabbedPane);
				tabbedPane.setSelectedIndex(tabbedPane.getTabCount() - 1);
			}
		});

	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
