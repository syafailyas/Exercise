package Exercise_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Number_05
{
    public static class TwoSum
    {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            List<Integer> numberList = new ArrayList<>();

            // Input numbers until the user chooses to stop
            char choice;
            do
            {
                System.out.print("Enter nums: ");
                int num = scanner.nextInt();
                numberList.add(num);
                System.out.print("Do you want to continue? (y/n): ");
                choice = scanner.next().charAt(0);
            }
            while (choice == 'y' || choice == 'Y');

            // Convert list to array
            int[] number = new int[numberList.size()];
            for (int i = 0; i < numberList.size(); i++)
            {
                number[i] = numberList.get(i);
            }

            // Input the target value
            System.out.print("Enter target: ");
            int target = scanner.nextInt();

            // Find the indices of the two numbers that add up to target
            int[] result = twoSum(number, target);

            // Output the result
            System.out.println("Output: [" + result[0] + ", " + result[1] + "]");

            scanner.close();
        }

        public static int[] twoSum(int[] number, int target)
        {
            for (int i = 0; i < number.length; i++)
            {
                for (int j = i + 1; j < number.length; j++)
                {
                    if (number[i] + number[j] == target)
                    {
                        return new int[] {i, j};
                    }
                }
            }
            return new int[0];
        }
    }
}