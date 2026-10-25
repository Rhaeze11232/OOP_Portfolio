public class PartTimeEmployee extends Employee {

    private double hourlyRate;
    private int hoursWorked;

    // Default constructor
    public PartTimeEmployee() {
    }

    // Constructor with parameters
    public PartTimeEmployee(
            String employeeID,
            String name,
            String role,
            double hourlyRate,
            int hoursWorked) {

        super(employeeID, name, role);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate >= 0) {
            this.hourlyRate = hourlyRate;
        } else {
            System.out.println("Hourly rate cannot be negative.");
        }
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        if (hoursWorked >= 0) {
            this.hoursWorked = hoursWorked;
        } else {
            System.out.println("Hours worked cannot be negative.");
        }
    }

    public double computeSalary() {
        return hourlyRate * hoursWorked;
    }

    public void displayPartTimeInfo() {
        System.out.println("PART-TIME EMPLOYEE");
        System.out.println();

        displayInfo();

        System.out.printf("Hourly Rate : PHP %,.2f%n", hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.printf("Salary      : PHP %,.2f%n", computeSalary());
    }
}