//Jane Anna Vickery, 48166304, “Lab 3-Spring-2022”
	import java.util.Scanner;

	public class Bookstore
	{
	public static void main(String[] args)
	{
	double balance = 0.00;// declare in main, so it can be used throughout all statements
	int bookstock = 100;
	int apparelstock = 250;

	Scanner input = new Scanner(System.in);

	while(true)
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
	System.out.print("Choose an option: ");//user chooses a number from the menu
		int option = input.nextInt();// user variable stored here

	if(option > 6 || option < 1)// use or to cover any number besides 1-6, even negative
		{
		 System.out.println("Invalid choice. Please choose an option from the list.");
		}//end if
	if(option==1)
		{
		System.out.printf("Books in Stock:      %d\n",bookstock);
		System.out.printf("Apparel in Stock:  %d\n",apparelstock);

		}//end if
	if(option == 2)
		{
		System.out.printf("Current Balance:       %1.2f\n",balance);//use f because balance is a double
		}//end if
	if(option == 6)
		{

		System.out.println("Goodbye :)");
		break;
		}//end if
	if(option==3)
		{
		System.out.print("Enter number of books to buy: ");
		int books = input.nextInt();
		
		if(books*50<=balance)
		{
		bookstock=bookstock+books;
		balance=balance-books*50;
		System.out.printf("Bought %d books",books);
		System.out.printf("Books in Stock:      %d\n",bookstock);
		System.out.printf("Apparel in Stock:  %d\n",apparelstock);
		System.out.printf("Current Balance:       %1.2f\n",balance);


		}//end if
		else
		{
		System.out.println("We don't have enough money for this :(");
		}//end else
		}

	if(option==4)
		{
		System.out.print("Enter amount of apparel to buy: ");
		int buyapparel = input.nextInt();
		
		if(buyapparel*5<=balance)
		{
		apparelstock=apparelstock+buyapparel;
		balance=balance-buyapparel*5;
		System.out.printf("Bought %d apparel",buyapparel);
		System.out.printf("Books in Stock:      %d\n",bookstock);
		System.out.printf("Apparel in Stock:  %d\n",apparelstock);
		System.out.printf("Current Balance:       %1.2f\n",balance);
		}//end if
		else
		{
		System.out.println("We don't have enough money for this :(");
		}//end else
		}//end if
	if(option ==5)
		{
		System.out.print("Enter number of books to sell: ");
		int sellbooks = input.nextInt();
		System.out.print("Enter number of apparel to sell: ");
		int sellapparel = input.nextInt();
		
		if(sellbooks <= bookstock && sellapparel <= apparelstock)// need to seperate apparrel and books because if group together it might seem like we have stock available but really dont for the specific category
		{
		bookstock=bookstock-sellbooks;// decrease our amount of bookstock
		apparelstock=apparelstock-sellapparel;// decrease our amount of apparelstock
		balance=balance+sellbooks*100+sellapparel*13.37;//new balance is old balance plus the amount of apparel and books times their respective selling prices
		System.out.printf("Books in Stock:      %d\n",bookstock);
		System.out.printf("Apparel in Stock:  %d\n",apparelstock);
		System.out.printf("Current Balance:       %1.2f\n",balance);
		}//end if
		else
		{
		System.out.println("Balance too low to make this purchase!");
		}//end else


		}//end if


	}//end while
	}//end main method
	}//end class

