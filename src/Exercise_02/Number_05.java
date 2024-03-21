package Exercise_02;

import java.util.Scanner;

public class Number_05
{
    public static class PalindromeChecker
    {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);

            // Input the string
            System.out.print("Enter a string: ");
            String inputString = scanner.nextLine();

            // Check if the string is a palindrome
            boolean isPalindrome = checkPalindrome(inputString);

            // Output the result
            if (isPalindrome)
            {
                System.out.println("Palindrome");
            }
            else
            {
                System.out.println("Not a palindrome");
            }

            scanner.close();
        }

        public static boolean checkPalindrome(String str)
        {
            // Convert the string to lowercase to handle case-insensitive palindrome check
            str = str.toLowerCase();

            // Initialize pointers for the start and end of the string
            int start = 0;
            int end = str.length() - 1;

            // Loop until the pointers meet in the middle
            while (start < end)
            {
                // Compare characters at the current positions
                if ( str.charAt(start) != str.charAt(end) )
                {
                    return false; // If characters don't match, it's not a palindrome
                }
                // Move the pointers towards the middle
                start++;
                end--;
            }

            // If the loop completes without returning false, the string is a palindrome
            return true;
        }
    }
}