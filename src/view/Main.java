package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import view.menu.MenuTab;
import java.awt.BorderLayout;

public class Main extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(((int)size.getWidth() - 1280)/2, ((int)size.getHeight() - 720)/2, 1280, 720);
		setResizable(false);
		setUndecorated(true);
		setTitle("XXX-HotelManagement");
		setBackground(new Color(0, 0, 0, 0));
		
		PanelBorder panel = new PanelBorder();
		this.add(panel);
		MenuTab menuTab = new MenuTab(this);
		panel.add(menuTab);
	}

}
