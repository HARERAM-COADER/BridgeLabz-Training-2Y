import java.util.Scanner;

public class AthleteRounds {
    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double distance = 5000; // 5 km = 5000 m
        return distance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side1: ");
        double a = sc.nextDouble();
        System.out.print("Enter side2: ");
        double b = sc.nextDouble();
        System.out.print("Enter side3: ");
        double c = sc.nextDouble();

        double rounds = calculateRounds(a, b, c);
        System.out.println("Number of rounds needed: " + rounds);
    }
}
