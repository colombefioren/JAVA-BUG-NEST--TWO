package employee_management;

import java.util.Set;

/**
 * TODO : a department is a collection of employees. It has a name and a set of employees in it.
 */
public class Department {
    private String name;
    private Set<Employee> employees;

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
