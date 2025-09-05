package String_Handling;

import java.util.*;

public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] freq = new int[256];
        for (char c : s.toCharArray())
            freq[c]++;
        int max = 0;
        char ans = 0;
        for (char c : s.toCharArray())
            if (freq[c] > max) {
                max = freq[c];
                ans = c;
            }
        System.out.println("Most Frequent: " + ans);
    }
}
