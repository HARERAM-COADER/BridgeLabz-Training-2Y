package Methods.Level1;

import java.util.Scanner;

public class SmallestLargest {
    public void findSmallestAndLargest(int a, int b, int c) {
        int smallest = Math.min(a, Math.min(b, c));
        int largest = Math.max(a, Math.max(b, c));
        System.out.println("Smallest: " + smallest + ", Largest: " + largest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        SmallestLargest obj = new SmallestLargest();
        obj.findSmallestAndLargest(a, b, c);
    }
}
