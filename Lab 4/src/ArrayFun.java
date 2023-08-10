//Jane Anna Vickery, 48166304, “Lab 4-Spring-2022”
import java.util.Scanner;
public class ArrayFun 
{
	static Scanner input = new Scanner(System.in);// declare and create Scanner
	public static void main(String[] args) 

	{
		System.out.println("Welcome to Array Fun!");
		
		System.out.print("How many values would you like in your array? ");
		int arraysize = input.nextInt();// stores the value that the user enters
		
		
		double[] myArray = new double[arraysize];// prompts for the size of a double array using arraysize
		
		for (int i = 0; i < myArray.length;i++)
		{
		
			System.out.printf("Enter a floating point value #%d: ",i +1); 
			double doublenum = input.nextDouble();
			myArray[i] = doublenum; // stores value of of each number entered in the array and its index position
		
		}//end for
		while(true)
		{
		System.out.println("Options");
		System.out.println("1. Print array contents");
		System.out.println("2. Double array contents");
		System.out.println("3. Square array contents");
		System.out.println("4. Exit");
		
		System.out.print("Enter choice: ");
		int choice = input.nextInt();
		
		if(choice > 4 || choice < 1)//system exits if any number other than 1-4 is chosen
		{
			break;
		}//end if
		if(choice == 4)
		{
			break;//the loop exits
		}
		if(choice == 1)
		{
			printArray(myArray);// passes the array to printArray method
		}//end if
		if(choice == 2)
		{
			doubleArray(myArray);//passes the array to doubleArray method
			
		}//end if
		if(choice == 3)
		{
			squareArray(myArray);//passes the array to sqaureArray method
		}//end if

		}//end while
	}//end main
public static void printArray(double[] doubles)
{
	System.out.print("The values are: ");
	for(int j = 0; j < doubles.length; j++ )
	{
		System.out.printf("%1.2f  ",doubles[j]); //prints out the doubles the user in relation to the array length
	}//end for
		System.out.println();
}// end printArray
public static double[] doubleArray(double[] timestwo)
{
	System.out.print("The values are: ");
	for(int h = 0; h < timestwo.length; h++)
	{
		timestwo[h]= timestwo[h]*2;// multiplies each double in the user entered array times 2
		System.out.printf("%1.2f  ",timestwo[h]);
	}//end for
	System.out.println();
	return timestwo;// any method that is not void needs a return value
}//end doubleArray
public static double[] squareArray(double[] squarenum)
{
	System.out.print("The values are: ");
	for(int b = 0; b < squarenum.length; b++)
	{
		squarenum[b] = squarenum[b]*squarenum[b];// squares each double in the user entered array
		System.out.printf("%1.2f  ",squarenum[b]);
	}//end for
	System.out.println();
	return squarenum;// any method that is not void needs a return value
}//end squareArray
}//end ArrayFun

