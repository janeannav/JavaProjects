//Jane Anna Vickery, 48166304, “Lab 6-Spring-2022”
public class Shaker 
{
	private Die[] dice;
	public Shaker()
	{
		dice = new Die[2];
		dice[0] = new Die();
		dice[1] = new Die();
		
	}
	public void shake()
	{
		dice[0].roll();
		dice[1].roll();
		
		
	}
	public boolean isEven()
	{
		int result = dice[0].getValue() + dice[1].getValue();
		
		if(result  %2 ==0)
			return true;
		else
			return false;
	}
	public String toString()
	{
		return "Shaker with " +dice[0] + " " +dice[1];
	}
}
