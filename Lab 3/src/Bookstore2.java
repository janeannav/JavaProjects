//Jane Anna Vickery, 48166304, “Lab 3-Spring-2022”
import java.util.Scanner; 
public class Bookstore2 {
	static int numBooksInStock = 100;
	static int numApparelInStock = 250;
	static double balance = 0;
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args)

	{
	while(true)
	{
	int option = showMenu();
	if(option==1)
	{
	showInventory();
	}
	if(option == 2)
	{
	showBalance();
	}
	if(option==3)
	{
	System.out.print("Enter number of books to buy: ");
		int books = input.nextInt();
		buyBooks(books);
		showInventory();//recalling the method to show inventory in this method
		showBalance();//recalling the method to show balance in this method
	}
	if(option > 6 || option < 1)
		{
		 System.out.println("Invalid choice. Please choose an option from the list.");
		}//end if
	if(option==4)
	{
	System.out.print("Enter amount of apparel to buy: ");
		int buyapparel = input.nextInt();
		buyApparel(buyapparel);
		showInventory();//recalling the method to show inventory in this method
		showBalance();//recalling the method to show balance in this method
	}
	if(option == 5)
	{
	System.out.print("Enter number of books to sell: ");
		int sellbooks = input.nextInt();
		System.out.print("Enter number of apparel to sell: ");
		int sellapparel = input.nextInt();
		sellItems(sellbooks, sellapparel);	
		showInventory();//recalling the method to show inventory in this method
		showBalance();//recalling the method to show balance in this method
	}
	if(option == 6)
		{

		System.out.println("Goodbye :)");
		break;
		}//end if
	}//end while
	}//end main method

	public static int showMenu()
	{

	System.out.println("						 ");
	System.out.println("Welcome to the SMU Bookstore Inventory System");
	System.out.println("______________________");
	System.out.println("						 ");
	System.out.println("Choice    Action");
	System.out.println("1         Show Inventory");
	System.out.println("2         Show Balance");
	System.out.println("3         Buy Books");
	System.out.println("4         Buy SMU Apparel");
	System.out.println("5         Sell Item(s)");
	System.out.println("6         Exit");
	System.out.print("Choose an option: ");
		int option = input.nextInt();

	return option;
	}//end showMenu

	public static void showInventory()
	{
		
		System.out.printf("Books in Stock:      %d\n",numBooksInStock);
		System.out.printf("Apparel in Stock:  %d\n",numApparelInStock);

	}//end showInventory

	public static void showBalance()
	{
		System.out.printf("Current Balance:       %1.2f\n",balance);

	}//end showBalance

	public static void buyBooks(int numBooks)
	{

		
		if(numBooks*50<=balance)
		{
		numBooksInStock=numBooksInStock+numBooks;
		balance=balance-numBooks*50;
		System.out.printf("Bought %d books",numBooks);
		System.out.printf("Books in Stock:      %d\n",numBooksInStock);
		System.out.printf("Apparel in Stock:  %d\n",numApparelInStock);
		System.out.printf("Current Balance:       %1.2f\n",balance);


		}//end if
		else
		{
		System.out.println("We don't have enough money for this :(");
		}//end else
		

	}//end buyBooks

	public static void buyApparel(int numApparel)
	{
	if(numApparel*5<=balance)
		{
		numApparelInStock=numApparelInStock+numApparel;
		balance=balance-numApparel*5;
		System.out.printf("Bought %d apparel",numApparel);
		System.out.printf("Books in Stock:      %d\n",numBooksInStock);
		System.out.printf("Apparel in Stock:  %d\n",numApparelInStock);
		System.out.printf("Current Balance:       %1.2f\n",balance);
		}//end if
		else
		{
		System.out.println("We don't have enough money for this :(");
		}//end else

	}//end buyApparel

	public static void sellItems(int numBooks, int numApparel)
	{
	if(numBooks <= numBooksInStock && numApparel <= numApparelInStock)
		{
		numBooksInStock=numBooksInStock-numBooks;
		numApparelInStock=numApparelInStock-numApparel;
		balance=balance+numBooks*100+numApparel*13.37;
		System.out.printf("Books in Stock:      %d\n",numBooksInStock);
		System.out.printf("Apparel in Stock:  %d\n",numApparelInStock);
		System.out.printf("Current Balance:       %1.2f\n",balance);
		}//end if
		else
		{
		System.out.println("Balance too low to make this purchase!");
		}//end else

	}//end sellItems
}//end Bookstore2
