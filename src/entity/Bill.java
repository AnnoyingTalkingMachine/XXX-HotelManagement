package entity;

import java.util.Date;

public class Bill
{
	private String billID;
	private Booking booking;
	private Date paymentDate;
	private String paymentType;
	private String note;
	private boolean isPaid;
	
	
	
	public String getBillID()
	{
		return billID;
	}
	public void setBillID(String billID)
	{
		this.billID = billID;
	}
	public Date getPaymentDate()
	{
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate)
	{
		this.paymentDate = paymentDate;
	}
	public String getPaymentType()
	{
		return paymentType;
	}
	public void setPaymentType(String paymentType)
	{
		this.paymentType = paymentType;
	}
	public String getNote()
	{
		return note;
	}
	public void setNote(String note)
	{
		this.note = note;
	}
	public boolean isPaid()
	{
		return isPaid;
	}
	public void setPaid(boolean isPaid)
	{
		this.isPaid = isPaid;
	}
	public Booking getBooking()
	{
		return booking;
	}
	public void setBooking(Booking booking)
	{
		this.booking = booking;
	}
}
