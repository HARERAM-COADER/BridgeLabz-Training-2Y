package String_Handling;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(), res = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (res.indexOf(c) == -1)
                res += c;
        }
        System.out.println("Modified: " + res);
    }
}
