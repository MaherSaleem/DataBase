package gui;

import javax.swing.JApplet;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;

public class DashboardComponent extends JApplet {
	
	String name;
	String tableName;
	int nb;
	JPanel pnlMain;
	
	/**
	 * Create the applet.
	 */
	public DashboardComponent(String name, int nb) {
		getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		pnlMain = new JPanel();
		pnlMain.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), name, TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 255)));
		getContentPane().add(pnlMain);
		
		JLabel lblThereAre = new JLabel("There are " + nb + " " + name);
		pnlMain.add(lblThereAre);

	}

}
