package i1;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    static BigInteger sum = new BigInteger("1");

    public static BigInteger factorial(int num)
    {
        for (int i = 1; i <=num ; i++)
        {
//            sum = sum*i;
            sum = sum.multiply(BigInteger.valueOf(i));
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println(factorial(s.nextInt()));
    }
}
