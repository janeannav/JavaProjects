//Jane Anna Vickery, 48166304, “Lab 5-Spring-2022”
import java.util.Scanner;
import java.util.Random;
public class Graduate 
{
	static Scanner input = new Scanner(System.in);// declare as static in main so it can be used by all methods
	static Random rand = new Random();
	public static void main(String[] args)
	{
		String[] places = new String[7];// declare and initialize string array
			places[0] = "Admissions";
			places[1] = "Cox School of Business";
			places[2] = "Dedman College";
			places[3] = "Simmons School of Education";
			places[4] = "Meadows School of the Arts";
			places[5] = "Lyle School of Engineering";
			places[6] = "Moody";
		String[] players = new String[2];// players' names
		int[] position = new int[2];// corresponds to the position(1-6) of each player
		
		System.out.println("Welcome to the Graduate from SMU Game!");
		
		System.out.print("Enter player 1 name: ");
		players [0] = input.nextLine();// stores player 1 name in string array index position 1
		System.out.print("Enter player 2 name: ");// stores player 2 name in string array index position 2
		players [1] = input.nextLine();
		
		while(position[0] < 6 && position[1] < 6)// ensures that both players have to be at a position less than 6, this is the game loop until someone wins
		{
	
		
		for(int i = 0; i <players.length; i++)// create a loop for each round to repeat for each player
		{
		System.out.println(players[i] + "'s turn. Currently at " + places[position[i]]);
			
		
		if(position[i] == 0)// use i so it repeats for each of the players
		{
			System.out.print("Press Enter to roll the dice...");
			input.nextLine();
			boolean result = rollDoubles();// calls rollDice method
			
			if(result == true)// use boolean valuable since that is the primitive type
			{
				
				System.out.println(players[i] + " is enrolled in the first school!");
				position[i]+= 1;// increase players position by one
			}
			else
			{
				System.out.println(players[i] + " is stuck at Admissions");
			}
		}
		
		if(position[i] > 0)// if current player is at a location greater than 0
		{
			System.out.println(players[i] + " is attempting a passing grade at " + places[position[i]]); //calls the player name and the name of their current location
			System.out.print("Press Enter to spin the grade wheel..."); //prompt user to press enter
			input.nextLine();
			boolean answer = attemptPassingGrade();// call attemptPassingGrade method by declaring it boolean 
		
		if(answer == true)
		{
			position[i]+= 1;// add one to respective players' position
		}
		else// if attemptPassingGrade returns false, then this player's turn is over and the round loop continues with the next player
		{
			
		}
			
		}
		
		if(position[i] == 6)// if a player is at position 6 
		{
			
			System.out.println(players[i] + " graduated! Game over.");// this player has gone all the way through the schools, so when they reach position 6, they graduate and win the game
			break;	// end game by breaking out of the round loop and game loop
		}
		}//end Round Loop 
		}//end Game Loop
	}//end main
	public static boolean rollDoubles()// returns true or false
	{
	
		int x = rand.nextInt(6) +1;  // declare and initialize x as a random +1, so it counts all 6 sides
		int y = rand.nextInt(6) + 1; // declare and initialize x as a random +1, so it counts all 6 sides
		System.out.printf("Rolled %d and %d ",x,y );// print both randomized numbers
		
		
		
		if(x == y)
		{
			System.out.print(" - doubles!!\n");
			return true;
		}// end if
			return false;
		
		
	}//end rollDoubles
	public static boolean attemptPassingGrade()// returns true or false
	{
		
		String grade;// declare string 
		
		String[] lettergrade = new String[5];// declare and initialize string
		lettergrade[0] = "A";
		lettergrade[1] = "B";
		lettergrade[2] = "C";
		lettergrade[3] = "D";
		lettergrade[4] = "F";// ends at 4 even though we have 5 numbers because output starts at index 0
		
		grade = lettergrade[rand.nextInt(lettergrade.length)];// initialize string according to array length
		
		if(grade.equalsIgnoreCase(lettergrade[0]) || grade.equalsIgnoreCase(lettergrade[1]) || grade.equalsIgnoreCase(lettergrade[2]))// || means OR and don't use == because these variables are strings
		{
			System.out.print("Passed– grade  ");
			System.out.println(grade);
			return true;
		}
		if(grade.equalsIgnoreCase(lettergrade[3]) || grade.equalsIgnoreCase(lettergrade[4]))
		
			System.out.print("Didn't Pass– grade ");
			System.out.println(grade);
			return false;
		
		
	
	}//end attemptPassingGrade
}//end Graduate

