package Built_inFunc.Problem_Statement_1;

import java.util.*;

public class GcdLcmCalculator {
    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int g = gcd(a, b), l = (a * b) / g;
        System.out.println("GCD: " + g + " LCM: " + l);
    }
}
