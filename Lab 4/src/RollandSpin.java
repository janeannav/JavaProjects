//Jane Anna Vickery, 48166304, “Lab 4-Spring-2022”
import java.util.Random;
import java.util.Scanner;
public class RollandSpin 
{
	static Scanner input = new Scanner(System.in);
	static Random rand = new Random();// initialize random
	public static void main(String[] args)
	{
		while(true)
		{
		System.out.print("Roll,Spin, or Exit? (R/S/X) ");// prompts the user to enter a number corresponding to which 
		String answer = input.nextLine();
		
		if(answer.equalsIgnoreCase("R"))//use ignore case so capitalization doesn't matter
		{
			System.out.print("Press Enter to roll the dice...");
			input.nextLine();
			rollDice();// calls rollDice method
		}
		if(answer.equalsIgnoreCase("S"))
		{
			System.out.print("Press Enter to spin the compliment wheel...");
			input.nextLine();
			spinACompliment();// calls spinACompliment method
			
		}
		if(answer.equalsIgnoreCase("X"))
		{
			break; //program ends loop if x is chosen
			
		}
		}//end while
		
	}//end main
	public static void rollDice()
	{
		
		int x = rand.nextInt(6) +1;  //initialize and declare variable
		int y = rand.nextInt(6) + 1;//initialize and declare variable
		System.out.printf("Rolled %d and %d\n",x,y );
		
		
		if(x == y)
			System.out.print(" - doubles!!");
		
	}//end rollDice
	public static void spinACompliment()
	{
		
		String randomcomp;//declare string
		
		String[] compliments = new String[5];// declares and initializes variable and assigns string size
		compliments[0] = "You're swell!";
		compliments[1] = "You...are..amazing!";
		compliments[2] = "You are so fun!";
		compliments[3] = "You are Awesome!";
		compliments[4] = "You're so nice!";//ends at number 4 even though length is 5 because we start at 0 index position
		
		Random rand = new Random();
		randomcomp = compliments[rand.nextInt(compliments.length)];//initialize string
		
		System.out.println(randomcomp);
		
	}//end spinACompliment
}// end RollandSpin
