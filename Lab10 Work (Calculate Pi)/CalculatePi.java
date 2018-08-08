/**
 * Calculates Pi
 *
 * Output:
 * 1 4.000000000
2 2.666666508
3 3.466666460
4 2.895237923
5 3.339682341
6 2.976046085
7 3.283738375
8 3.017071724
9 3.252365828
10 3.041839600

100000 3.141582654 0.000318310
200000 3.141587654 0.000159155
300000 3.141589320 0.000106103
400000 3.141590154 0.000079577
500000 3.141590654 0.000063662
600000 3.141590987 0.000053052
700000 3.141591225 0.000045473
800000 3.141591404 0.000039789
900000 3.141591542 0.000035368
1000000 3.141591654 0.000031831
1100000 3.141591744 0.000028937
1200000 3.141591820 0.000026526
1300000 3.141591884 0.000024485
1400000 3.141591939 0.000022736
1500000 3.141591987 0.000021221
1600000 3.141592029 0.000019894
1700000 3.141592065 0.000018724
1800000 3.141592098 0.000017684
1900000 3.141592127 0.000016753
2000000 3.141592154 0.000015915

3.339682341
 *
 * @authors)
 * (Names redacted, group work)
 *
 * @version (11/11/2016)
 */

public class CalculatePi
{
    public static void main(String[] args)
    {
        int termnum = 1;
        float pidivision = 1;
        float calpi = 0;
        float pione = 4;

        while( termnum <= 10 )
        {
            if( termnum % 2 == 0 )
            {
                calpi = calpi - pione/pidivision;
            }
            else
            {
                calpi = calpi + pione/pidivision;
            }
            System.out.printf("%d %.9f\n", termnum, calpi);
            termnum++;
            pidivision += 2;
        }

        System.out.println();
        int termno = 1;
        double pierror = 0;
        double pidiv = 1;
        double cal2 = 0;
        double pi1 = 4;

        while( termno <= 2000000 )
        {
            if( termno % 2 == 0 )
            {
                cal2 = cal2 - pi1/pidiv;
            }
            else
            {
                cal2 = cal2 + pi1/pidiv;
            }

            pierror = (Math.PI-cal2)/Math.PI * 100.0;

            if ( termno % 100000 == 0 )
            {
                System.out.printf("%d %.9f %.9f\n", termno, cal2, pierror);
            }

            termno++;
            pidiv += 2;
        }

        calcPi( 5 );
    }

    public static float calcPi( int i)
    {
        int termnum = 1;
        float pidivision = 1;
        float calcPi = 0;
        float pione = 4;

        while( termnum <= i )
        {
            if( termnum % 2 == 0 )
            {
                calcPi = calcPi - pione/pidivision;
            }
            else
            {
                calcPi = calcPi + pione/pidivision;
            }
            termnum++;
            pidivision += 2;
        }

        System.out.printf( "\n%.9f", calcPi );
        return calcPi;
    }
}
