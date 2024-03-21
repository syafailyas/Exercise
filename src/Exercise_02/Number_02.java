package Exercise_02;

import java.util.Scanner;

public class Number_02
{
    public static class CentimeterToKilometer
    {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to input the length in centimeters
            System.out.print("Enter length in centimeters: ");
            int centimeters = scanner.nextInt();

            // Convert centimeters to kilometers
            int kilometers = convertToKilometers(centimeters);

            // Output the result
            System.out.println(centimeters + " cm is equal to " + kilometers + " km");

            scanner.close();
        }

        public static int convertToKilometers(int centimeters)
        {
            // 1 kilometer = 100,000 centimeters
            return centimeters / 100000;
        }
    }
}