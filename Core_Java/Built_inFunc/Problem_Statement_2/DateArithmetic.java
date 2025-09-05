package Built_inFunc.Problem_Statement_2;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date (yyyy-MM-dd): ");
        LocalDate d = LocalDate.parse(sc.next());
        d = d.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        System.out.println("Final Date: " + d.format(DateTimeFormatter.ISO_DATE));
    }
}
