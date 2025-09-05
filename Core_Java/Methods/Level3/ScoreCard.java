package Methods.Level3;

import java.util.*;

public class ScoreCard {
    int[][] genScores(int n) {
        int[][] a = new int[n][3];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                a[i][j] = (int) (Math.random() * 90) + 10;
        return a;
    }

    double[][] calc(int[][] a) {
        int n = a.length;
        double[][] r = new double[n][3];
        for (int i = 0; i < n; i++) {
            int total = a[i][0] + a[i][1] + a[i][2];
            double avg = total / 3.0, perc = total / 3.0;
            r[i][0] = total;
            r[i][1] = Math.round(avg * 100) / 100.0;
            r[i][2] = Math.round(perc * 100) / 100.0;
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ScoreCard s = new ScoreCard();
        int[][] a = s.genScores(n);
        double[][] r = s.calc(a);
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPerc");
        for (int i = 0; i < n; i++)
            System.out.println(
                    a[i][0] + "\t" + a[i][1] + "\t" + a[i][2] + "\t" + r[i][0] + "\t" + r[i][1] + "\t" + r[i][2]);
    }
}
