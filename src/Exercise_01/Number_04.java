package Exercise_01;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Number_04
{
    public static class DateDifference
    {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);

            // Input date1
            System.out.print("Enter the first date in the format yyyy-MM-dd: ");
            String date1String = scanner.nextLine();
            LocalDate date1 = LocalDate.parse(date1String);

            // Input date2
            System.out.print("Enter the second date in the format yyyy-MM-dd: ");
            String date2String = scanner.nextLine();
            LocalDate date2 = LocalDate.parse(date2String);

            // Calculate difference in days
            long differenceInDays = ChronoUnit.DAYS.between(date1, date2);

            // Output the result
            System.out.println("Difference between the dates in days: " + differenceInDays);

            scanner.close();
        }
    }
}