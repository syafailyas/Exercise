package Exercise_02;

import java.util.Scanner;

public class Number_01
{
    public static class StringReversal
    {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to input a string
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            // Reverse the string using the reverseString method
            String reversed = reverseString(input);

            // Output the reversed string
            System.out.println("Reversed string: " + reversed);

            scanner.close();
        }

        public static String reverseString(String str)
        {
            char[] charArray = str.toCharArray();
            int left = 0;
            int right = charArray.length - 1;

            // Loop to reverse the string
            while (left < right)
            {
                // Swap characters at left and right indices
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;

                // Move towards the center of the string
                left++;
                right--;
            }

            // Convert the character array back to a string
            return new String(charArray);
        }
    }
}