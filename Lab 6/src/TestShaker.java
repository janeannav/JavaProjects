//Jane Anna Vickery, 48166304, “Lab 6-Spring-2022”

public class TestShaker 
{
	
	public static void main(String[] args)
	{
		
		Shaker theShaker = new Shaker();
		for(int i = 1; i <= 10; i++)
		{
		theShaker.shake();
		System.out.println(theShaker);
		if(theShaker.isEven() == true)
			System.out.println("Sum is even!");
		}
	
	}//end main
}//end TestShaker
