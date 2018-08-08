/**
 * DataArray
 *
 * This class demonstrates arrays.
 * Students (names redacted, group work)
 *
 * Example output:
 * Using arrays and finding the sum and average.
 * The array with 4 elements is [1.1, 5.2, 0.3, 3.4]
 * The sum of the array elements [1.1, 5.2, 0.3, 3.4] is 10.0
 * The sum of the array elements [1.1, 5.2, 0.3, 3.4] is 10.0
 * The average of [1.1, 5.2, 0.3, 3.4] is 2.5
 * The minimum of [1.1, 5.2, 0.3, 3.4] is 0.3
 * The maximum of [1.1, 5.2, 0.3, 3.4]is 5.2
 * The range of [1.1, 5.2, 0.3, 3.4]is 4.9

 * Using arrays and finding the average, min and sum.
 * How many numbers: 2
 * Enter lower and upper range limits: 0 3
 * Enter number 0: 1
 * Enter number 1: 2
 *
 * The array with 2 elements is [1.0, 2.0]
 *
 * The sum of the array elements [1.0, 2.0] is 3.0
 * The average of [1.0, 2.0] is 1.5
 * The minimum of [1.0, 2.0] is 1.0
 * The maximum of [1.0, 2.0]is 2.0
 *
 * After fill with 1.8, the array is [1.8, 1.8, 1.8, 1.8, 1.8]
 */
/*
 * Below is an outline for the CE4701 DataArray project for Weeks 11 and 12.
 * John Nelson 9 Nov 2016
 */

import java.util.Scanner;

public class DataArray
{
    /**
     * Test the array methods
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        System.out.println("Using arrays and finding the sum and average.");
        // a/ Create and initialise the array of requested real data values

        // b/ Read toString() below and review test code.

        //    Replace test array with the above array name and output as requested.
        double[] dataArray ={1.1, 5.2, 0.3, 3.4};
        System.out.printf("The array with %d elements is ", dataArray.length);
        String str = toString( dataArray );
        System.out.println( str );

        // c/ Write code to calculate and display the sum of the elements of the array
        double sum = 0;
        for( int counter = 0; counter < dataArray.length; counter++) //loop to sum all elements
        {
            sum += dataArray[ counter ];
        }

        System.out.printf("The sum of the array elements ");
        String str1 = toString( dataArray );
        System.out.printf( str1 );
        System.out.printf(" is %.1f", sum);

        // d/ Create a method calcSum,  call it, and  display the numbers and the sum
        sum = calcSum(dataArray); //call method
        System.out.printf("\nThe sum of the array elements ");
        System.out.printf( str1 );
        System.out.printf(" is %.1f", sum);

        // e/ Create a method calcAvg,  call it, and  display the numbers and their average
        double avg = 0;
        avg = calcAvg(dataArray); //call method
        System.out.printf("\nThe average of ");
        System.out.printf( str1 );
        System.out.printf(" is %.1f", avg);

        double min = 0;
        min = calcMin(dataArray);
        System.out.printf("\nThe minimum of ");
        System.out.printf( str1 );
        System.out.printf(" is %.1f", min);

        double max =0;
        max = calcMax(dataArray);
        System.out.printf("\nThe maximum of ");
        System.out.printf (str1 );
        System.out.printf("is %.1f", max);

        double range = 0;
        range = calcRange(dataArray);
        System.out.printf("\nThe range of ");
        System.out.printf (str1 );
        System.out.printf("is %.1f\n", range);

        //use makeArray method to create a new array
        double arrayName[] = makeArray();
        //display the list of elements
        System.out.printf("\nThe array with %d elements is ", arrayName.length);
        String str2 = toString( arrayName );
        System.out.println( str2 );

        //display sum, average, minimum and maximum values of the array
        double sumNew = 0;
        sumNew = calcSum(arrayName); //call method
        System.out.printf("\nThe sum of the array elements ");
        System.out.printf( str2 );
        System.out.printf(" is %.1f", sumNew );

        double avgNew = 0;
        avgNew = calcAvg(arrayName); //call method
        System.out.printf("\nThe average of ");
        System.out.printf( str2 );
        System.out.printf(" is %.1f", avgNew);

        double minNew = 0;
        minNew = calcMin(arrayName);
        System.out.printf("\nThe minimum of ");
        System.out.printf( str2 );
        System.out.printf(" is %.1f", minNew);

        double maxNew =0;
        maxNew = calcMax(arrayName);
        System.out.printf("\nThe maximum of ");
        System.out.printf( str2 );
        System.out.printf("is %.1f", maxNew);

        //call fill method for a new array of 5 elements and display results
        double[] array = new double[5];
        fill( array, 1.8 );
        String str3 = toString( array ); //using toString method for the array
        System.out.printf("\n\nAfter fill with 1.8, the array is ");
        System.out.printf( str3 );

    }

    /**
     * Calculates sum of elements in an array
     * @param a double array
     * @result sum of all array elements
     */
    public static double calcSum( double[] array)
    {
        double calcSum = 0;

        for( int counter = 0; counter < array.length; counter++) //loop to sum array elements
        {
            calcSum += array[ counter ];
        }

        return calcSum;
    }

