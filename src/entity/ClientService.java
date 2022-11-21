package entity;

import java.util.Date;

public class ClientService
{
	private int ID;
	private Service service;
	private Date date;
	private int quantity;
	private String note;
	private double total;
	
	public void updateTotal()
	{
		this.total = this.service.getPrice() * this.quantity;
	}
	
	
	
	public int getID()
	{
		return ID;
	}
	public void setID(int iD)
	{
		ID = iD;
	}
	public Service getService()
	{
		return service;
	}
	public void setService(Service service)
	{
		this.service = service;
	}
	public Date getDate()
	{
		return date;
	}
	public void setDate(Date date)
	{
		this.date = date;
	}
	public int getQuantity()
	{
		return quantity;
	}
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
	public String getNote()
	{
		return note;
	}
	public void setNote(String note)
	{
		this.note = note;
	}
	public double getTotal()
	{
		return total;
	}
	
	
	
}
