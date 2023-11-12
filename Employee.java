
public class Employee {
    String name;
    String EmpId;
    String Address;

    public Employee(String name, String empId, String address) {
        this.name = name;
        EmpId = empId;
        Address = address;
    }
    @Override
    public String toString() {
        return "Employee [name=" + name + ", EmpId=" + EmpId + ", Address=" + Address + "]";
    }
    public String getName() {
        return name;
    }
    public String getEmpId() {
        return EmpId;
    }
    public String getAddress() {
        return Address;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmpId(String empId) {
        EmpId = empId;
    }
    public void setAddress(String address) {
        Address = address;
    }
    }
