package Methods.Level2;

import java.util.*;

public class NumberCheck {
    public boolean isPositive(int n) {
        return n > 0;
    }

    public boolean isEven(int n) {
        return n % 2 == 0;
    }

    public int compare(int a, int b) {
        return a > b ? 1 : (a == b ? 0 : -1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        NumberCheck obj = new NumberCheck();
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            if (obj.isPositive(arr[i])) {
                System.out.println(arr[i] + " Positive " + (obj.isEven(arr[i]) ? "Even" : "Odd"));
            } else
                System.out.println(arr[i] + " Negative");
        }
        int cmp = obj.compare(arr[0], arr[4]);
        System.out.println(cmp == 0 ? "Equal" : (cmp > 0 ? "First Greater" : "Last Greater"));
    }
}
