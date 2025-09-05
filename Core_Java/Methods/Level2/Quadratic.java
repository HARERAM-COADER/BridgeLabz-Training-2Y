package Methods.Level2;

import java.util.*;

public class Quadratic {
    public double[] roots(int a, int b, int c) {
        int d = b * b - 4 * a * c;
        if (d < 0)
            return new double[0];
        if (d == 0)
            return new double[] { -b / (2.0 * a) };
        double r1 = (-b + Math.sqrt(d)) / (2 * a);
        double r2 = (-b - Math.sqrt(d)) / (2 * a);
        return new double[] { r1, r2 };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        Quadratic q = new Quadratic();
        double[] r = q.roots(a, b, c);
        System.out.println(r.length == 0 ? "No Real Roots" : Arrays.toString(r));
    }
}
