package Strings;

// Q1 -

// import java.util.*;

// public class Level_3 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// double[][] data = new double[10][2]; // [weight, height(cm)]
// for (int i = 0; i < 10; i++) {
// System.out.print("Enter weight(kg) and height(cm) for person " + (i + 1) + ":
// ");
// data[i][0] = sc.nextDouble();
// data[i][1] = sc.nextDouble();
// }
// System.out.println("Weight Height BMI Status");
// for (int i = 0; i < 10; i++) {
// double h = data[i][1] / 100.0;
// double bmi = data[i][0] / (h * h);
// String status = (bmi < 18.5) ? "Underweight" : (bmi < 25) ? "Normal" : (bmi <
// 30) ? "Overweight" : "Obese";
// System.out.printf("%.1f %.1f %.1f %s\n", data[i][0], data[i][1], bmi,
// status);
// }
// }
// }

// Q2-

// import java.util.*;

// public class Level_3 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String s = sc.nextLine();
// String res = "";
// for (int i = 0; i < s.length(); i++) {
// char c = s.charAt(i);
// if (res.indexOf(c) == -1)
// res += c;
// }
// System.out.println("Unique chars: " + res);
// }
// }

// Q3-

// import java.util.*;

// public class Level_3 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String s = sc.nextLine();
// int[] freq = new int[256];
// for (int i = 0; i < s.length(); i++)
// freq[s.charAt(i)]++;
// char ans = 0;
// for (int i = 0; i < s.length(); i++) {
// if (freq[s.charAt(i)] == 1) {
// ans = s.charAt(i);
// break;
// }
// }
// if (ans == 0)
// System.out.println("No non-repeating character");
// else
// System.out.println("First non-repeating char: " + ans);
// }
// }

// Q4-

// import java.util.*;

// public class Level_3 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String s = sc.nextLine();
// int[] freq = new int[256];
// for (int i = 0; i < s.length(); i++)
// freq[s.charAt(i)]++;
// System.out.println("Char : Freq");
// for (int i = 0; i < 256; i++) {
// if (freq[i] > 0)
// System.out.println((char) i + " : " + freq[i]);
// }
// }
// }

// Q5-

// import java.util.*;

// public class Level_3 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String s = sc.nextLine();
// String uniq = "";
// for (int i = 0; i < s.length(); i++) {
// char c = s.charAt(i);
// if (uniq.indexOf(c) == -1)
// uniq += c;
// }
// System.out.println("Char : Freq");
// for (int i = 0; i < uniq.length(); i++) {
// char c = uniq.charAt(i);
// int count = 0;
// for (int j = 0; j < s.length(); j++)
// if (s.charAt(j) == c)
// count++;
// System.out.println(c + " : " + count);
// }
// }
// }

// Q6-

// import java.util.*;

// public class Level_3 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String s = sc.nextLine();
// char[] ch = s.toCharArray();

// System.out.println("Char : Freq");
// for (int i = 0; i < ch.length; i++) {
// if (ch[i] == 0)
// continue;
// int count = 1;
// for (int j = i + 1; j < ch.length; j++) {
// if (ch[i] == ch[j]) {
// count++;
// ch[j] = 0;
// }
// }
// String display = (ch[i] == ' ') ? "space" : String.valueOf(ch[i]);
// System.out.println(display + " : " + count);
// }
// }
// }

// Q7-

// import java.util.*;

// public class Level_3 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String s = sc.nextLine();

// String rev = "";
// for (int k = s.length() - 1; k >= 0; k--)
// rev += s.charAt(k);
// boolean pal3 = s.equals(rev);

// System.out.println(pal3);
// }
// }

// Q8-

// import java.util.*;

// public class Level_3 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String s1 = sc.nextLine(), s2 = sc.nextLine();
// if (s1.length() != s2.length()) {
// System.out.println("Not Anagram");
// return;
// }
// int[] f1 = new int[256], f2 = new int[256];
// for (int i = 0; i < s1.length(); i++) {
// f1[s1.charAt(i)]++;
// f2[s2.charAt(i)]++;
// }
// boolean anagram = Arrays.equals(f1, f2);
// System.out.println(anagram ? "Anagram" : "Not Anagram");
// }
// }

// Q9-

// import java.util.*;

// public class Level_3 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int m = sc.nextInt(), y = sc.nextInt();

// String[] months = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug",
// "Sep", "Oct", "Nov", "Dec" };
// int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
// if ((y % 400 == 0) || (y % 4 == 0 && y % 100 != 0))
// days[1] = 29;

// int d = 1;
// int y0 = y - (14 - m) / 12;
// int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
// int m0 = m + 12 * ((14 - m) / 12) - 2;
// int d0 = (d + x + 31 * m0 / 12) % 7;

// System.out.println("Calendar: " + months[m - 1] + " " + y);
// System.out.println("Sun Mon Tue Wed Thu Fri Sat");
// for (int i = 0; i < d0; i++)
// System.out.print(" ");
// for (int i = 1; i <= days[m - 1]; i++) {
// System.out.printf("%3d ", i);
// if ((i + d0) % 7 == 0)
// System.out.println();
// }
// }
// }

// Q10-

// import java.util.*;

// public class Level_3 {
// public static void main(String[] args) {
// String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
// String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack",
// "Queen", "King", "Ace" };
// int n = suits.length * ranks.length;
// String[] deck = new String[n];
// for (int i = 0, k = 0; i < suits.length; i++)
// for (int j = 0; j < ranks.length; j++)
// deck[k++] = ranks[j] + " of " + suits[i];

// for (int i = 0; i < n; i++) {
// int r = i + (int) (Math.random() * (n - i));
// String tmp = deck[i];
// deck[i] = deck[r];
// deck[r] = tmp;
// }

// Scanner sc = new Scanner(System.in);
// System.out.print("Enter players and cards each: ");
// int players = sc.nextInt(), cards = sc.nextInt();
// if (players * cards > n) {
// System.out.println("Not enough cards");
// return;
// }
// for (int p = 0; p < players; p++) {
// System.out.print("Player " + (p + 1) + ": ");
// for (int c = 0; c < cards; c++)
// System.out.print(deck[p * cards + c] + ", ");
// System.out.println();
// }
// }
// }
