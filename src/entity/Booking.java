package entity;

import java.util.Date;
import java.util.List;

public class Booking
{
	private int bookingID;
	private Date bookedDay;
	private List<BookedRoom> bookedRooms;
	private double totalPrice;
	private String clientTel;
	private String clientName;
	private String note;
	private String status;
	
	public int getBookingID()
	{
		return bookingID;
	}
	public void setBookingID(int bookingID)
	{
		this.bookingID = bookingID;
	}
	public Date getBookedDay()
	{
		return bookedDay;
	}
	public void setBookedDay(Date bookedDay)
	{
		this.bookedDay = bookedDay;
	}
	public List<BookedRoom> getBookedRooms()
	{
		return bookedRooms;
	}
	public void setBookedRooms(List<BookedRoom> bookedRooms)
	{
		this.bookedRooms = bookedRooms;
	}
	public double getTotalPrice()
	{
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice)
	{
		this.totalPrice = totalPrice;
	}
	public String getClientTel()
	{
		return clientTel;
	}
	public void setClientTel(String clientTel)
	{
		this.clientTel = clientTel;
	}
	public String getClientName()
	{
		return clientName;
	}
	public void setClientName(String clientName)
	{
		this.clientName = clientName;
	}
	public String getNote()
	{
		return note;
	}
	public void setNote(String note)
	{
		this.note = note;
	}
	public String getStatus()
	{
		return status;
	}
	public void setStatus(String status)
	{
		this.status = status;
	}
	
	
}
