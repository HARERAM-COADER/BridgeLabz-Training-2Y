package Strings;

// Q1 -

// import java.util.*;

// public class Level_2 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String s = sc.next();
// int count = 0;
// try {
// while (true) {
// s.charAt(count);
// count++;
// }
// } catch (Exception e) {
// }
// System.out.println("Custom: " + count + " Built-in: " + s.length() + " Equal?
// " + (count == s.length()));
// }
// }

// Q2-

// import java.util.*;

// public class Level_2 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String s = sc.nextLine();
// ArrayList<String> list = new ArrayList<>();
// String word = "";
// for (int i = 0; i < s.length(); i++) {
// char c = s.charAt(i);
// if (c == ' ') {
// if (!word.isEmpty()) {
// list.add(word);
// word = "";
// }
// } else
// word += c;
// }
// if (!word.isEmpty())
// list.add(word);
// String[] custom = list.toArray(new String[0]);
// String[] builtin = s.split(" ");
// System.out.println("Custom: " + Arrays.toString(custom));
// System.out.println("Built-in: " + Arrays.toString(builtin));
// System.out.println("Equal? " + Arrays.equals(custom, builtin));
// }
// }

// Q3-

// import java.util.*;

// public class Level_2 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String s = sc.nextLine();
// String[] words = s.split(" ");
// String[][] result = new String[words.length][2];
// for (int i = 0; i < words.length; i++) {
// result[i][0] = words[i];
// result[i][1] = String.valueOf(words[i].length());
// }
// System.out.println("Word Length");
// for (String[] row : result) {
// System.out.println(row[0] + " " + row[1]);
// }
// }
// }

// Q4-

// import java.util.*;

// public class Level_2 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String s = sc.nextLine();
// String[] words = s.split(" ");
// String shortest = words[0], longest = words[0];
// for (String w : words) {
// if (w.length() < shortest.length())
// shortest = w;
// if (w.length() > longest.length())
// longest = w;
// }
// System.out.println("Shortest: " + shortest);
// System.out.println("Longest: " + longest);
// }
// }

// Q5-

// import java.util.*;

// public class Level_2 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String s = sc.nextLine();
// int v = 0, c = 0;
// for (int i = 0; i < s.length(); i++) {
// char ch = Character.toLowerCase(s.charAt(i));
// if (ch >= 'a' && ch <= 'z') {
// if ("aeiou".indexOf(ch) >= 0)
// v++;
// else
// c++;
// }
// }
// System.out.println("Vowels: " + v + " Consonants: " + c);
// }
// }

// Q6-

// import java.util.*;

// public class Level_2 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String s = sc.nextLine();
// System.out.println("Char Type");
// for (int i = 0; i < s.length(); i++) {
// char ch = s.charAt(i);
// char low = Character.toLowerCase(ch);
// if (low >= 'a' && low <= 'z') {
// if ("aeiou".indexOf(low) >= 0)
// System.out.println(ch + " Vowel");
// else
// System.out.println(ch + " Consonant");
// } else {
// System.out.println(ch + " Not a Letter");
// }
// }
// }
// }

// Q7-

// import java.util.*;

// public class Level_2 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String s = sc.nextLine();
// int start = 0, end = s.length() - 1;
// while (start <= end && s.charAt(start) == ' ')
// start++;
// while (end >= start && s.charAt(end) == ' ')
// end--;
// String custom = "";
// for (int i = start; i <= end; i++)
// custom += s.charAt(i);
// String builtin = s.trim();
// System.out.println("Custom: '" + custom + "' Built-in: '" + builtin + "'
// Equal? " + custom.equals(builtin));
// }
// }

// Q8-

// import java.util.*;

// public class Level_2 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int[] ages = new int[10];
// for (int i = 0; i < 10; i++) {
// ages[i] = sc.nextInt();
// }
// for (int i = 0; i < 10; i++) {
// String res = (ages[i] >= 18) ? "Can Vote" : "Cannot Vote";
// System.out.println("Age: " + ages[i] + " -> " + res);
// }
// }
// }

// Q9-

// import java.util.*;

// public class Level_2 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String[] choices = { "rock", "paper", "scissors" };
// int userWins = 0, compWins = 0;
// System.out.print("Enter number of rounds: ");
// int rounds = sc.nextInt();
// for (int i = 0; i < rounds; i++) {
// System.out.print("Enter rock/paper/scissors: ");
// String user = sc.next();
// String comp = choices[(int) (Math.random() * 3)];
// System.out.println("Computer chose: " + comp);
// if (user.equals(comp))
// System.out.println("Draw");
// else if (user.equals("rock") && comp.equals("scissors") ||
// user.equals("paper") && comp.equals("rock") ||
// user.equals("scissors") && comp.equals("paper")) {
// System.out.println("You win!");
// userWins++;
// } else {
// System.out.println("Computer wins!");
// compWins++;
// }
// }
// System.out.println("Final Score -> You: " + userWins + " Computer: " +
// compWins);
// System.out.println(
// "Your Win %: " + (100.0 * userWins / rounds) + " Computer Win %: " + (100.0 *
// compWins / rounds));
// }
// }

// Q10-

// import java.util.*;

// public class Level_2 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter number of students: ");
// int n = sc.nextInt();
// int[][] marks = new int[n][3];
// for (int i = 0; i < n; i++) {
// System.out.println("Enter marks for student " + (i + 1) + " (Physics
// Chemistry Math):");
// for (int j = 0; j < 3; j++)
// marks[i][j] = sc.nextInt();
// }
// for (int i = 0; i < n; i++) {
// int total = marks[i][0] + marks[i][1] + marks[i][2];
// double perc = total / 3.0;
// String grade = (perc >= 90) ? "A" : (perc >= 75) ? "B" : (perc >= 50) ? "C" :
// "D";
// System.out.println("Student " + (i + 1) + " -> Total: " + total + " %: " +
// perc + " Grade: " + grade);
// }
// }
// }
