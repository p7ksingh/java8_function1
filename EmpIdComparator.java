import java.util.Comparator;

public class EmpIdComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Employee emp1 = (Employee)o1;
        Employee emp2 =(Employee)o2;
    //     if (emp1.getEmpId() == emp2.getEmpId()) {
    //         return 0;

    //     } else if(emp1.getEmpId() == emp2.getEmpId()){
    //        return 1;
    //     }else{
    //         return -1;
    //     }
            
    return emp1.getName().compareTo(emp2.getName());
    }
    }


