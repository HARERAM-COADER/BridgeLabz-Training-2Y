abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }

    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId + ", Name: " + name + ", Base Salary: " + baseSalary);
    }
}

class FullTimeEmployee extends Employee {
    public FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary();
    }
}

class PartTimeEmployee extends Employee {
    private int workHours;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String name, double hourlyRate, int workHours) {
        super(employeeId, name, 0);
        this.hourlyRate = hourlyRate;
        this.workHours = workHours;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * workHours;
    }
}

interface Department {
    void assignDepartment(String departmentName);
    String getDepartmentDetails();
}

class DepartmentEmployee extends FullTimeEmployee implements Department {
    private String department;

    public DepartmentEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(1, "John", 50000);
        Employee e2 = new PartTimeEmployee(2, "Alice", 500, 40);
        DepartmentEmployee e3 = new DepartmentEmployee(3, "Bob", 60000);
        e3.assignDepartment("IT");

        Employee[] employees = { e1, e2, e3 };
        for (Employee e : employees) {
            e.displayDetails();
            System.out.println("Calculated Salary: " + e.calculateSalary());
            if (e instanceof DepartmentEmployee) {
                System.out.println(((DepartmentEmployee) e).getDepartmentDetails());
            }
            System.out.println();
        }
    }
}
