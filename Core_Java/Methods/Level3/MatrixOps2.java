package Methods.Level3;

import java.util.*;

public class MatrixOps2 {
    int[][] transpose(int[][] a) {
        int r = a.length, c = a[0].length;
        int[][] t = new int[c][r];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                t[j][i] = a[i][j];
        return t;
    }

    int det2(int[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    int det3(int[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1]) - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
                + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    double[][] inv2(int[][] m) {
        int d = det2(m);
        return new double[][] { { m[1][1] / (double) d, -m[0][1] / (double) d },
                { -m[1][0] / (double) d, m[0][0] / (double) d } };
    }

    public static void main(String[] a) {
        MatrixOps2 o = new MatrixOps2();
        int[][] m = { { 1, 2 }, { 3, 4 } };
        System.out.println("Transpose:" + Arrays.deepToString(o.transpose(m)));
        System.out.println("Det2:" + o.det2(m));
        System.out.println("Inv2:" + Arrays.deepToString(o.inv2(m)));
    }
}
