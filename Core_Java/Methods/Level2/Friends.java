package Methods.Level2;

import java.util.*;

public class Friends {
    public int youngest(int[] a) {
        int min = a[0], idx = 0;
        for (int i = 1; i < a.length; i++)
            if (a[i] < min) {
                min = a[i];
                idx = i;
            }
        return idx;
    }

    public int tallest(int[] h) {
        int max = h[0], idx = 0;
        for (int i = 1; i < h.length; i++)
            if (h[i] > max) {
                max = h[i];
                idx = i;
            }
        return idx;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[3], height = new int[3];
        for (int i = 0; i < 3; i++) {
            age[i] = sc.nextInt();
            height[i] = sc.nextInt();
        }
        Friends obj = new Friends();
        String[] names = { "Amar", "Akbar", "Anthony" };
        System.out.println("Youngest: " + names[obj.youngest(age)]);
        System.out.println("Tallest: " + names[obj.tallest(height)]);
    }
}
