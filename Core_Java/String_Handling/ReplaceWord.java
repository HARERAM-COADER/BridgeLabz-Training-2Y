package String_Handling;

import java.util.*;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String oldW = sc.next(), newW = sc.next();
        String res = sentence.replace(oldW, newW);
        System.out.println("Modified: " + res);
    }
}
