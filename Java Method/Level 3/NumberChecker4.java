import java.util.Scanner;
public class NumberChecker4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Prime: " + isPrime(number));
        System.out.println("Neon: " + isNeon(number));
        System.out.println("Spy: " + isSpy(number));
        System.out.println("Automorphic: " + isAutomorphic(number));
        System.out.println("Buzz: " + isBuzz(number));
    }
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) if (num % i == 0) return false;
        return true;
    }
    public static boolean isNeon(int num) {
        int sq = num * num, sum = 0;
        while (sq > 0) {
            sum += sq % 10;
            sq /= 10;
        }
        return sum == num;
    }
    public static boolean isSpy(int num) {
        int sum = 0, prod = 1, n = num;
        while (n > 0) {
            int d = n % 10;
            sum += d;
            prod *= d;
            n /= 10;
        }
        return sum == prod;
    }
    public static boolean isAutomorphic(int num) {
        int sq = num * num;
        return String.valueOf(sq).endsWith(String.valueOf(num));
    }
    public static boolean isBuzz(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }
}
