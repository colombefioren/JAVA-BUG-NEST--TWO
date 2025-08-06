package employee_management;

public abstract class Employee {
    private int EmployeeId;
    private String Name;

    public Employee(int employeeId, String name) {
        EmployeeId = employeeId;
        Name = name;
    }

    public int getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(int employeeId) {
        EmployeeId = employeeId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public abstract double calculatePay();
}
