package Methods.Level1;

import java.util.Scanner;

public class SimpleInterest {
    public static void simpleInterest(int i, int r, int t) {
        int si = (i * r * t) / 100;
        System.out.println(si);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();
        SimpleInterest obj = new SimpleInterest();
        obj.simpleInterest(i, r, t);

    }

}
