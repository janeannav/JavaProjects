//Jane Anna Vickery, 48166304, “Lab 6-Spring-2022”

import java.util.Scanner;
public class GraduationGame 
{
	private Player[] players;
	private Campus theCampus;
	private Shaker theShaker;
	
	public GraduationGame()
	{
		theCampus = new Campus();
		theShaker = new Shaker();
		createPlayers();
	}
	public static void main(String[] args)
	{
		GraduationGame theGame = new GraduationGame();
		theGame.playGame();
	}
	public void createPlayers()
	{
		players = new Player[2];
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter player 1 name: ");
		String name1 = input.nextLine();// stores player 1 name in string array index position 1
		System.out.print("Enter player 2 name: ");// stores player 2 name in string array index position 2
		String name2 = input.nextLine();
		
		theCampus.getStartLocation();
		
		players[0] = new Player(name1, theCampus.getStartLocation());
		players[1] = new Player(name2,theCampus.getStartLocation());
	}
	public void playGame()
	{
		boolean game0ver = false;
		while(game0ver == false)
		{
			for(int i = 0; i < players.length; i++)
			{
				Player aPlayer = players[i];
				boolean advance = aPlayer.takeTurn(theShaker);
				if(advance == false)
					System.out.printf("     %s is stuck\n", aPlayer.getName());
				else
				{
					int locNum = aPlayer.getlocationNumber();
					locNum++;
					if(locNum == 6)
					{
						game0ver = true;
						System.out.printf("Game over! %s is the winner!\n", aPlayer.getName());
						break;	
					}
					else
					{
						Location newLoc = theCampus.getLocation(locNum);
						aPlayer.setmyLocation(newLoc);
						System.out.printf("     %s is now at %s\n", aPlayer.getName(),newLoc.getName());
					}
				} 
			}//end for
		}//end while
	}//end playGame
	public String toString()
	{
		String s = new String();
		s = "Graduation Game: \n";
		for(int i = 0; i <players.length; i++) {
			 s += players[i].toString();
			 s += "\n";
		}
		return s;
	}
}//end Game
