import java.util.Scanner;

public class Number_05
{
    public static class NameInitials
    {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your full name: ");
            String fullName = scanner.nextLine();

            String initials = getInitials(fullName);

            System.out.println("Your initials in uppercase: " + initials);

            scanner.close();
        }

        public static String getInitials(String fullName)
        {
            StringBuilder initials = new StringBuilder();
            String[] nameParts = fullName.split(" ");

            for (String part : nameParts)
            {
                initials.append( part.charAt(0) );
            }

            return initials.toString().toUpperCase();
        }
    }
}