package Exercise_01;

import java.util.Scanner;

public class Number_01
{
    public static class RectangleArea
    {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter length of the rectangle: ");
            int length = scanner.nextInt();

            System.out.print("Enter width of the rectangle: ");
            int width = scanner.nextInt();

            int area = calculateRectangleArea(length, width);
            System.out.println("Area of the rectangle: " + area);

            scanner.close();
        }

        public static int calculateRectangleArea(int length, int width)
        {
            return length * width;
        }
    }
}