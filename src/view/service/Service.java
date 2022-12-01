package view.service;

import javax.swing.JLabel;
import javax.swing.JPanel;

import view.Main;

public class Service extends JPanel {

	/**
	 * Create the panel.
	 */
	public Service(Main parent) {
		setOpaque(false);
        setSize(parent.getWidth() - parent.getMenuTab().getWidth(), parent.getHeight());
        setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Day la tab Service(Admin)");
        lblNewLabel.setBounds(0, 0, this.getWidth(), 20);
        add(lblNewLabel);
	}

}
