package Exercise_01;

import java.util.Scanner;

public class Number_02
{
    public static class CircleProperties
    {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();

            double diameter = calculateDiameter(radius);
            double circumference = calculateCircumference(radius);
            double area = calculateArea(radius);

            System.out.println("Diameter of the circle: " + diameter);
            System.out.println("Circumference of the circle: " + circumference);
            System.out.println("Area of the circle: " + area);

            scanner.close();
        }

        public static double calculateDiameter(double radius)
        {
            return 2 * radius;
        }

        public static double calculateCircumference(double radius)
        {
            return 2 * Math.PI * radius;
        }

        public static double calculateArea(double radius)
        {
            return Math.PI * radius * radius;
        }
    }
}