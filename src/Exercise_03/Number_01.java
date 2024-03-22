package Exercise_03;

import java.util.Scanner;

public class Number_01
{
    public static class SimpleCalculator
    {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);

            // Input first number
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            // Input second number
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            // Input operator (+, -, *, /)
            System.out.print("Enter the operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            // Perform the operation based on the operator
            int result;
            switch (operator)
            {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    // Check if the divisor (num2) is not zero
                    if (num2 != 0)
                    {
                        result = num1 / num2;
                    }
                    else
                    {
                        System.out.println("Error: Division by zero is not allowed");
                        return; // Exit the program if division by zero is attempted
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator");
                    return; // Exit the program if an invalid operator is provided
            }

            // Output the result
            System.out.println("Result: " + result);

            scanner.close();
        }
    }
}