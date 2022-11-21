package entity;

import java.util.Date;
import java.util.List;

public class BookedRoom
{
	private int ID;
	private Date checkin, checkout;
	private Room room;
	private double subTotalPrice;
	private List<ClientService> clientServices;
	
	public void updateSubTotalPrice()
	{
		double sum = room.getTotalPrice();
		for(int i=0; i<clientServices.size(); i++)
		{
			sum += clientServices.get(i).getTotal();
		}
		
		this.subTotalPrice = sum;
	}
	
	
	
	public int getID()
	{
		return ID;
	}
	public void setID(int iD)
	{
		ID = iD;
	}
	public Date getCheckin()
	{
		return checkin;
	}
	public void setCheckin(Date checkin)
	{
		this.checkin = checkin;
	}
	public Date getCheckout()
	{
		return checkout;
	}
	public void setCheckout(Date checkout)
	{
		this.checkout = checkout;
	}
	public Room getRoom()
	{
		return room;
	}
	public void setRoom(Room room)
	{
		this.room = room;
	}
	public double getSubTotalPrice()
	{
		return subTotalPrice;
	}
	
	public List<ClientService> getClientServices()
	{
		return clientServices;
	}
	public void setClientServices(List<ClientService> clientServices)
	{
		this.clientServices = clientServices;
	}
}
