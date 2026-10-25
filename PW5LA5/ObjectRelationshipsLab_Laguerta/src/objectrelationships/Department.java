package objectrelationships;

public class Department {

    private String departmentCode;
    private String departmentName;
    private Instructor instructor;

    public Department(
            String departmentCode,
            String departmentName,
            Instructor instructor) {

        this.departmentCode = departmentCode;
        this.departmentName = departmentName;

        // The Instructor object is created outside
        // and passed to the Department.
        this.instructor = instructor;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void displayDepartmentInformation() {
        System.out.println("\nDEPARTMENT INFORMATION");
        System.out.println("------------------------------");

        System.out.println(
                "Department Code: " + departmentCode);

        System.out.println(
                "Department Name: " + departmentName);

        System.out.println(
                "Assigned Instructor: "
                + instructor.getName());
    }
}