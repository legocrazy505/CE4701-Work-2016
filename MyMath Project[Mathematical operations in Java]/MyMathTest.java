/**
 * Tests methods in MyMath with set inputs.
 * 
 * @author (name redacted}
 * @version (31/10/2016)
 */
public class MyMathTest
{
    public static void main(String[] args)
    {
        /**
         * Name: mean4 test
         * Purpose: test mean4 method
         * Inputs: a = 1, b = 2, c = 3, d = 4
         * Expected output: 2.5
         */
        System.out.println("mean4: test");
        System.out.println("mean4(1, 2, 3, 4) is ");
        double mean4Result = MyMath.mean4(1, 2, 3, 4);
        System.out.println( mean4Result );
        if (mean4Result == 2.5)
        {
            System.out.println("Test passed\n");
        }
        else
        {
            System.out.println("Test failed\n");
        }

        /**
         * Name: min test
         * Purpose: test min method
         * Inputs: a = 1, b = 5, c = 1
         * Expected output: 1
         */
        System.out.println("min: test");
        System.out.println("min(2, 5, 1) is ");
        int minresult = MyMath.min( 2, 5, 1);
        System.out.println( minresult );
        if (minresult == 1)
        {
            System.out.println("Test passed\n");
        }
        else
        {
            System.out.println("Test failed\n");
        }

        /**
         * Name: mindouble test
         * Purpose: test mindouble method
         * Inputs: a = 42.50, b = 79, c = 42
         * Expected output: 42
         */
        System.out.println("mindouble: test");
        System.out.println("mindouble(42.50, 79.00, 42.00) is ");
        double mindoubleresult = MyMath.mindouble( 42.50, 79.00, 42.00 );
        System.out.println( mindoubleresult );
        if (mindoubleresult == 42)
        {
            System.out.println("Test passed\n");
        }
        else
        {
            System.out.println("Test failed\n");
        }

        /**
         * Name: factorial test
         * Purpose: test factorial method
         * Inputs: n = 5
         * Expected: 120
         */       
        System.out.println("factorial: test");
        System.out.println("factorial(5) is ");
        long factorialresult = MyMath.factorial( 5 );
        System.out.println( factorialresult );
        if (factorialresult == 120)
        {
            System.out.println("Test passed\n");
        }
        else
        {
            System.out.println("Test failed\n");
        }

        /**
         * Name: biCoeff test
         * Purpose: test biCoeff method
         * Inputs: n = 6, k = 2
         * Expected: 15
         */        
        System.out.println("biCoeff: test");
        System.out.println("biCoeff(6, 2) is ");
        long biCoeffresult = MyMath.biCoeff( 6, 2 );
        System.out.println( biCoeffresult );
        if (biCoeffresult == 15)
        {
            System.out.println("Test passed\n");
        }
        else
        {
            System.out.println("Test failed\n");
        }

        /**
         * Name: power test
         * Purpose: test power method
         * Inputs: a = 2 b = 2
         * Expected: 4
         */        
        System.out.println("power: test");
        System.out.println("power( 2, 2) is ");
        int powerresult = MyMath.power( 2, 2 );
        System.out.println( powerresult );
        if (powerresult == 4)
        {
            System.out.println("Test passed\n");
        }
        else
        {
            System.out.println("Test failed\n");
        }

        /**
         * Name: sum test
         * Purpose: test sum method
         * Inputs: n = 10
         * Expected: 55
         */        
        System.out.println("sum: test");
        System.out.println("sum(10) is ");
        int sumresult = MyMath.sum( 10 );
        System.out.println( sumresult );
        if (sumresult == 55)
        {
            System.out.println("Test passed\n");
        }
        else
        {
            System.out.println("Test failed\n");
        }

        /**
         * Name: product test
         * Purpose: test product method
         * Inputs: m = 1, n = 5
         * Expected: 600
         */
        System.out.println("product: test");
        System.out.println("product(1, 5) is ");
        long productresult = MyMath.product( 1, 5 );
        System.out.println( productresult );
        if (productresult == 600)
        {
            System.out.println("Test passed\n");
        }
        else
        {
            System.out.println("Test failed\n");
        }

        /**
         * Name: sumpower test
         * Purpose: test sumpower method
         * Inputs: n = 1, m = 4
         * Expected: 30
         */        
        System.out.println("sumpower: test");
        System.out.println("sumpower(1, 4 ) is ");
        int sumpowerresult = MyMath.sumpower( 1, 4 );
        System.out.println( sumpowerresult );
        if (sumpowerresult == 30)
        {
            System.out.println("Test passed\n");
        }
        else
        {
            System.out.println("Test failed\n");
        }

        /**
         * Name: compinterest test
         * Purpose: test compinterest method
         * Inputs: p = 1000, r = 4, t = 1
         * Expected: 1040
         */
        System.out.println("compinterest: test");
        System.out.println("compinterest(1000, 4, 1) is ");
        double compinterestresult = MyMath.compinterest( 1000, 4, 1 );
        System.out.println ( compinterestresult );
        if (compinterestresult == 1040)
        {
            System.out.println("Test passed\n");
        }
        else
        {
            System.out.println("Test failed\n");
        }
    }
}
