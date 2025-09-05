package Methods.Level1;

import java.util.Scanner;

public class TriangularPark {
    public void calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        int rounds = (int) Math.ceil(5000 / perimeter);
        System.out.println("Rounds required: " + rounds);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        TriangularPark obj = new TriangularPark();
        obj.calculateRounds(a, b, c);
    }
}
