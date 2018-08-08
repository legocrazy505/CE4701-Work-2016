
/**
 * Methods to calculate mean, minimum, factorial, binomial coefficients, square, sum of n numbers,
 * product of n to m numbers, sum of squares and compound interest.
 * 
 * @author (name redacted) 
 * @version (31/10/2016)
 */
public class MyMath
{
   /**
    * Finds the average of 4 real numbers
    * @param a first parameter
    * @param b second parameter
    * @param c third parameter
    * @param d fourth parameter
    * @return the average of the 4 parameters
    */
   public static double mean4(double a, double b, double c, double d)
   {
       double sum;
       sum = a + b + c + d;
       return sum/4.0;
   }
    
   /**
    * Finds the minimum of 3 integers
    * @param a first parameter
    * @param b second parameter
    * @param c third parameter
    * @return the minimum of the 3 parameters
    */
   public static int min(int a, int b, int c)
   {
       int min = 0;
       
       if ( a <= b && a <= c )
       {
           min = a;
       }
       
       if ( b <= a && b <= c )
       {
           min = b;
       }
       
       if ( c <= a && c <= b )
       {
           min = c;
       }
       
       return min;
   }
   
   /**
    * Finds the minimum of 3 doubles
    * @param a first parameter
    * @param b second parameter
    * @param c third parameter
    * @return the minimum of 3 doubles
    */
   public static double mindouble(double a, double b, double c)
   {
       double min = 0;
       
         if ( a <= b && a <= c )
       {
           min = a;
       }
       
       if ( b <= a && b <= c )
       {
           min = b;
       }
       
       if ( c <= a && c <= b )
       {
           min = c;
       }
       
       return min;
   }
   
   /**
    * Calculate n factorial (n!) where n <= 20.
    * @param n the argument whose factorial is required
    * @return the factorial of the argument
    */
   public static long factorial(int n)
   {
       long result = 1;
       int counter = 2;
       while (counter <=n)
       {
           result = result * counter;
           counter++;
       }
       
       return result;
   }
   
   /**
    * Calculates the binomial coefficients (n choose k)
    * @param n first parameter
    * @param k second parameter
    * @return the binomial coefficient of the method
    */
   public static long biCoeff(int n, int k)
   {
       if (k>n-k)
       {
           k=n-k;
       }
       
       long b=1;
       for (int i=1, m=n; i<=k; i++, m--)
            b=b*m/i;
       
       return b;
   }
   
   /**
    * Calculates the a to the power of b
    * @param a base
    * @param b power
    * @return value of the first argument to the power of the second argument
    */
   public static int power(int a, int b)
   {
      int result = 1;
      
      for( int i = 1; i <= a; i++)
      {
          result *= a;
          if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
          {
              return -1;
          }
      }
      
      return result;
   }
   
   /**
    * Calculates the sum of the first n natural numbers
    * @param n first parameter, natural number
    * @return sum of n natural numbers
    */
   public static int sum(int n)
   {
       int sum = 0;
       
       for (int i = 0; i <= n; i++)
       {
           sum = sum + i;
       }
       
       return sum;
   }
   
   /**
    * Calculates the product of numbers in the range m to n inclusive
    * @param m first parameter first number
    * @param n second parameter final number
    * @return product of numbers m*(m+1)*(m+2)*...*n
    */
   public static long product(long m, long n)
   {
       long prod = 1;
       
       for (int i = 1; i < n; i++)
       {
           prod *= m+i;
       }
       long result = prod*n*m;
       return result;
   }
   
   /**
    * Calculates the sum of squares
    * @param m first parameter end square
    * @param n second parameter start square
    * @return product of squares from n to m
    */
   public static int sumpower(int n, int m)
   {
       int squareValue;
       int sum = 0;
       
       while (n <= m)
       {
           squareValue= (n*n);
           
           sum += squareValue;
           
           n++;
       }
       
       return sum;
   }
   
   /**
    * Calculates compound interest
    * @param p principal
    * @param r interest rate
    * @param t time
    * @return compound interest
    */
   public static double compinterest(double p, double r, double t)
   {
       double compoundInt = 0;
       
       compoundInt = p*Math.pow((1+ r/100),t);
       
       return compoundInt;
   }
}
