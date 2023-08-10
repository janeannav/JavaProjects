//Jane Anna Vickery, 48166304, “Lab 6-Spring-2022”

import java.util.Scanner;
public class Player 
{
	private String name;
	private Location myLocation;
	
	
	public Player(String s, Location x)
	{
		name = s;
		myLocation = x;
	}
	public Location getmyLocation()
	{
		return myLocation;
	}
	public int getlocationNumber()
	{
		return myLocation.getlocationNumber();
	}
	public String getName()
	{
		return name;
	}
	public void setName(String s)
	{
		name = s;
	}
	public void setmyLocation(Location x)
	{
		myLocation = x;
	}
	public String toString()
	{
		return name + " is at " + myLocation.toString();
	}
	public boolean takeTurn(Shaker theShaker)
	{
			Scanner input = new Scanner(System.in);
			System.out.printf("%s's turn at %s.\n",name, myLocation.getName());
			System.out.print("     Press Enter to shake the dice...");
			input.nextLine();
			
			theShaker.shake();
			System.out.println("     " + theShaker);
			if(theShaker.isEven() == true)
			{
				System.out.println("     Sum is even!");
				return true;
			}
			else
				return false;
		
	}
}//end Player
