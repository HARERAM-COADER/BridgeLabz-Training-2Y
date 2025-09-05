package Methods.Level3;

import java.util.*;

public class FootballHeights {
    public int sum(int[] a) {
        int s = 0;
        for (int x : a)
            s += x;
        return s;
    }

    public double mean(int[] a) {
        return sum(a) / (double) a.length;
    }

    public int min(int[] a) {
        int m = a[0];
        for (int x : a)
            if (x < m)
                m = x;
        return m;
    }

    public int max(int[] a) {
        int m = a[0];
        for (int x : a)
            if (x > m)
                m = x;
        return m;
    }

    public static void main(String[] args) {
        FootballHeights obj = new FootballHeights();
        int[] h = new int[11];
        for (int i = 0; i < 11; i++)
            h[i] = (int) (Math.random() * 101) + 150;
        System.out.println("Heights: " + Arrays.toString(h));
        System.out.println("Shortest: " + obj.min(h));
        System.out.println("Tallest: " + obj.max(h));
        System.out.println("Mean: " + obj.mean(h));
    }
}
