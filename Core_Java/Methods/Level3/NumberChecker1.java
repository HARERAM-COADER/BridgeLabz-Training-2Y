package Methods.Level3;

import java.util.*;

public class NumberChecker1 {
    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    public static int[] digits(int n) {
        String s = "" + n;
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++)
            d[i] = s.charAt(i) - '0';
        return d;
    }

    public static boolean isDuck(int[] d) {
        for (int x : d)
            if (x == 0)
                return true;
        return false;
    }

    public static boolean isArmstrong(int[] d) {
        int p = d.length, s = 0;
        for (int x : d)
            s += Math.pow(x, p);
        int n = 0;
        for (int x : d)
            n = n * 10 + x;
        return n == s;
    }

    public static int[] largestTwo(int[] d) {
        int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE;
        for (int x : d) {
            if (x > l1) {
                l2 = l1;
                l1 = x;
            } else if (x > l2)
                l2 = x;
        }
        return new int[] { l1, l2 };
    }

    public static int[] smallestTwo(int[] d) {
        int s1 = Integer.MAX_VALUE, s2 = Integer.MAX_VALUE;
        for (int x : d) {
            if (x < s1) {
                s2 = s1;
                s1 = x;
            } else if (x < s2)
                s2 = x;
        }
        return new int[] { s1, s2 };
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = digits(n);
        System.out.println("Duck: " + isDuck(d));
        System.out.println("Armstrong: " + isArmstrong(d));
        System.out.println("Largest2: " + Arrays.toString(largestTwo(d)));
        System.out.println("Smallest2: " + Arrays.toString(smallestTwo(d)));
    }
}
