package objectrelationships;

public class Instructor extends User {

    private String employeeNumber;
    private String specialization;

    public Instructor(
            int userId,
            String name,
            String email,
            String employeeNumber,
            String specialization) {

        super(userId, name, email);
        this.employeeNumber = employeeNumber;
        this.specialization = specialization;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void displayInstructorInformation() {
        System.out.println("\nINSTRUCTOR INFORMATION");
        System.out.println("------------------------------");

        displayUserInformation();

        System.out.println(
                "Employee Number: " + employeeNumber);

        System.out.println(
                "Specialization: " + specialization);
    }
}