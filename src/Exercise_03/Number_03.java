package Exercise_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Number_03
{
    public static class RemoveOddNumbers
    {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            List<Integer> numbers = new ArrayList<>();

            // Input numbers until user chooses to stop
            char choice;
            do
            {
                System.out.print("Enter a number: ");
                int num = scanner.nextInt();
                if (num % 2 == 0)
                {
                    numbers.add(num);
                }
                System.out.print("Do you want to continue? (y/n): ");
                choice = scanner.next().charAt(0);
            }
            while (choice == 'y' || choice == 'Y');

            // Convert list to array and output the result
            int[] resultArray = convertListToArray(numbers);
            System.out.print("Output: ");
            for (int num : resultArray)
            {
                System.out.print(num + " ");
            }
        }

        public static int[] convertListToArray(List<Integer> list)
        {
            int[] array = new int[list.size()];
            for (int i = 0; i < list.size(); i++)
            {
                array[i] = list.get(i);
            }
            return array;
        }
    }
}