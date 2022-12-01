package view.dashboard;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import view.Main;
import view.RoundPanel;
import java.awt.GridBagLayout;

public class Dashboard extends JPanel {

	/**
	 * Create the panel.
	 */
	public Dashboard(Main parent) {
		setOpaque(false);
//TODO: Nhớ bỏ comment setSize, còn tạm thời để WindowBuilder render được thì phải dùng cách này
//        setSize(parent.getWidth() - parent.getMenuTab().getWidth(), parent.getHeight());
        setSize(1280-300, 720);
        setLayout(null);
        
        JLabel title = new JLabel("ROOM MAP");
        title.setBounds(10, 10, 300, 30);
        title.setFont(new Font("Verdana", Font.BOLD, 30));
        add(title);
        
        JPanel filterPanel = new RoundPanel();
        filterPanel.setBounds(10, 51, 960, 60);
        add(filterPanel);
        
        JPanel mapPanel = new MapPanel();
        mapPanel.setBounds(10, 181, 699, 488);
        add(mapPanel);
        GridBagLayout gbl_mapPanel = new GridBagLayout();
        gbl_mapPanel.columnWidths = new int[] {2};
        gbl_mapPanel.rowHeights = new int[]{0};
        gbl_mapPanel.columnWeights = new double[]{Double.MIN_VALUE};
        gbl_mapPanel.rowWeights = new double[]{Double.MIN_VALUE};
        mapPanel.setLayout(gbl_mapPanel);
        
        JPanel expirePanel = new RoundPanel();
        expirePanel.setBounds(719, 163, 251, 506);
        add(expirePanel);
        
        JPanel searchPanel = new RoundPanel();
        searchPanel.setBounds(10, 122, 699, 48);
        add(searchPanel);
        
        JPanel legendPanel = new RoundPanel();
        legendPanel.setBounds(10, 680, 960, 29);
        add(legendPanel);
        
        JLabel lblAboutToExpire = new JLabel("About to expire...");
        lblAboutToExpire.setFont(new Font("Verdana", Font.BOLD, 22));
        lblAboutToExpire.setBounds(719, 122, 300, 30);
        add(lblAboutToExpire);
	}
}
