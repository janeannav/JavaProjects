//Jane Anna Vickery, 48166304, “Lab 6-Spring-2022”

public class Campus 
{
	private Location[] locations = new Location[7];
	public Campus()
	{
		
		locations[0] = new Location("Admissions",0);
		locations[1] = new Location("Cox School of Business",1);
		locations[2] = new Location("Dedman College", 2);
		locations[3] = new Location("Simmons School of Education",3);
		locations[4] = new Location("Meadows School of the Arts", 4);
		locations[5] = new Location("Lyle School of Engineering",5);
		locations[6] = new Location("Moody", 6);
	}

	public Location getStartLocation()
	{
		return locations[0];
	}
	public Location getLocation(int x)
	{
		
		return locations[x];
	}
	public String toString()
	{
		String s = new String();
		s = "Campus: \n";
		for(int i = 0; i <locations.length; i++) {
			 s += locations[i].toString();
			 s += "\n";
		}
		return s;
	}
	

}//end Campus
