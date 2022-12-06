package view.dashboard;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import view.style.BorderedRoundPanel;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class ExpireRoom extends BorderedRoundPanel {

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
	
	
	
	
	
	public ExpireRoom() {
		super();
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setStatus(getStatus()+1);
			}
		});
		setSize(320, 100);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {160, 160};
		gridBagLayout.rowHeights = new int[] {40, 30, 30};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0};
		setLayout(gridBagLayout);
		
		roomNumLbl = new JLabel("roomNum");
		roomNumLbl.setFont(new Font("Verdana", Font.BOLD, 15));
		GridBagConstraints gbc_roomNumLbl = new GridBagConstraints();
		gbc_roomNumLbl.anchor = GridBagConstraints.WEST;
		gbc_roomNumLbl.fill = GridBagConstraints.VERTICAL;
		gbc_roomNumLbl.insets = new Insets(0, 10, 5, 5);
		gbc_roomNumLbl.gridx = 0;
		gbc_roomNumLbl.gridy = 0;
		add(roomNumLbl, gbc_roomNumLbl);
		
		clientNameLbl = new JLabel("clientName");
		clientNameLbl.setHorizontalAlignment(SwingConstants.CENTER);
		clientNameLbl.setVisible(false);
		
		statusPnl = new JPanel();
		statusPnl.setOpaque(false);
		statusPnl.setLayout(new CardLayout(0, 0));
		GridBagConstraints gbc_statusPnl = new GridBagConstraints();
		gbc_statusPnl.anchor = GridBagConstraints.SOUTH;
		gbc_statusPnl.fill = GridBagConstraints.HORIZONTAL;
		gbc_statusPnl.insets = new Insets(0, 0, 5, 10);
		gbc_statusPnl.gridx = 1;
		gbc_statusPnl.gridy = 0;
		add(statusPnl, gbc_statusPnl);
		
		JLabel statusLbl_unavailable = new JLabel("Unavailable");
		statusLbl_unavailable.setHorizontalAlignment(SwingConstants.RIGHT);
		statusLbl_unavailable.setFont(new Font("Verdana", Font.PLAIN, 15));
		statusPnl.add(statusLbl_unavailable, STATUS_NAME[0]);
		
		JLabel statusLbl_free = new JLabel("Free");
		statusLbl_free.setHorizontalAlignment(SwingConstants.RIGHT);
		statusLbl_free.setFont(new Font("Verdana", Font.PLAIN, 15));
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
		statusLbl_occupied.setFont(new Font("Verdana", Font.PLAIN, 15));
		statusPnl_occupied.add(statusLbl_occupied);
		JLabel statusLbl_timeLeft = new JLabel("1h12m");
		statusLbl_timeLeft.setHorizontalAlignment(SwingConstants.LEFT);
		statusLbl_timeLeft.setFont(new Font("Verdana", Font.BOLD, 15));
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
		statusLbl_reserved.setFont(new Font("Verdana", Font.PLAIN, 15));
		statusPnl_reserved.add(statusLbl_reserved);
		JLabel statusLbl_timeIncoming = new JLabel("1h12m");
		statusLbl_timeIncoming.setHorizontalAlignment(SwingConstants.LEFT);
		statusLbl_timeIncoming.setFont(new Font("Verdana", Font.BOLD, 15));
		statusPnl_reserved.add(statusLbl_timeIncoming);
		
		JLabel statusLbl_cleaning = new JLabel("Cleaning");
		statusLbl_cleaning.setHorizontalAlignment(SwingConstants.RIGHT);
		statusLbl_cleaning.setFont(new Font("Verdana", Font.PLAIN, 15));
		statusPnl.add(statusLbl_cleaning, STATUS_NAME[4]);
		clientNameLbl.setFont(new Font("Verdana", Font.PLAIN, 14));
		GridBagConstraints gbc_clientNameLbl = new GridBagConstraints();
		gbc_clientNameLbl.anchor = GridBagConstraints.WEST;
		gbc_clientNameLbl.insets = new Insets(0, 10, 5, 5);
		gbc_clientNameLbl.gridx = 0;
		gbc_clientNameLbl.gridy = 1;
		add(clientNameLbl, gbc_clientNameLbl);
		
		clientTelLbl = new JLabel("tel");
		clientTelLbl.setVisible(false);
		clientTelLbl.setFont(new Font("Verdana", Font.PLAIN, 14));
		GridBagConstraints gbc_clientTelLbl = new GridBagConstraints();
		gbc_clientTelLbl.fill = GridBagConstraints.BOTH;
		gbc_clientTelLbl.insets = new Insets(0, 10, 0, 5);
		gbc_clientTelLbl.gridx = 0;
		gbc_clientTelLbl.gridy = 2;
		add(clientTelLbl, gbc_clientTelLbl);
		
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
	    		break;
	    	case RESERVED:
	    		clientNameLbl.setVisible(true);
	    		clientTelLbl.setVisible(true);
	    		break;
	    	default:
	    		clientNameLbl.setVisible(false);
	    		clientTelLbl.setVisible(false);
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
