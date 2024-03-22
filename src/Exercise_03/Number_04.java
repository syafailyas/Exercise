package Exercise_03;

import java.util.Scanner;

public class Number_04
{
    public static class FizzBuzz
    {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);

            // Input the number of times to loop
            System.out.print("Enter the value of n: ");
            int n = scanner.nextInt();

            // Print the FizzBuzz sequence
            fizzBuzz(n);

            scanner.close();
        }

        public static void fizzBuzz(int n)
        {
            for (int i = 1; i <= n; i++)
            {
                if (i % 3 == 0 && i % 5 == 0)
                {
                    System.out.print("FizzBuzz");
                }
                else if (i % 3 == 0)
                {
                    System.out.print("Fizz");
                }
                else if (i % 5 == 0)
                {
                    System.out.print("Buzz");
                }
                else
                {
                    System.out.print(i);
                }

                // Print comma and space for formatting, except for the last number
                if (i != n)
                {
                    System.out.print(", ");
                }
            }
        }
    }
}