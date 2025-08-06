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

    public void AllEmployeeDetails(){
        for(Employee e : employees){
      System.out.println(e);
      if(e instanceof PartTimeEmployee){
        System.out.println("Hourly Rate : " + ((PartTimeEmployee) e).getHourlyRate());
      }else if(e instanceof FullTimeEmployee){
        System.out.println("Monthly Salary : " + ((FullTimeEmployee) e).getMonthlySalary());
      }
      System.out.println("======");
        }
    }


}
