package employee_management;

public abstract class Employee {
    private int EmployeeId;
    private String Name;
    private static int nextId = 1;

    public Employee(int employeeId, String name) {
        EmployeeId = employeeId;
        Name = name;
    }

    public Employee(String name) {
        this(nextId++, name);
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

    public abstract double calculateTax();

    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeId=" + EmployeeId +
                ", Name='" + Name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        return EmployeeId == employee.EmployeeId &&
                Name.equals(employee.Name);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(EmployeeId, Name, getClass());
    }

}
