package String_Handling;

import java.util.*;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine(), s2 = sc.nextLine();
        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }
        char[] a = s1.toCharArray(), b = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.equals(a, b) ? "Anagram" : "Not Anagram");
    }
}
