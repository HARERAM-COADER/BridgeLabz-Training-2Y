package Methods.Level3;

import java.util.*;

public class CalendarDisplay {
    String[] months = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
    int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    boolean leap(int y) {
        return y % 400 == 0 || (y % 4 == 0 && y % 100 != 0);
    }

    int getDays(int m, int y) {
        return (m == 2 && leap(y)) ? 29 : days[m - 1];
    }

    int firstDay(int m, int y) { // Zeller’s congruence
        if (m < 3) {
            m += 12;
            y--;
        }
        int k = y % 100, j = y / 100;
        return (1 + (13 * (m + 1)) / 5 + k + k / 4 + j / 4 + 5 * j) % 7; // 0=Sat
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), y = sc.nextInt();
        CalendarDisplay c = new CalendarDisplay();
        int d = c.getDays(m, y), start = (c.firstDay(m, y) + 6) % 7; // shift 0=Sun
        System.out.println(c.months[m - 1] + " " + y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 0; i < start; i++)
            System.out.print("    ");
        for (int i = 1; i <= d; i++) {
            System.out.printf("%3d ", i);
            if ((i + start) % 7 == 0)
                System.out.println();
        }
    }
}
