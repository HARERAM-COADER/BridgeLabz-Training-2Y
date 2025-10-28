import java.util.Random;
import java.util.Scanner;
public class StudentScorecard {
    public static int[][] generateScores(int n){
        Random r=new Random();
        int[][] scores=new int[n][3];
        for(int i=0;i<n;i++){
            scores[i][0]=r.nextInt(100);
            scores[i][1]=r.nextInt(100);
            scores[i][2]=r.nextInt(100);
        }
        return scores;
    }
    public static double[][] calculate(int[][] scores){
        int n=scores.length;
        double[][] result=new double[n][3];
        for(int i=0;i<n;i++){
            int total=scores[i][0]+scores[i][1]+scores[i][2];
            double avg=total/3.0;
            double percent=Math.round((total/300.0)*10000)/100.0;
            result[i][0]=total;
            result[i][1]=avg;
            result[i][2]=percent;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] scores=generateScores(n);
        double[][] result=calculate(scores);
        System.out.println("Phy\tChem\tMath\tTotal\tAverage\tPercent");
        for(int i=0;i<n;i++){
            System.out.println(scores[i][0]+"\t"+scores[i][1]+"\t"+scores[i][2]+"\t"+result[i][0]+"\t"+result[i][1]+"\t"+result[i][2]);
        }
    }
}
