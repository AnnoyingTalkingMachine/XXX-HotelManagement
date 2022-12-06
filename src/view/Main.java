package view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

import view.dashboard.Dashboard;
import view.menu.MenuTab;
import view.reservation.Reservation;
import view.style.RoundPanel;

public class Main extends JFrame {
	
	private MenuTab menuTab;
	private JPanel cardPanel;
	private CardLayout cardLayout;
	
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
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		setResizable(false);
		setUndecorated(true);
		setTitle("XXX-HotelManagement");
		setBackground(new Color(0, 0, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(((int)size.getWidth() - 1280)/2, ((int)size.getHeight() - 720)/2, 1280, 720);
		
		RoundPanel mainPanel = new RoundPanel();
		this.setContentPane(mainPanel);
		mainPanel.setBounds(0, 0, 1280, 720);
		mainPanel.setBackground(Color.decode("#e4e4e4"));
		
		
		
		
		menuTab = new MenuTab(this);
		mainPanel.add(menuTab);
		
		cardPanel = new JPanel();
		cardPanel.setBounds(300, 0, 980, 720);
		cardPanel.setOpaque(false);
		cardLayout = new CardLayout(0, 0);
		cardPanel.setLayout(cardLayout);
		mainPanel.add(cardPanel);
		
		Dashboard dashboard = new Dashboard(this);
		cardPanel.add(dashboard, "DASHBOARD");
		
		Reservation reservation = new Reservation(this);
		cardPanel.add(reservation, "RESERVATION");
		
		
	}

	public MenuTab getMenuTab() {
		return menuTab;
	}

	public JPanel getCardPanel() {
		return cardPanel;
	}
	
	

}
