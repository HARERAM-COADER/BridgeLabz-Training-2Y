import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] factors = findFactors(number);
        int sum = findSum(factors);
        long product = findProduct(factors);
        double cubeProduct = productOfCubes(factors);
        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println("\nGreatest Factor: " + factors[factors.length - 1]);
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Product of Cubes: " + cubeProduct);
    }
    public static int[] findFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) if (num % i == 0) count++;
        int[] arr = new int[count];
        int idx = 0;
        for (int i = 1; i <= num; i++) if (num % i == 0) arr[idx++] = i;
        return arr;
    }
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int n : arr) sum += n;
        return sum;
    }
    public static long findProduct(int[] arr) {
        long prod = 1;
        for (int n : arr) prod *= n;
        return prod;
    }
    public static double productOfCubes(int[] arr) {
        double prod = 1;
        for (int n : arr) prod *= Math.pow(n, 3);
        return prod;
    }
}
