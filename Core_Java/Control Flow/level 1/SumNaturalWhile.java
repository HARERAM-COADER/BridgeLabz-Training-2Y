import java.util.Scanner;

public class SumNaturalWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n > 0) {
            // Sum using while loop
            int sumWhile = 0;
            int i = 1;
            while (i <= n) {
                sumWhile += i;
                i++;
            }

            // Sum using formula
            int sumFormula = n * (n + 1) / 2;

            // Display results
            System.out.println("Sum using while loop: " + sumWhile);
            System.out.println("Sum using formula: " + sumFormula);

            // Compare
            if (sumWhile == sumFormula) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("Mismatch in computations.");
            }
        } else {
            System.out.println("The number is not a natural number.");
        }
    }
}

