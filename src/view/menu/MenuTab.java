package view.menu;

import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JButton;

public class MenuTab extends JPanel {

	final int PANEL_PADDING = 20;
	final int BUTTON_PADDING = 5;
	final int MENU_TAB_WIDTH = 300;
	
	final int LOGO_HEIGHT = 100;
	final int ACC_HEIGHT = 100;
	
	public MenuTab(Component parent) {
        setOpaque(false);
        
        setSize(MENU_TAB_WIDTH, parent.getHeight());
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
//        navPanel.setOpaque(false);
//        NavigationButton btn1 = new NavigationButton(MENU_TAB_WIDTH - 2*PANEL_PADDING, 65);
//        navPanel.add(btn1);
        
        add(navPanel);
        navPanel.setLayout(new BoxLayout(navPanel, BoxLayout.Y_AXIS));
        
        JButton dashboardBtn = new JButton("DASHBOARD");
        dashboardBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        navPanel.add(dashboardBtn);
        
        JButton reservationBtn = new JButton("RESERVATION");
        reservationBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        navPanel.add(reservationBtn);
        
        JButton historyBtn = new JButton("HISTORY");
        historyBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        navPanel.add(historyBtn);
        
        
        
        
        JPanel accPanel = new JPanel();
        accPanel.setBounds(PANEL_PADDING, this.getHeight() - PANEL_PADDING - ACC_HEIGHT, MENU_TAB_WIDTH - 2*PANEL_PADDING, ACC_HEIGHT);
        add(accPanel);
	}
	
	
	@Override
	protected void paintChildren(Graphics grp)
	{
		Graphics2D g2d = (Graphics2D) grp;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		GradientPaint gradient = new GradientPaint(0, 0, Color.decode("#FFFFFF"), getWidth(), getHeight(), Color.decode("#F6fff6"));
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
