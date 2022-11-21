package entity;


public class Room
{
	private int roomNum;
	private int bedNum;
	private String location;
	private String status;
	private String description;
	private LayoutType layoutType;
	private BedType bedType;
	private double totalPrice;
	
	public void updateTotalPrice()
	{
		this.totalPrice = this.layoutType.getPrice() + this.bedType.getPrice();
	}
	
	
	
	
	
	
	public int getRoomNum()
	{
		return roomNum;
	}
	public void setRoomNum(int roomNum)
	{
		this.roomNum = roomNum;
	}
	public int getBedNum()
	{
		return bedNum;
	}
	public void setBedNum(int bedNum)
	{
		this.bedNum = bedNum;
	}
	public String getLocation()
	{
		return location;
	}
	public void setLocation(String location)
	{
		this.location = location;
	}
	public String getStatus()
	{
		return status;
	}
	public void setStatus(String status)
	{
		this.status = status;
	}
	public String getDescription()
	{
		return description;
	}
	public void setDescription(String description)
	{
		this.description = description;
	}
	public double getTotalPrice()
	{
		return totalPrice;
	}
	
	
	
}
