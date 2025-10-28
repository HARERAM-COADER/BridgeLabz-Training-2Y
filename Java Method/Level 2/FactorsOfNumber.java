import java.util.Scanner;

public class FactorsOfNumber {

    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) factors[index++] = i;
        }
        return factors;
    }

    public static int findSum(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    public static int findProduct(int[] factors) {
        int product = 1;
        for (int f : factors) product *= f;
        return product;
    }

    public static int findSumOfSquares(int[] factors) {
        int sumSq = 0;
        for (int f : factors) sumSq += Math.pow(f, 2);
        return sumSq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        int[] factors = findFactors(number);
        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println("\nSum = " + findSum(factors));
        System.out.println("Sum of Squares = " + findSumOfSquares(factors));
        System.out.println("Product = " + findProduct(factors));
    }
}
