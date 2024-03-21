package Exercise_02;

import java.util.ArrayList;
import java.util.Scanner;

public class Number_03
{
    public static class InputReader
    {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Integer> numbers = new ArrayList<>();

            // Prompt the user to enter numbers until they choose to stop
            char choice;
            do
            {
                System.out.print("Enter a number: ");
                int number = scanner.nextInt();
                numbers.add(number);

                System.out.print("Do you want to continue? (y/n): ");
                choice = scanner.next().charAt(0);
            }
            while (choice == 'y' || choice == 'Y');

            // Print the numbers entered by the user
            System.out.print("You entered: ");
            for (int num : numbers)
            {
                System.out.print(num + " ");
            }

            scanner.close();
        }
    }
}