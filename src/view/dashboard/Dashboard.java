package view.dashboard;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import view.Main;
import view.style.BorderedRoundPanel;
import view.style.CustomScrollBar;
import view.style.RoundPanel;

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
        title.setBounds(20, 11, 300, 30);
        title.setFont(new Font("Verdana", Font.BOLD, 30));
        add(title);
        
        JPanel mapPanel = new RoundPanel();
        mapPanel.setSize(700, 560);
        mapPanel.setMaximumSize(new Dimension(700, Integer.MAX_VALUE));
        GridLayout gl_mapPanel = new GridLayout(0, 2);
        gl_mapPanel.setVgap(10);
        gl_mapPanel.setHgap(10);
        mapPanel.setLayout(gl_mapPanel);
        for(int i=0; i<15; i++)
        {
        	mapPanel.add(new MapRoom());
        }
        JScrollPane scrollMap = new JScrollPane();
//        scrollMap.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollMap.setBounds(10, 110, 700, 560);
//        scrollMap.setLocation(10, 110);
        scrollMap.setOpaque(false);
        scrollMap.setBorder(null);
        scrollMap.setViewportView(mapPanel);
        scrollMap.setVerticalScrollBar(new CustomScrollBar());
        scrollMap.setViewportBorder(new EmptyBorder(10, 10, 10, 10));
        scrollMap.getViewport().setOpaque(false);
        scrollMap.setOpaque(false);
        add(scrollMap);
        
        JPanel expirePanel = new RoundPanel();
        expirePanel.setBounds(719, 120, 251, 541);
        add(expirePanel);
        
        BorderedRoundPanel searchPanel = new BorderedRoundPanel();
        searchPanel.setBounds(20, 51, 680, 48);
        searchPanel.setBorderColor(Color.blue);
        add(searchPanel);
        
        JPanel legendPanel = new RoundPanel();
        legendPanel.setBounds(20, 680, 950, 29);
        add(legendPanel);
        
        JLabel lblAboutToExpire = new JLabel("Upcoming events...");
        lblAboutToExpire.setVerticalAlignment(SwingConstants.BOTTOM);
        lblAboutToExpire.setFont(new Font("Verdana", Font.BOLD, 19));
        lblAboutToExpire.setBounds(719, 51, 251, 48);
        add(lblAboutToExpire);
	}
}
