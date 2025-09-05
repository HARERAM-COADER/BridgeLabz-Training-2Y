package Methods.Level3;

import java.util.*;

public class Collinear {
    boolean slopeCheck(int x1, int y1, int x2, int y2, int x3, int y3) {
        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
    }

    boolean areaCheck(int x1, int y1, int x2, int y2, int x3, int y3) {
        return (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) == 0;
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt(), x3 = sc.nextInt(),
                y3 = sc.nextInt();
        Collinear c = new Collinear();
        System.out.println("Slope method: " + c.slopeCheck(x1, y1, x2, y2, x3, y3));
        System.out.println("Area method: " + c.areaCheck(x1, y1, x2, y2, x3, y3));
    }
}
