public class FullTimeEmployee extends Employee {

    private double monthlySalary;

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(
            String employeeID,
            String name,
            String department,
            double monthlySalary) {

        super(employeeID, name, department);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary >= 0) {
            this.monthlySalary = monthlySalary;
        } else {
            System.out.println("Monthly salary cannot be negative.");
        }
    }

    public double computeSalary() {
        return monthlySalary;
    }

    public void displayFullTimeInfo() {
        System.out.println("FULL-TIME EMPLOYEE");
        System.out.println();

        displayInfo();

        System.out.printf("Monthly Salary: PHP %,.2f%n", monthlySalary);
        System.out.printf("Salary        : PHP %,.2f%n", computeSalary());
    }
}