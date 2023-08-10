//Jane Anna Vickery, 48166304, “Lab 3-Spring-2022”
import java.util.Scanner;
public class SumSnake
{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);

int interger; // declared but not initialized
int sum = 0;// declared and initialized
int sumwhile =0;// declared and initialized
System.out.print("Enter an interger: ");// prompts user to input
interger = input.nextInt();
System.out.println("-----For Loop-----");

for(int counter = 0; counter < interger; counter ++){//use for because we know our stopping point

if(counter % 2==0){// find even numbers by dividing by 2 and no remainder means an even number
	System.out.printf("%2d\n",counter);// places even numbers 2 spaces to the right
}
else{
	System.out.printf("%d\n",counter);//if not even then do this
}

sum = sum+counter;
}//end for
System.out.printf("Sum is %d \n", sum);

int counter1 = 0;// declare a new variable since we want the value to start over
System.out.println("-----While Loop-----");

while(counter1< interger)
{
if(counter1 % 2==0){
	System.out.printf("%2d\n",counter1);
	
}
else{
	System.out.printf("%d\n",counter1);
	

}
sumwhile = sumwhile+counter1;
counter1++;

}//end while
System.out.printf("Sum is %d \n", sumwhile);





}//end main
}//end class