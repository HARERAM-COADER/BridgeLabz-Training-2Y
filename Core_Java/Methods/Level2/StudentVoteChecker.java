package Methods.Level2;

import java.util.*;

public class StudentVoteChecker {
    public boolean canVote(int age) {
        if (age < 0)
            return false;
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentVoteChecker obj = new StudentVoteChecker();
        for (int i = 0; i < 10; i++) {
            int age = sc.nextInt();
            System.out.println(obj.canVote(age) ? "Can Vote" : "Cannot Vote");
        }
    }
}
