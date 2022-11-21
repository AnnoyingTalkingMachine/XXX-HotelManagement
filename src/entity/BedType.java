package entity;

public class BedType
{
	private int typeID;
	private String typeName;
	private double price;
	private String description;
	
	public int getTypeID()
	{
		return typeID;
	}
	public void setTypeID(int typeID)
	{
		this.typeID = typeID;
	}
	public String getTypeName()
	{
		return typeName;
	}
	public void setTypeName(String typeName)
	{
		this.typeName = typeName;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public String getDescription()
	{
		return description;
	}
	public void setDescription(String description)
	{
		this.description = description;
	}
}
