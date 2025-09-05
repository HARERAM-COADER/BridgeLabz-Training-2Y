package Methods.Level3;

import java.util.*;

public class FactorsExtended {
    public int[] factors(int n) {
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

    public int greatest(int[] f) {
        int m = 0;
        for (int x : f)
            if (x > m)
                m = x;
        return m;
    }

    public int sum(int[] f) {
        int s = 0;
        for (int x : f)
            s += x;
        return s;
    }

    public int product(int[] f) {
        int p = 1;
        for (int x : f)
            p *= x;
        return p;
    }

    public double cubeProduct(int[] f) {
        double p = 1;
        for (int x : f)
            p *= Math.pow(x, 3);
        return p;
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        FactorsExtended obj = new FactorsExtended();
        int[] f = obj.factors(n);
        System.out.println("Factors: " + Arrays.toString(f));
        System.out.println("Greatest: " + obj.greatest(f));
        System.out.println("Sum: " + obj.sum(f));
        System.out.println("Product: " + obj.product(f));
        System.out.println("CubeProduct: " + obj.cubeProduct(f));
    }
}
