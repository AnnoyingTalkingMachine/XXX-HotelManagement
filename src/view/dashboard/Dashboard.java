package view.dashboard;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import view.BorderedRoundPanel;
import view.Main;
import view.RoundPanel;

public class Dashboard extends JPanel {

	/**
	 * Create the panel.
	 */
	public Dashboard(Main parent) {
		setOpaque(false);
//TODO: Nhớ bỏ comment dòng dưới, còn tạm thời để WindowBuilder render được thì phải dùng cách này
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
        
        JPanel mapPanel = new RoundPanel();
        mapPanel.setBounds(10, 181, 699, 488);
//        add(mapPanel);
        JPanel mapContent = new JPanel();
        FlowLayout flowLayout = (FlowLayout) mapContent.getLayout();
        flowLayout.setAlignment(FlowLayout.LEFT);
        mapPanel.add(mapContent);
        mapContent.setBounds(20, 20, 659, 448);
        for(int i=0; i<9; i++)
        {
        	mapContent.add(new MapRoom());
        }
//        JScrollPane scrollMap = new JScrollPane(mapContent);
//        scrollMap.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
//        add(scrollMap);
        add(mapPanel);
        
        JPanel expirePanel = new RoundPanel();
        expirePanel.setBounds(719, 181, 251, 488);
        add(expirePanel);
        
        JPanel searchPanel = new BorderedRoundPanel();
        searchPanel.setBounds(10, 122, 699, 48);
        add(searchPanel);
        
        JPanel legendPanel = new RoundPanel();
        legendPanel.setBounds(10, 680, 960, 29);
        add(legendPanel);
        
        JLabel lblAboutToExpire = new JLabel("About to expire...");
        lblAboutToExpire.setVerticalAlignment(SwingConstants.BOTTOM);
        lblAboutToExpire.setFont(new Font("Verdana", Font.BOLD, 22));
        lblAboutToExpire.setBounds(719, 122, 300, 48);
        add(lblAboutToExpire);
	}
}
