package Methods.Level3;

import java.util.*;

public class NumberChecker2 {
    public static int[] digits(int n) {
        String s = "" + n;
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++)
            d[i] = s.charAt(i) - '0';
        return d;
    }

    public static int sum(int[] d) {
        int s = 0;
        for (int x : d)
            s += x;
        return s;
    }

    public static int sumSq(int[] d) {
        int s = 0;
        for (int x : d)
            s += x * x;
        return s;
    }

    public static boolean isHarshad(int n, int[] d) {
        return n % sum(d) == 0;
    }

    public static int[][] frequency(int[] d) {
        int[][] f = new int[10][2];
        for (int i = 0; i < 10; i++)
            f[i][0] = i;
        for (int x : d)
            f[x][1]++;
        return f;
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = digits(n);
        System.out.println("Sum: " + sum(d));
        System.out.println("SumSq: " + sumSq(d));
        System.out.println("Harshad: " + isHarshad(n, d));
        System.out.println("Frequency:");
        for (int[] r : frequency(d))
            if (r[1] > 0)
                System.out.println(r[0] + ":" + r[1]);
    }
}
