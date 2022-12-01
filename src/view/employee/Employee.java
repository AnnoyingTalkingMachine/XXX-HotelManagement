package view.employee;

import javax.swing.JLabel;
import javax.swing.JPanel;

import view.Main;

public class Employee extends JPanel {

	/**
	 * Create the panel.
	 */
	public Employee(Main parent) {
		setOpaque(false);
        setSize(parent.getWidth() - parent.getMenuTab().getWidth(), parent.getHeight());
        setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Day la tab Employee(Admin)");
        lblNewLabel.setBounds(0, 0, this.getWidth(), 20);
        add(lblNewLabel);
	}

}
