public class SecuritySystem {

    public void saveData(Object data) {
        if (data instanceof Encryptable) {
            System.out.println("Encrypting and saving sensitive data: " + data);
        } else {
            System.out.println("Saving non-sensitive data: " + data);
        }
    }

    public static void main(String[] args) {
        SecuritySystem system = new SecuritySystem();

        EmployeeRecord sensitiveRecord = new EmployeeRecord(12345, "555-123-4567");
        String nonSensitiveData = "Public company announcement.";

        system.saveData(sensitiveRecord);
        system.saveData(nonSensitiveData);
    }
}