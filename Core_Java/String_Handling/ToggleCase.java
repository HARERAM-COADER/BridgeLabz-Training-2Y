package String_Handling;

import java.util.*;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(), res = "";
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c))
                res += Character.toLowerCase(c);
            else if (Character.isLowerCase(c))
                res += Character.toUpperCase(c);
            else
                res += c;
        }
        System.out.println("Toggled: " + res);
    }
}
