import java.util.HashSet;
public class OTPGenerator {
    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < otps.length; i++) otps[i] = generateOTP();
        System.out.println("All OTPs unique: " + checkUnique(otps));
        for (int otp : otps) System.out.println(otp);
    }
    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000;
    }
    public static boolean checkUnique(int[] otps) {
        HashSet<Integer> set = new HashSet<>();
        for (int otp : otps) set.add(otp);
        return set.size() == otps.length;
    }
}
