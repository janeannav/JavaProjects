//Jane Anna Vickery, 48166304, “Lab 6-Spring-2022”

import java.util.Random;
public class Die 
{
	private int value;
	
	public Die()
	{
		value = 1;
	}
	public int getValue()
	{
		return value;
	
	}
	public void setValue(int x)
	{
		value = x;
	}
	public int roll()
	{
		Random rand = new Random();
		value = rand.nextInt(6) +1;
		return value;
	}
	public String toString()
	{
		return "Die " + value;
	}
}
