package entity;

import java.util.List;

public class Hotel
{
	private String name;
	private String address;
	private String description;
	private List<Room> rooms;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public String getDescription()
	{
		return description;
	}
	public void setDescription(String description)
	{
		this.description = description;
	}
	public List<Room> getRooms()
	{
		return rooms;
	}
	public void setRooms(List<Room> rooms)
	{
		this.rooms = rooms;
	}
	
	
}
