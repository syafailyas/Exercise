package Exercise_03;

import java.util.Scanner;

public class Number_02
{
    public static class FibonacciSequence
    {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);

            // Input the number of terms in the Fibonacci sequence
            System.out.print("Enter the number of terms in the Fibonacci sequence: ");
            int n = scanner.nextInt();

            // Calculate and output the Fibonacci sequence iteratively
            System.out.println("Fibonacci sequence using iteration:");
            for (int i = 0; i <= n; i++)
            {
                System.out.print(fibonacciIterative(i) + " ");
            }
            System.out.println();

            // Calculate and output the Fibonacci sequence recursively
            System.out.println("Fibonacci sequence using recursion:");
            for (int i = 0; i <= n; i++)
            {
                System.out.print(fibonacciRecursive(i) + " ");
            }
            System.out.println();

            scanner.close();
        }

        // Function to calculate the Fibonacci sequence iteratively
        public static int fibonacciIterative(int n)
        {
            if (n <= 1)
            {
                return n;
            }
            int fibPrev = 0;
            int fibCurr = 1;
            for (int i = 2; i <= n; i++)
            {
                int fibNext = fibPrev + fibCurr;
                fibPrev = fibCurr;
                fibCurr = fibNext;
            }
            return fibCurr;
        }

        // Function to calculate the Fibonacci sequence recursively
        public static int fibonacciRecursive(int n)
        {
            if (n <= 1)
            {
                return n;
            }
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
    }
}