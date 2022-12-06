package view.style;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

public class BorderedRoundPanel extends JPanel {
	
	private Color borderColor;
	
	public BorderedRoundPanel() {
		setOpaque(false);
		setLayout(null);
		
		//Testing purposes
//		setBorderColor(Color.black);
//		setBackground(Color.LIGHT_GRAY);
	}
	
	@Override
	protected void paintComponent(Graphics grp)
	{
		Graphics2D g2d = (Graphics2D) grp;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setColor(getBorderColor());
		g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
		g2d.setColor(getBackground());
		g2d.fillRoundRect(1, 1, getWidth()-2, getHeight()-2, 15, 15);
		super.paintComponents(grp);
	}

	public Color getBorderColor() {
		return borderColor;
	}

	public void setBorderColor(Color borderColor) {
		this.borderColor = borderColor;
	}

}
