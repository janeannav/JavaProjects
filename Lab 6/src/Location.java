//Jane Anna Vickery, 48166304, “Lab 6-Spring-2022”

public class Location 
{
	private String name;
	private int locationNumber;
	
	
	public Location(String s, int x)
	{
		name = s;
		locationNumber = x;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String s)
	{
		name = s;
	}
	public int getlocationNumber()
	{
		return locationNumber;
	}
	public void setlocationNumber(int x)
	{
		locationNumber = x;
	}
	public String toString()
	{
		return "Location # " + locationNumber + ": " + name;
	}
}//end Location
