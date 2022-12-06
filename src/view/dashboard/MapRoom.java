package view.dashboard;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import view.BorderedRoundPanel;
import java.awt.FlowLayout;

public class MapRoom extends BorderedRoundPanel {

	private int status = 0;
	static final int	UNAVAILABLE = 0,
						FREE = 1,
						OCCUPIED = 2,
						RESERVED = 3,
						CLEANING = 4;
	static final String[] STATUS_NAME = {"UNAVAILABLE", "FREE", "OCCUPIED", "RESERVED", "CLEANING"};
	static final Color[] BORDER_COLOR 		= {Color.black, 			Color.decode("#459C75"), Color.decode("#D54561"), Color.decode("#DAD2C1"), Color.black};
	static final Color[] BACKGROUND_COLOR 	= {Color.decode("#E2E4E5"), Color.decode("#D4EDE2"), Color.decode("#F8E1E6"), Color.decode("#FFF2E2"), Color.decode("#E2E4E5")};
	
	private JLabel roomNumLbl;
	private JPanel statusPnl;
	private JLabel clientNameLbl;
	private JLabel clientTelLbl;
	private JPanel checkinPnl;
	private JPanel checkoutPnl;
	
	
	
	public MapRoom() {
		super();
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setStatus(getStatus()+1);
			}
		});
		setSize(550, 150);
		
		roomNumLbl = new JLabel("roomNum");
		roomNumLbl.setFont(new Font("Tahoma", Font.BOLD, 20));
		roomNumLbl.setBounds(30, 10, 143, 25);
		add(roomNumLbl);
		
		clientNameLbl = new JLabel("clientName");
		clientNameLbl.setVisible(false);
		clientNameLbl.setFont(new Font("Tahoma", Font.PLAIN, 18));
		clientNameLbl.setBounds(30, 57, 199, 25);
		add(clientNameLbl);
		
		statusPnl = new JPanel();
		statusPnl.setOpaque(false);
		statusPnl.setLayout(new CardLayout(0, 0));
		statusPnl.setBounds(290, 11, 221, 36);
		add(statusPnl);
		
		JLabel statusLbl_unavailable = new JLabel("Unavailable");
		statusLbl_unavailable.setHorizontalAlignment(SwingConstants.RIGHT);
		statusLbl_unavailable.setFont(new Font("Tahoma", Font.PLAIN, 18));
		statusPnl.add(statusLbl_unavailable, STATUS_NAME[0]);
		
		JLabel statusLbl_free = new JLabel("Free");
		statusLbl_free.setHorizontalAlignment(SwingConstants.RIGHT);
		statusLbl_free.setFont(new Font("Tahoma", Font.PLAIN, 18));
		statusPnl.add(statusLbl_free, STATUS_NAME[1]);
		
		JPanel statusPnl_occupied = new JPanel();
		statusPnl_occupied.setOpaque(false);
		FlowLayout flowLayout = (FlowLayout) statusPnl_occupied.getLayout();
		flowLayout.setVgap(7);
		flowLayout.setHgap(0);
		flowLayout.setAlignment(FlowLayout.RIGHT);
		statusPnl.add(statusPnl_occupied, STATUS_NAME[2]);
		JLabel statusLbl_occupied = new JLabel("Expires in ");
		statusLbl_occupied.setHorizontalAlignment(SwingConstants.RIGHT);
		statusLbl_occupied.setFont(new Font("Tahoma", Font.PLAIN, 18));
		statusPnl_occupied.add(statusLbl_occupied);
		JLabel statusLbl_timeLeft = new JLabel("1h12m");
		statusLbl_timeLeft.setHorizontalAlignment(SwingConstants.LEFT);
		statusLbl_timeLeft.setFont(new Font("Tahoma", Font.PLAIN, 18));
		statusPnl_occupied.add(statusLbl_timeLeft);
		
		JPanel statusPnl_reserved = new JPanel();
		statusPnl_reserved.setOpaque(false);
		FlowLayout flowLayout_1 = (FlowLayout) statusPnl_reserved.getLayout();
		flowLayout_1.setVgap(7);
		flowLayout_1.setHgap(0);
		flowLayout_1.setAlignment(FlowLayout.RIGHT);
		statusPnl.add(statusPnl_reserved, STATUS_NAME[3]);
		JLabel statusLbl_reserved = new JLabel("Arrives in ");
		statusLbl_reserved.setHorizontalAlignment(SwingConstants.RIGHT);
		statusLbl_reserved.setFont(new Font("Tahoma", Font.PLAIN, 18));
		statusPnl_reserved.add(statusLbl_reserved);
		JLabel statusLbl_timeIncoming = new JLabel("1h12m");
		statusLbl_timeIncoming.setHorizontalAlignment(SwingConstants.LEFT);
		statusLbl_timeIncoming.setFont(new Font("Tahoma", Font.PLAIN, 18));
		statusPnl_reserved.add(statusLbl_timeIncoming);
		
		JLabel statusLbl_cleaning = new JLabel("Cleaning");
		statusLbl_cleaning.setHorizontalAlignment(SwingConstants.RIGHT);
		statusLbl_cleaning.setFont(new Font("Tahoma", Font.PLAIN, 18));
		statusPnl.add(statusLbl_cleaning, STATUS_NAME[4]);
		
		clientTelLbl = new JLabel("tel");
		clientTelLbl.setVisible(false);
		clientTelLbl.setFont(new Font("Tahoma", Font.PLAIN, 18));
		clientTelLbl.setBounds(271, 57, 199, 25);
		add(clientTelLbl);
		
		checkinPnl = new JPanel();
		checkinPnl.setVisible(false);
		checkinPnl.setOpaque(false);
		checkinPnl.setBounds(30, 92, 240, 48);
		add(checkinPnl);
		checkinPnl.setLayout(null);
		
		JLabel checkinLbl = new JLabel("checkinTime");
		checkinLbl.setFont(new Font("Tahoma", Font.PLAIN, 18));
		checkinPnl.add(checkinLbl);
		checkinLbl.setBounds(46, 10, 184, 28);
		
		JPanel statusLEDPlaceholder = new JPanel();
		statusLEDPlaceholder.setBounds(10, 10, 28, 28);
		checkinPnl.add(statusLEDPlaceholder);
		
		checkoutPnl = new JPanel();
		checkoutPnl.setVisible(false);
		checkoutPnl.setOpaque(false);
		checkoutPnl.setLayout(null);
		checkoutPnl.setBounds(271, 92, 240, 48);
		add(checkoutPnl);
		
		JLabel checkoutLbl = new JLabel("checkinTime");
		checkoutLbl.setFont(new Font("Tahoma", Font.PLAIN, 18));
		checkoutLbl.setBounds(46, 10, 184, 28);
		checkoutPnl.add(checkoutLbl);
		
		JPanel statusLEDPlaceholder_1 = new JPanel();
		statusLEDPlaceholder_1.setBounds(10, 10, 28, 28);
		checkoutPnl.add(statusLEDPlaceholder_1);
		
	}
	
	public void updateLabel()
	{
		//TODO: Chưa update đủ hết các Label do thiếu dữ liệu từ Model
		CardLayout cl = (CardLayout)(statusPnl.getLayout());
	    cl.show(statusPnl, STATUS_NAME[status]);
	    
	    switch(status)
	    {
	    	case OCCUPIED:
	    		clientNameLbl.setVisible(true);
	    		clientTelLbl.setVisible(true);
	    		checkinPnl.setVisible(true);
	    		checkoutPnl.setVisible(true);
	    		break;
	    	case RESERVED:
	    		clientNameLbl.setVisible(true);
	    		clientTelLbl.setVisible(true);
	    		checkinPnl.setVisible(true);
	    		checkoutPnl.setVisible(true);
	    		break;
	    	default:
	    		clientNameLbl.setVisible(false);
	    		clientTelLbl.setVisible(false);
	    		checkinPnl.setVisible(false);
	    		checkoutPnl.setVisible(false);
	    }
	    		
	}
	
	public void updateColor()
	{
		this.setBorderColor(BORDER_COLOR[status]);
		this.setBackground(BACKGROUND_COLOR[status]);
		repaint();
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		if((status>=0)&&(status<=4))
			this.status = status;
		else
			this.status = 0;
		
		updateLabel();
		updateColor();
	}
}
