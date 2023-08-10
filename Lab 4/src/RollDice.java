//Jane Anna Vickery, 48166304, “Lab 4-Spring-2022”
import java.util.Random;
import java.util.Scanner;
public class RollDice 
	{
	static Scanner input = new Scanner(System.in);
	static Random rand = new Random();
	public static void main(String[] args)
	{
		while(true)// create loop
		{
		
		System.out.print("Press Enter to roll the dice...");// prompt user to press enter
		input.nextLine();
		int x = rand.nextInt(6) +1;  // declare and initialize x as a random +1, so it counts all 6 sides
		int y = rand.nextInt(6) + 1; // declare and initialize x as a random +1, so it counts all 6 sides
		System.out.printf("Rolled %d and %d\n",x,y );// print both randomized numbers
		
		
		
		if(x == y)
			System.out.print(" - doubles!!\n");// if there is a double, this will print out
		
		}
		
	}//end main
}//end RollDice
