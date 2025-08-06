package employee_management;

import java.util.Set;

public class Department {
    private final String name;
    private final Set<Employee> employees;

    public Department(String name, Set<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public Set<Employee> getEmployees () {
        return employees;
    }
}
