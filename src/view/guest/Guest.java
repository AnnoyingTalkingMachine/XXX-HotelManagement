package view.guest;

import javax.swing.JLabel;
import javax.swing.JPanel;

import view.Main;

public class Guest extends JPanel {

	/**
	 * Create the panel.
	 */
	public Guest(Main parent) {
		setOpaque(false);
        setSize(parent.getWidth() - parent.getMenuTab().getWidth(), parent.getHeight());
        setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Day la tab Current Guests");
        lblNewLabel.setBounds(0, 0, this.getWidth(), 20);
        add(lblNewLabel);
	}

}
