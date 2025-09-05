package Methods.Level2;

import java.util.*;

public class Factors {
    public int[] getFactors(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                c++;
        int[] f = new int[c];
        int k = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                f[k++] = i;
        return f;
    }

    public int sum(int[] a) {
        int s = 0;
        for (int x : a)
            s += x;
        return s;
    }

    public int sumSq(int[] a) {
        int s = 0;
        for (int x : a)
            s += x * x;
        return s;
    }

    public int product(int[] a) {
        int p = 1;
        for (int x : a)
            p *= x;
        return p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Factors obj = new Factors();
        int[] f = obj.getFactors(n);
        System.out.println("Factors: " + Arrays.toString(f));
        System.out.println("Sum: " + obj.sum(f));
        System.out.println("SumSq: " + obj.sumSq(f));
        System.out.println("Product: " + obj.product(f));
    }
}
