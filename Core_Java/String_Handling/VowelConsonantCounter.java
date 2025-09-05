package String_Handling;

import java.util.*;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        int v = 0, c = 0;
        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) >= 0)
                    v++;
                else
                    c++;
            }
        }
        System.out.println("Vowels: " + v + ", Consonants: " + c);
    }
}
