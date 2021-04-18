import java.io.*;
	 
class fabbonachiSum {

    static int calculateSum(int n)

    {

        if (n <= 0)

           return 0;
        
        int fibo[]=new int[n+1];

        fibo[0] = 0; fibo[1] = 1;

        int sum = fibo[0] + fibo[1];

        for (int i=2; i<=n; i++)

        {

            fibo[i] = fibo[i-1]+fibo[i-2];

            sum += fibo[i];

        }

        return sum;

    }

    public static void main(String args[])

    {

        int n = 100;

        System.out.println("Sum of Fibonacci" + " numbers is : "+ calculateSum(n));

    }
}
