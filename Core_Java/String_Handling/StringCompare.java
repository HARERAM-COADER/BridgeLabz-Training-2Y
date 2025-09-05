package String_Handling;

import java.util.*;

public class StringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine(), s2 = sc.nextLine();
        int cmp = s1.compareTo(s2);
        if (cmp == 0)
            System.out.println("Strings are equal");
        else if (cmp < 0)
            System.out.println(s1 + " comes before " + s2);
        else
            System.out.println(s1 + " comes after " + s2);
    }
}
