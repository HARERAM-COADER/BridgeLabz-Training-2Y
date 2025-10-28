abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public int getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }

    public abstract double calculateBill();
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private double dailyRate;
    private int days;
    private String record;

    public InPatient(int patientId, String name, int age, double dailyRate, int days) {
        super(patientId, name, age);
        this.dailyRate = dailyRate;
        this.days = days;
    }

    @Override
    public double calculateBill() { return dailyRate * days; }

    @Override
    public void addRecord(String record) { this.record = record; }

    @Override
    public void viewRecords() { System.out.println("Record: " + record); }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private String record;

    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() { return consultationFee; }

    @Override
    public void addRecord(String record) { this.record = record; }

    @Override
    public void viewRecords() { System.out.println("Record: " + record); }
}

public class HospitalPatientManagement {
    public static void main(String[] args) {
        Patient[] patients = {
            new InPatient(1, "John", 30, 2000, 5),
            new OutPatient(2, "Mary", 25, 500)
        };

        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill: " + p.calculateBill());
            if (p instanceof MedicalRecord) {
                MedicalRecord mr = (MedicalRecord) p;
                mr.addRecord("General checkup done.");
                mr.viewRecords();
            }
            System.out.println();
        }
    }
}