    /**
     * Calculates average
     * @param a double array
     * @result average of all elements
     */
    public static double calcAvg( double[] array)
    {
        double sum = 0;
        double calcAvg = 0;

        for( int counter = 0; counter < array.length; counter++) //for loop to calculate the sum of elements
        {
            sum += array[ counter ];
        }

        calcAvg = sum/array.length; //divide sum by the array length

        return calcAvg;
    }

    /**
     * Returns a string representation of the array i.e. a comma separated list
     * of elements within [ ].  Similar to java.util.Arrays.toString(double[] a) method.
     * Each array element will be displayed by String.valueOf(double).
     * @param array  the array whose string representation is required
     * @return a string representation of array
     */
    public static String toString( double[] array )
    {
        String arrayStr = "[";

        for ( int i = 0; i < array.length; i++)
        {
            if (i > 0)              // Insert comma separator after first one
                arrayStr += ", ";
            arrayStr += String.valueOf( array[i] );
        }
        arrayStr += "]";
        return arrayStr;
    }

    /**
     * Input a set of elements and store in the created array. The user specifies
     * the size of the array, and enters the elements.
     * @return the created array
     */
    public static double[] makeArray()
    {
        final String format = "%.2f";       // Use consistent format for printing numbers
        Scanner input = new Scanner( System.in );
        System.out.print("\nUsing arrays and finding the average, min and sum.");
        System.out.print("\nHow many numbers: ");
        int numNumbers = input.nextInt( );

        System.out.print("Enter lower and upper range limits: ");
        double lower = input.nextDouble( );
        double upper = input.nextDouble( );

        // Declare and create the array:
        // type? []arrayName = new type? [ size? ];
        double []arrayName = new double [ numNumbers ];

        // Code below gets a single number, and must be modified to get multiple numbers
        // and store them in the array
        int index = 0;
        // Replace while condition with an appropriate check for number
        for (index =0; index < numNumbers; index++) //loop to input all array elements
        {
            System.out.printf("Enter number %d: ", index /*Will need to replace 0 with index*/ );
            double number = input.nextDouble( );
            while ( number > upper || number < lower ) //check if in between range limits
            {
                System.out.print("Please re-enter in range ");
                System.out.printf("[" + format + " to " + format + "]: ", lower, upper );
                number = input.nextDouble( );
                arrayName[index] = number;
            }
            arrayName[index] = number; //add number to array
        }
        // replace with arrayName create above.
        return arrayName;
    }

    /**
     * Finds the minimum element in an array
     * @param a double array
     * @result minimum element in an array
     */
    public static double calcMin( double[] array )
    {
        double min = Double.MAX_VALUE; //set min to maximum value a double can hold

        for(int i = 0; i < array.length; i++)
        {
            if( array[i] < min)
            {
                min = array[i]; //if array element is less than min assign it to min
            }
        }

        return min;
    }

    /**
     * Finds the maximum element in an array
     * @param a double array
     * @result maximum element in an array
     */
    public static double calcMax( double[] array)
    {
        double max =Double.MIN_VALUE; //set max to the minimum value a double can hold

        for (int i =0; i< array.length; i++)
        {
            if ( array[i] > max)
            {
                max = array[i]; // if the array element is greater than max then assign it to max
            }
        }

        return max;
    }

    /**
     * Finds the range of an array
     * @param a double array
     * @result range of an array
     */
    public static double calcRange ( double [] array)
    {
        double range = 0;

        double max = 0;
        max = calcMax(array); //invoke calcMax method for this array

        double min = 0;
        min = calcMin(array); //invoke calcMin method for this array

        range = max - min; //set range equal to the max minus min

        return range; //return value
    }

    /**
     * Fills an array with a set value
     * @param1 a double array
     * @param2 a double value
     * @result all array elements set to value
     */public static void fill( double[] array, double value )
    {
        for( int i = 0; i < array.length; i++ ) //for loop to loop through each element
        {
            array[i] = value; //set each element in the array to the set value
        }
    }

}
