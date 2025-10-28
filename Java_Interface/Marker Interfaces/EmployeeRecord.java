public class EmployeeRecord implements Encryptable {
    private int employeeId;
    private String socialSecurityNumber;

    public EmployeeRecord(int employeeId, String socialSecurityNumber) {
        this.employeeId = employeeId;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public String toString() {
        return "EmployeeRecord[id=" + employeeId + "]";
    }
}
