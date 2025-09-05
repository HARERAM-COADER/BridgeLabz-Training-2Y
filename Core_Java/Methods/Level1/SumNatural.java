package Methods.Level1;

import java.util.Scanner;

public class SumNatural {
    public void calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SumNatural obj = new SumNatural();
        obj.calculateSum(n);
    }
}
