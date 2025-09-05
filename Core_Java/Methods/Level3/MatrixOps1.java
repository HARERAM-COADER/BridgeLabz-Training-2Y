package Methods.Level3;

import java.util.*;

public class MatrixOps1 {
    int[][] gen(int r, int c) {
        int[][] m = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                m[i][j] = (int) (Math.random() * 10);
        return m;
    }

    int[][] add(int[][] a, int[][] b) {
        int r = a.length, c = a[0].length;
        int[][] m = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                m[i][j] = a[i][j] + b[i][j];
        return m;
    }

    int[][] sub(int[][] a, int[][] b) {
        int r = a.length, c = a[0].length;
        int[][] m = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                m[i][j] = a[i][j] - b[i][j];
        return m;
    }

    int[][] mul(int[][] a, int[][] b) {
        int r = a.length, c = b[0].length, n = a[0].length;
        int[][] m = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                for (int k = 0; k < n; k++)
                    m[i][j] += a[i][k] * b[k][j];
        return m;
    }

    public static void main(String[] a) {
        MatrixOps1 o = new MatrixOps1();
        int[][] A = { { 1, 2 }, { 3, 4 } }, B = { { 5, 6 }, { 7, 8 } };
        System.out.println("Add:" + Arrays.deepToString(o.add(A, B)));
        System.out.println("Sub:" + Arrays.deepToString(o.sub(A, B)));
        System.out.println("Mul:" + Arrays.deepToString(o.mul(A, B)));
    }
}
