//Jane Anna Vickery, 48166304, “Lab 6-Spring-2022”

import java.util.Scanner;
public class Game 
{
	private Player[] players;
	private Campus theCampus;
	
	public Game()
	{
		theCampus = new Campus();
		createPlayers();
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
