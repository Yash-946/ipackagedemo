package i1;

import java.math.BigInteger;

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
        System.out.println(factorial(3));
    }
}
