public class BackupService {

    public void backup(Object obj) {
        if (obj instanceof BackupSerializable) {
            System.out.println("Backing up serializable object: " + obj);
        } else {
            System.out.println("Cannot back up object: " + obj + ". Not marked as BackupSerializable.");
        }
    }

    public static void main(String[] args) {
        BackupService service = new BackupService();
        CustomerData customer = new CustomerData(101, "John Doe");
        String regularString = "This is not serializable for backup.";

        service.backup(customer);
        service.backup(regularString);
    }
}