public class InsurancePortal {
    public static void main(String[] args) {
        String pass1 = "weak";
        String pass2 = "StrongPass123";

        System.out.println("Checking password: '" + pass1 + "'");
        if (SecurityUtils.isPasswordStrong(pass1)) {
            System.out.println("Result: Strong");
        } else {
            System.out.println("Result: Weak");
        }

        System.out.println("\nChecking password: '" + pass2 + "'");
        if (SecurityUtils.isPasswordStrong(pass2)) {
            System.out.println("Result: Strong");
        } else {
            System.out.println("Result: Weak");
        }
    }
}
