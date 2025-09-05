package Methods.Level3;

import java.util.*;

public class NumberChecker4 {
    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public static boolean isNeon(int n) {
        int s = 0, m = n * n;
        while (m > 0) {
            s += m % 10;
            m /= 10;
        }
        return s == n;
    }

    public static boolean isSpy(int n) {
        int s = 0, p = 1, m = n;
        while (m > 0) {
            int d = m % 10;
            s += d;
            p *= d;
            m /= 10;
        }
        return s == p;
    }

    public static boolean isAuto(int n) {
        return (n * n + "").endsWith(n + "");
    }

    public static boolean isBuzz(int n) {
        return n % 7 == 0 || n % 10 == 7;
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Prime: " + isPrime(n));
        System.out.println("Neon: " + isNeon(n));
        System.out.println("Spy: " + isSpy(n));
        System.out.println("Automorphic: " + isAuto(n));
        System.out.println("Buzz: " + isBuzz(n));
    }
}
