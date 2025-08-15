import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base of the triangle (in inches): ");
        double base = input.nextDouble();

        System.out.print("Enter the height of the triangle (in inches): ");
        double height = input.nextDouble();

        double areaInInches = 0.5 * base * height;
        double areaInCm = areaInInches * 2.54 * 2.54; // 1 inch = 2.54 cm

        System.out.println("The area of the triangle in square inches is " + areaInInches 
            + " and in square centimeters is " + areaInCm);

        input.close();
    }
}
