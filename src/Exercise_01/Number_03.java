package Exercise_01;

import java.util.Scanner;

public class Number_03
{
    public static class TriangleAngles
    {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the first angle (in degrees): ");
            double a = scanner.nextDouble();

            System.out.print("Enter the second angle (in degrees): ");
            double b = scanner.nextDouble();

            double c = findThirdAngle(a, b);

            System.out.println("The third angle is: " + c + " degrees");

            scanner.close();
        }

        public static double findThirdAngle(double a, double b)
        {
            // Total sum of angles in a triangle is 180 degrees
            return 180 - a - b;
        }
    }
}