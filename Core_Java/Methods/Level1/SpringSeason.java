package Methods.Level1;

import java.util.Scanner;

public class SpringSeason {
    public void checkSeason(int month, int day) {
        if ((month == 3 && day >= 20) || (month == 6 && day <= 20) || (month > 3 && month < 6)) {
            System.out.println("It's Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        SpringSeason obj = new SpringSeason();
        obj.checkSeason(month, day);
    }
}
