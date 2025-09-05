package Methods.Level3;

import java.util.*;

public class NumberChecker5 {
    public static int sumDiv(int n) {
        int s = 0;
        for (int i = 1; i < n; i++)
            if (n % i == 0)
                s += i;
        return s;
    }

    public static boolean isPerfect(int n) {
        return sumDiv(n) == n;
    }

    public static boolean isAbundant(int n) {
        return sumDiv(n) > n;
    }

    public static boolean isDeficient(int n) {
        return sumDiv(n) < n;
    }

    public static int fact(int x) {
        int f = 1;
        for (int i = 1; i <= x; i++)
            f *= i;
        return f;
    }

    public static boolean isStrong(int n) {
        int m = n, s = 0;
        while (m > 0) {
            s += fact(m % 10);
            m /= 10;
        }
        return s == n;
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Perfect: " + isPerfect(n));
        System.out.println("Abundant: " + isAbundant(n));
        System.out.println("Deficient: " + isDeficient(n));
        System.out.println("Strong: " + isStrong(n));
    }
}
