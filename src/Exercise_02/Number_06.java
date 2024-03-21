package Exercise_02;

import java.util.Scanner;

public class Number_06
{
    public static class SwapCase
    {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);

            // Input the string
            System.out.print("Enter a string: ");
            String inputString = scanner.nextLine();

            // Swap the case of each character in the string
            String swappedString = swapCase(inputString);

            // Output the result
            System.out.println("Swapped string: " + swappedString);

            scanner.close();
        }

        public static String swapCase(String str)
        {
            StringBuilder swappedString = new StringBuilder();

            for (int i = 0; i < str.length(); i++)
            {
                char c = str.charAt(i);

                // Check if the character is uppercase
                if ( Character.isUpperCase(c) )
                {
                    // Convert uppercase character to lowercase
                    swappedString.append( Character.toLowerCase(c) );
                }
                else if ( Character.isLowerCase(c) )
                {
                    // Convert lowercase character to uppercase
                    swappedString.append( Character.toUpperCase(c) );
                }
                else
                {
                    // If the character is not a letter, keep it unchanged
                    swappedString.append(c);
                }
            }

            return swappedString.toString();
        }
    }
}