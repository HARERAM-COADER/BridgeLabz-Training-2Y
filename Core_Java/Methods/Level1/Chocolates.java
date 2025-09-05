package Methods.Level1;

import java.util.Scanner;

public class Chocolates {
    public void distribute(int chocolates, int children) {
        int each = chocolates / children;
        int remaining = chocolates % children;
        System.out.println("Each child gets: " + each + ", Remaining: " + remaining);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chocolates = sc.nextInt();
        int children = sc.nextInt();
        Chocolates obj = new Chocolates();
        obj.distribute(chocolates, children);
    }
}
