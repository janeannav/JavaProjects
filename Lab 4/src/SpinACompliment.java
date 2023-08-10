//Jane Anna Vickery, 48166304, “Lab 4-Spring-2022”
import java.util.Random;
import java.util.Scanner;
public class SpinACompliment 
{
	static Scanner input = new Scanner(System.in);
	static Random rand = new Random();
	public static void main(String[] args)
{
	
		while(true)// create a loop
		{
		System.out.print("Press Enter to spin the compliment wheel..."); //prompt user to press enter
		input.nextLine();
		
		String randomcomp;// declare string 
		
		String[] compliments = new String[5];// declare and initialize string
		compliments[0] = "You're swell!";
		compliments[1] = "You...are..amazing!";
		compliments[2] = "You are so fun!";
		compliments[3] = "You are Awesome!";
		compliments[4] = "You're so nice!";// ends at 4 even though we have 5 numbers because output starts at index 0
		
		
		randomcomp = compliments[rand.nextInt(compliments.length)];// initialize string according to array length
		
		System.out.println(randomcomp);
		}
}//end main
}// end SpinACompliment
