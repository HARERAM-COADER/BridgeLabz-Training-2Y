package String_Handling;

import java.util.*;

public class SubstringOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String sub = sc.nextLine();
        int count = 0, idx = 0;
        while ((idx = text.indexOf(sub, idx)) != -1) {
            count++;
            idx += sub.length();
        }
        System.out.println("Occurrences: " + count);
    }
}
