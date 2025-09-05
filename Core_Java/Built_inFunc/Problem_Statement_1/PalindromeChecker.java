package Built_inFunc.Problem_Statement_1;

import java.util.*;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--)
            rev += s.charAt(i);
        System.out.println(s.equals(rev) ? "Palindrome" : "Not Palindrome");
    }
}
