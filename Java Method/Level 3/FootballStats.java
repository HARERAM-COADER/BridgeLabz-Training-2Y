import java.util.Random;
public class FootballStats {
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random random = new Random();
        for (int i = 0; i < heights.length; i++) heights[i] = random.nextInt(101) + 150;
        int sum = findSum(heights);
        double mean = findMean(sum, heights.length);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        System.out.println("Heights of players:");
        for (int h : heights) System.out.print(h + " ");
        System.out.println("\nShortest Height: " + shortest);
        System.out.println("Tallest Height: " + tallest);
        System.out.println("Mean Height: " + mean);
    }
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int num : arr) sum += num;
        return sum;
    }
    public static double findMean(int sum, int count) {
        return (double) sum / count;
    }
    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int num : arr) if (num < min) min = num;
        return min;
    }
    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int num : arr) if (num > max) max = num;
        return max;
    }
}
