package view.menu;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import view.Main;

public class MenuTab extends JPanel {
	
	Main parent;
	
	final int PANEL_PADDING = 20;
	final int BUTTON_PADDING = 25;
	final int MENU_TAB_WIDTH = 300;
	
	final int LOGO_HEIGHT = 100;
	final int ACC_HEIGHT = 100;
	
	public MenuTab(Main parent) {
		this.parent = parent;
        setOpaque(false);
        setSize(MENU_TAB_WIDTH, parent.getContentPane().getHeight());
        setLayout(null);
        
        
        //Logo Panel
        JPanel logoPanel = new JPanel();
    	logoPanel.setBounds(PANEL_PADDING, PANEL_PADDING, MENU_TAB_WIDTH - 2*PANEL_PADDING, LOGO_HEIGHT);
    	logoPanel.setOpaque(false);
        JLabel lblNewLabel = new JLabel();
		ImageIcon logo = new ImageIcon(MenuTab.class.getResource("/view/image/logo.png"));
		Image tmp = logo.getImage();
		tmp = getScaledImage(tmp, logoPanel.getWidth(), logoPanel.getHeight());
		logo = new ImageIcon(tmp);
		lblNewLabel.setIcon(logo);
		logoPanel.add(lblNewLabel);
		this.add(logoPanel);

        
		
		//Navigation Panel
        JPanel navPanel = new JPanel();
        navPanel.setBounds(PANEL_PADDING, LOGO_HEIGHT + 2*PANEL_PADDING, MENU_TAB_WIDTH - 2*PANEL_PADDING, this.getHeight() - 4*PANEL_PADDING - LOGO_HEIGHT - ACC_HEIGHT);
        navPanel.setOpaque(false);
//        NavigationButton btn1 = new NavigationButton(MENU_TAB_WIDTH - 2*PANEL_PADDING, 65);
//        navPanel.add(btn1);
        
        add(navPanel);
        navPanel.setLayout(new BoxLayout(navPanel, BoxLayout.Y_AXIS));
        
        navPanel.add(Box.createRigidArea(new Dimension(0, BUTTON_PADDING)));
        JButton dashboardBtn = new JButton("DASHBOARD");
        dashboardBtn.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
//        		System.out.print("Pressed DASHBOARD");
        		JPanel cardPanel = parent.getCardPanel();
        		CardLayout cl = (CardLayout)(cardPanel.getLayout());
        	    cl.show(cardPanel, "DASHBOARD");
        	}
        });
        dashboardBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        navPanel.add(dashboardBtn);
        
        navPanel.add(Box.createRigidArea(new Dimension(0, BUTTON_PADDING)));
        JButton reservationBtn = new JButton("RESERVATION");
        reservationBtn.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
//        		System.out.print("Pressed RESERVATION");
        		JPanel cardPanel = parent.getCardPanel();
        		CardLayout cl = (CardLayout)(cardPanel.getLayout());
        	    cl.show(cardPanel, "RESERVATION");
        	}
        });
        reservationBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        navPanel.add(reservationBtn);
        
        navPanel.add(Box.createRigidArea(new Dimension(0, BUTTON_PADDING)));
        JButton occupiedBtn = new JButton("CURRENT GUESTS");
        occupiedBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        navPanel.add(occupiedBtn);
        
        navPanel.add(Box.createRigidArea(new Dimension(0, BUTTON_PADDING)));
        JButton historyBtn = new JButton("HISTORY");
        historyBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        navPanel.add(historyBtn);
        
        navPanel.add(Box.createRigidArea(new Dimension(0, BUTTON_PADDING)));
        JButton roomBtn = new JButton("ROOM");
        roomBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        navPanel.add(roomBtn);
        
        navPanel.add(Box.createRigidArea(new Dimension(0, BUTTON_PADDING)));
        JButton serviceBtn = new JButton("SERVICE");
        serviceBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        navPanel.add(serviceBtn);
        
        navPanel.add(Box.createRigidArea(new Dimension(0, BUTTON_PADDING)));
        JButton revenueBtn = new JButton("REVENUE");
        revenueBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        navPanel.add(revenueBtn);
        
        navPanel.add(Box.createRigidArea(new Dimension(0, BUTTON_PADDING)));
        JButton employeeBtn = new JButton("EMPLOYEE");
        employeeBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        navPanel.add(employeeBtn);
        
        
        

        JPanel accPanel = new JPanel();
        accPanel.setOpaque(false);
        accPanel.setBounds(PANEL_PADDING, this.getHeight() - PANEL_PADDING - ACC_HEIGHT, MENU_TAB_WIDTH - 2*PANEL_PADDING, ACC_HEIGHT);
        accPanel.setLayout(new BoxLayout(accPanel, BoxLayout.Y_AXIS));
        add(accPanel);
        
        navPanel.add(Box.createRigidArea(new Dimension(0, BUTTON_PADDING)));
        JButton accountBtn = new JButton("MY ACCOUNT");
        accountBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        accPanel.add(accountBtn);
        
        accPanel.add(Box.createRigidArea(new Dimension(0, BUTTON_PADDING)));
        JButton quitBtn = new JButton("QUIT");
        quitBtn.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		parent.dispatchEvent(new WindowEvent(parent, WindowEvent.WINDOW_CLOSING));
        	}
        });
        quitBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        accPanel.add(quitBtn);
	}
	
	
	@Override
	protected void paintChildren(Graphics grp)
	{
		Graphics2D g2d = (Graphics2D) grp;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		GradientPaint gradient = new GradientPaint(0, 0, Color.decode("#00F260"), getWidth(), getHeight(), Color.decode("#0575E6"));
		g2d.setPaint(gradient);
		g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
		g2d.fillRect(getWidth() - 20, 0, 20, getHeight());
		super.paintChildren(grp);
	}
	
	private Image getScaledImage(Image srcImg, int w, int h)
	{
	    BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
	    Graphics2D g2 = resizedImg.createGraphics();
	    g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
	    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	    g2.drawImage(srcImg, 0, 0, w, h, null);
	    g2.dispose();

	    return resizedImg;
	}
}
