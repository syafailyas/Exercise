package Exercise_02;

import java.util.Scanner;

public class Number_04
{
    public static class RemoveFirstOccurrenceLoop
    {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);

            // Input the string
            System.out.print("Enter the string: ");
            String inputString = scanner.nextLine();

            // Input the search string
            System.out.print("Enter the search string: ");
            String searchString = scanner.nextLine();

            // Remove the first occurrence of the search string from the input string
            String result = removeFirstOccurrence(inputString, searchString);

            // Output the result
            System.out.println("Result: " + result);

            scanner.close();
        }

        public static String removeFirstOccurrence(String inputString, String searchString)
        {
            // Find the index of the first occurrence of the search string
            int index = -1;
            int searchLength = searchString.length();
            for (int i = 0; i <= inputString.length() - searchLength; i++)
            {
                if ( inputString.substring(i, i + searchLength).equals(searchString) )
                {
                    index = i;
                    break;
                }
            }

            // If the search string is not found
            if (index == -1)
            {
                return "the search string is not found";
            }

            return inputString.substring(0, index) + inputString.substring(index + searchLength);
        }
    }
}