package view.menu;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NavigationButton extends JPanel {

	/**
	 * Create the panel.
	 */
	public NavigationButton(int width, int height) {
		this.setSize(260, 65);
		setOpaque(false);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setBounds(21, 11, 476, 289);
		ImageIcon logo = new ImageIcon(NavigationButton.class.getResource("/view/image/logo.png"));
		Image tmp = logo.getImage();
		tmp = getScaledImage(tmp, 300, 300);
		logo = new ImageIcon(tmp);
		this.add(lblNewLabel);
	}

	@Override
	protected void paintChildren(Graphics grp)
	{
		Graphics2D g2d = (Graphics2D) grp;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		Area area = new Area(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 30, 30));
//		GradientPaint gradient = new GradientPaint(0, 0, Color.decode("#FFFFFF"), 0, getHeight(), Color.decode("#6A82FB"));
//		g2d.setPaint(gradient);
		g2d.setPaint(Color.decode("#3CA6B9"));
		g2d.fill(area);
		g2d.dispose();
		super.paintChildren(grp);
	}
	
	private Image getScaledImage(Image srcImg, int w, int h)
	{
	    BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
	    Graphics2D g2 = resizedImg.createGraphics();
	    g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
//	    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	    g2.drawImage(srcImg, 0, 0, w, h, null);
	    g2.dispose();
	    return resizedImg;
	}
}
