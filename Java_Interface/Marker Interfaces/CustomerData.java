public class CustomerData implements BackupSerializable {
    private int customerId;
    private String name;

    public CustomerData(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    @Override
    public String toString() {
        return "CustomerData[id=" + customerId + ", name=" + name + "]";
    }
}
