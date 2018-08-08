
/**
 * Displays bar chart with five numbers
 *
 * @authors)
 * (names redacted, group work)
 *
 * @version (04/11/2016)
 */

import java.util.Scanner; //import scanner Java library

public class barChart //begin class
{
    public static void main(String args[]) //begin method
    {
        System.out.println("Example\n");
        displayAsteriskBar(1);
        System.out.println();
        displayAsteriskBar(10);
        System.out.println();
        displayAsteriskBar(7);
        System.out.println();
        displayAsteriskBar(19);
        System.out.println();
        displayAsteriskBar(4);
        System.out.println();

        //user input graph
        int num1 = getNumber();
        int num2 = getNumber();
        int num3 = getNumber();
        int num4 = getNumber();
        int num5 = getNumber();

        //call displayAsterisk method
        displayAsteriskBar(num1);
        System.out.println();
        displayAsteriskBar(num2);
        System.out.println();
        displayAsteriskBar(num3);
        System.out.println();
        displayAsteriskBar(num4);
        System.out.println();
        displayAsteriskBar(num5);
        System.out.println();

    } //end method

    public static void displayAsteriskBar(int numberAsterisks) //method to display number of Asterisks
    {    for (int i = 0;  i < numberAsterisks; i++) // do for loop until equal to number
        {
            System.out.print("*"); //print *
        }
    } //end method

    public static int getNumber() //method to get five numbers
    {
        Scanner input = new Scanner(System.in); //create new scanner
        System.out.println("Enter a number: "); //user input
        int counter = input.nextInt();
        while ( counter > 20 ||counter < 1 ) //check if number is between 1 and 20
        {
            counter = input.nextInt();
        }
        return counter;
    } //end method
} //end class
