package Methods.Level2;

import java.util.*;

public class RandomArray {
    public int[] generate(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = (int) (Math.random() * 9000) + 1000;
        return a;
    }

    public double[] stats(int[] a) {
        int min = a[0], max = a[0], sum = 0;
        for (int x : a) {
            if (x < min)
                min = x;
            if (x > max)
                max = x;
            sum += x;
        }
        return new double[] { sum / (double) a.length, min, max };
    }

    public static void main(String[] args) {
        RandomArray obj = new RandomArray();
        int[] arr = obj.generate(5);
        System.out.println("Array: " + Arrays.toString(arr));
        double[] s = obj.stats(arr);
        System.out.println("Avg:" + s[0] + " Min:" + s[1] + " Max:" + s[2]);
    }
}
