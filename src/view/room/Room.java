package view.room;

import javax.swing.JLabel;
import javax.swing.JPanel;

import view.Main;

public class Room extends JPanel {

	/**
	 * Create the panel.
	 */
	public Room(Main parent) {
		setOpaque(false);
        setSize(parent.getWidth() - parent.getMenuTab().getWidth(), parent.getHeight());
        setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Day la tab Room(Admin)");
        lblNewLabel.setBounds(0, 0, this.getWidth(), 20);
        add(lblNewLabel);
	}

}
