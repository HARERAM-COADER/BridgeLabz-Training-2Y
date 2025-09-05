package Methods.Level2;

import java.util.*;

public class SumNatural {
    public int recSum(int n) {
        return n == 0 ? 0 : n + recSum(n - 1);
    }

    public int formula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Not natural");
            return;
        }
        SumNatural obj = new SumNatural();
        System.out.println("Recursive: " + obj.recSum(n));
        System.out.println("Formula: " + obj.formula(n));
    }
}
