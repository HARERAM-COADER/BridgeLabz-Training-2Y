package Methods.Level3;

public class ZaraBonus {
    double[][] emp = new double[10][3]; // old salary, years, new salary

    double[][] calc() {
        for (int i = 0; i < 10; i++) {
            double sal = (int) (Math.random() * 90000) + 10000;
            int yrs = (int) (Math.random() * 10) + 1;
            double bonus = sal * (yrs > 5 ? 0.05 : 0.02);
            emp[i][0] = sal;
            emp[i][1] = yrs;
            emp[i][2] = sal + bonus;
        }
        return emp;
    }

    void totals() {
        double old = 0, newS = 0, bonus = 0;
        for (double[] e : emp) {
            old += e[0];
            newS += e[2];
            bonus += (e[2] - e[0]);
        }
        System.out.println("Old:" + old + " New:" + newS + " Bonus:" + bonus);
    }

    public static void main(String[] a) {
        ZaraBonus z = new ZaraBonus();
        z.calc();
        for (double[] e : z.emp)
            System.out.println("Sal:" + e[0] + " Yrs:" + e[1] + " New:" + e[2]);
        z.totals();
    }
}
