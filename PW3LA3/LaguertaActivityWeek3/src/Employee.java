public class Employee {

    private String employeeID;
    private String name;
    private String department;

    public Employee() {
    }

    public Employee(String employeeID, String name, String department) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void displayInfo() {
        System.out.println("Employee ID : " + employeeID);
        System.out.println("Name        : " + name);
        System.out.println("Department  : " + department);
    }
}