import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
    private int empId;
    private String name;
    private String empAddress;
    private int Salary;

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", name=" + name + ", empAddress=" + empAddress + ", Salary=" + Salary
                + "]";
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public void setSalary(Integer salary) {
        Salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public Integer getSalary() {
        return Salary;
    }

}

public class PridicateFunctionDemo {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>();
        System.out.println(list);
        Employee employee1 = new Employee();
        employee1.setName("Pankaj");
        employee1.setEmpAddress("hydrabad");
        employee1.setEmpId(1111);
        employee1.setSalary(100);

        Employee employee2 = new Employee();
        employee2.setName("Alex");
        employee2.setEmpAddress("US");
        employee2.setEmpId(2222);
        employee2.setSalary(50000);

        Employee employee3 = new Employee();
        employee3.setName("Bharathi");
        employee3.setEmpAddress("US");
        employee3.setEmpId(3333);
        employee3.setSalary(100);

        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        // filter data whose salary less than 10000
        // where ever condation there use predicate
        Predicate<Employee> p = e -> e.getSalary() < 1000;
        Function<Employee, Employee> fn = e -> {
         //   e.setSalary(e.getSalary() + 500);
        int salary = e.getSalary()+500;
        e.setSalary(salary);
            return e;
        };
        List<Employee> list1 = new ArrayList<Employee>();
        for (Employee e : list) {
           if(p.test(e)) {
            fn.apply(e);
            list1.add(e);
            
        }

    }
    System.out.println(list1);
}
}
////////////////////////////////////////////////////////////////////
// import java.util.function.Predicate;

// public class Main {
//     public static void main(String[] args) {
//         Predicate<Employee> p = new Predicate<Employee>() {
//             @Override
//             public boolean test(Employee e) {
//                 return e.getSalary() < 1000;
//             }
//         };

//         // Example usage
//         Employee employee = new Employee("Alice", 800);
//         boolean result = p.test(employee);

//         System.out.println("Is " + employee.getName() + "'s salary less than 1000? " + result);
//     }

//     static class Employee {
//         private String name;
//         private int salary;

//         public Employee(String name, int salary) {
//             this.name = name;
//             this.salary = salary;
//         }

//         public String getName() {
//             return name;
//         }

//         public int getSalary() {
//             return salary;
//         }
//     }
// }
////////////////////////////////////////////////////////////////
// import java.util.function.Function;

// public class Main {
//     public static void main(String[] args) {
//         Function<Employee, Employee> fn = new Function<Employee, Employee>() {
//             @Override
//             public Employee apply(Employee e) {
//                 e.setSalary(e.getSalary() + 5000);
//                 return e;
//             }
//         };

//         // Example usage
//         Employee employee = new Employee("John", 50000);
//         Employee result = fn.apply(employee);

//         System.out.println(result.getName() + "'s new salary: " + result.getSalary());
//     }

//     static class Employee {
//         private String name;
//         private int salary;

//         public Employee(String name, int salary) {
//             this.name = name;
//             this.salary = salary;
//         }

//         public String getName() {
//             return name;
//         }

//         public int getSalary() {
//             return salary;
//         }

//         public void setSalary(int salary) {
//             this.salary = salary;
//         }
//     }
// }
