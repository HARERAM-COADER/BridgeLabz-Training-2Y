package Methods.Level3;

import java.util.*;

public class LineEq {
    double dist(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    double[] line(int x1, int y1, int x2, int y2) {
        double m = (y2 - y1) / (double) (x2 - x1);
        double b = y1 - m * x1;
        return new double[] { m, b };
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt();
        LineEq l = new LineEq();
        System.out.println("Distance:" + l.dist(x1, y1, x2, y2));
        double[] eq = l.line(x1, y1, x2, y2);
        System.out.println("y=" + eq[0] + "x+" + eq[1]);
    }
}
