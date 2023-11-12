
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


public class EmployeeTest {
    public static void main(String[] args) {
        Set<Employee> employees = new HashSet<Employee>();
        Employee test = new Employee("Alam","222","delhi");
        Employee test1 = new Employee("Pankaj","111","Bangalore");
        Employee test2 = new Employee("Dhiraj","333","Pune");
        employees.add(test);
        employees.add(test1);
        employees.add(test2);
        System.out.println(employees);
        //short the employee details based on the employee id
Collections.sort(employees, new EmpIdComparator());
       

    }
}
