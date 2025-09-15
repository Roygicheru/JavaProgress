package Area;

import java.util.Scanner;

public class Area {
    
    public void calculateTriangleArea() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base of the triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter height of the triangle: ");
        double height = scanner.nextDouble();

        double area = 0.5 * base * height;

        System.out.println("Area of Triangle: " + area);
        scanner.close();
    }

    // public static double calculateRectangleArea(double width, double height) {
    //     return width * height;
    // }
    

    // public static double calculateCircleArea(double radius) {
    //     return Math.PI * radius * radius;
    // }

    // public static double calculateTriangleArea(double base, double height) {
    //     return 0.5 * base * height;
    // }
}
