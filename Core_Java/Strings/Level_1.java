package Strings;

// Q1 -

// import java.util.*;

// public class Level_1 {
// public int[] findAllIndexes(String text, char ch) {
// int count = 0;
// for (int i = 0; i < text.length(); i++)
// if (text.charAt(i) == ch)
// count++;
// int[] idx = new int[count];
// int j = 0;
// for (int i = 0; i < text.length(); i++)
// if (text.charAt(i) == ch)
// idx[j++] = i;
// return idx;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String text = sc.nextLine();
// char ch = sc.next().charAt(0);
// Level_1 obj = new Level_1();
// System.out.println(Arrays.toString(obj.findAllIndexes(text, ch)));
// }
// }

// Q2-

// import java.util.*;

// public class Level_1 {
// public boolean compareByCharAt(String a, String b) {
// if (a.length() != b.length())
// return false;
// for (int i = 0; i < a.length(); i++)
// if (a.charAt(i) != b.charAt(i))
// return false;
// return true;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String a = sc.next(), b = sc.next();
// Level_1 obj = new Level_1();
// System.out.println("CharAt compare: " + obj.compareByCharAt(a, b));
// System.out.println("Built-in equals: " + a.equals(b));
// }
// }

// Q3 -

// import java.util.*;

// public class Level_1 {
// public String substringByCharAt(String s, int start, int end) {
// String sub = "";
// for (int i = start; i < end; i++)
// sub += s.charAt(i);
// return sub;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String text = sc.next();
// int start = sc.nextInt(), end = sc.nextInt();
// Level_1 obj = new Level_1();
// String s1 = obj.substringByCharAt(text, start, end);
// String s2 = text.substring(start, end);
// System.out.println("Custom: " + s1 + " Built-in: " + s2 + " Equal? " +
// s1.equals(s2));
// }
// }

// Q4-

// import java.util.*;

// public class Level_1 {
// public char[] toChars(String s) {
// char[] c = new char[s.length()];
// for (int i = 0; i < s.length(); i++)
// c[i] = s.charAt(i);
// return c;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String text = sc.next();
// Level_1 obj = new Level_1();
// char[] c1 = obj.toChars(text), c2 = text.toCharArray();
// System.out.println("Equal? " + Arrays.equals(c1, c2));
// }
// }

// Q5-

// public class Level_1 {
// public void handle() {
// try {
// String text = null;
// System.out.println(text.length());
// } catch (NullPointerException e) {
// System.out.println("Handled: " + e);
// }
// }

// public static void main(String[] args) {
// Level_1 obj = new Level_1();
// obj.handle();
// }
// }

// Q6-

// public class Level_1 {
// public void handle() {
// try {
// String s = "Hello";
// System.out.println(s.charAt(10));
// } catch (StringIndexOutOfBoundsException e) {
// System.out.println("Handled: " + e);
// }
// }

// public static void main(String[] args) {
// Level_1 obj = new Level_1();
// obj.handle();
// }
// }

// Q7-

// public class Level_1 {
// public void handle() {
// try {
// String s = "Hello";
// System.out.println(s.substring(4, 2));
// } catch (IllegalArgumentException e) {
// System.out.println("Handled: " + e);
// }
// }

// public static void main(String[] args) {
// Level_1 obj = new Level_1();
// obj.handle();
// }
// }

// Q8-

// public class Level_1 {
// public void handle() {
// try {
// String s = "abc";
// int n = Integer.parseInt(s);
// System.out.println(n);
// } catch (NumberFormatException e) {
// System.out.println("Handled: " + e);
// }
// }
// public static void main(String[] args) {
// Level_1 obj = new Level_1();
// obj.handle();
// }
// }

// Q9-

// public class Level_1 {
// public void handle() {
// try {
// String[] names = { "A", "B", "C" };
// System.out.println(names[5]);
// } catch (ArrayIndexOutOfBoundsException e) {
// System.out.println("Handled: " + e);
// }
// }

// public static void main(String[] args) {
// Level_1 obj = new Level_1();
// obj.handle();
// }
// }

// Q10-

// import java.util.*;

// public class Level_1 {
// public String toUpperByCharAt(String s) {
// String res = "";
// for (int i = 0; i < s.length(); i++) {
// char c = s.charAt(i);
// if (c >= 'a' && c <= 'z')
// res += (char) (c - 32);
// else
// res += c;
// }
// return res;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String text = sc.nextLine();
// Level_1 obj = new Level_1();
// String s1 = obj.toUpperByCharAt(text), s2 = text.toUpperCase();
// System.out.println("Custom: " + s1 + " Built-in: " + s2 + " Equal? " +
// s1.equals(s2));
// }
// }

// Q11-

// import java.util.*;

// public class Level_1 {
// public String toLowerByCharAt(String s) {
// String res = "";
// for (int i = 0; i < s.length(); i++) {
// char c = s.charAt(i);
// if (c >= 'A' && c <= 'Z')
// res += (char) (c + 32);
// else
// res += c;
// }
// return res;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String text = sc.nextLine();
// Level_1 obj = new Level_1();
// String s1 = obj.toLowerByCharAt(text), s2 = text.toLowerCase();
// System.out.println("Custom: " + s1 + " Built-in: " + s2 + " Equal? " +
// s1.equals(s2));
// }
// }
