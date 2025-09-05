package Methods.Level3;

import java.util.*;

public class OTPGen {
    public int gen() {
        return (int) (Math.random() * 900000) + 100000;
    }

    public boolean unique(int[] a) {
        Set<Integer> s = new HashSet<>();
        for (int x : a)
            s.add(x);
        return s.size() == a.length;
    }

    public static void main(String[] a) {
        OTPGen o = new OTPGen();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++)
            arr[i] = o.gen();
        System.out.println("OTPs: " + Arrays.toString(arr));
        System.out.println("Unique: " + o.unique(arr));
    }
}
