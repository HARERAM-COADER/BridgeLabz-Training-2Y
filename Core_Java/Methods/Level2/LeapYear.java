package Methods.Level2;

import java.util.*;

public class LeapYear {
    public boolean isLeap(int y) {
        return y >= 1582 && (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        LeapYear obj = new LeapYear();
        System.out.println(obj.isLeap(y) ? "Leap Year" : "Not Leap Year");
    }
}
