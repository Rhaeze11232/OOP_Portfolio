public class Main {

    public static void main(String[] args) {

        System.out.println("     EMPLOYEE MANAGEMENT SYSTEM");
        System.out.println();

        // ---------- Original Full-Time Employee ----------
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
        fullTimeEmployee.setEmployeeID("IT-051");
        fullTimeEmployee.setName("P. Diddy");
        fullTimeEmployee.setDepartment("Cyber Security");
        fullTimeEmployee.setMonthlySalary(10000000);

        // ---------- Original Part-Time Employee ----------
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee();
        partTimeEmployee.setEmployeeID("IT-0013");
        partTimeEmployee.setName("Jeffrey Epstein");
        partTimeEmployee.setDepartment("Data Analyst");
        partTimeEmployee.setHourlyRate(1000);
        partTimeEmployee.setHoursWorked(70);

     // Task 1: Additional Full-Time Employee 
        FullTimeEmployee fullTimeEmployee2 = new FullTimeEmployee();
        fullTimeEmployee2.setEmployeeID("FT-002");
        fullTimeEmployee2.setName("Rini Baterbonia");
        fullTimeEmployee2.setDepartment("Accounting Department");
        fullTimeEmployee2.setMonthlySalary(42500);

        // ---------- Task 1: Additional Part-Time Employee ----------
        PartTimeEmployee partTimeEmployee2 = new PartTimeEmployee();
        partTimeEmployee2.setEmployeeID("PT-002");
        partTimeEmployee2.setName("Librong James");
        partTimeEmployee2.setDepartment("Marketing Department");
        partTimeEmployee2.setHourlyRate(150);
        partTimeEmployee2.setHoursWorked(60);

        // Display full-time employee information
        fullTimeEmployee.displayFullTimeInfo();

        System.out.println();
        System.out.println("--------------------------------------");
        System.out.println();

        // Display part-time employee information
        partTimeEmployee.displayPartTimeInfo();

        System.out.println();
        System.out.println("--------------------------------------");
        System.out.println();

     // Display second full-time employee information
        fullTimeEmployee2.displayFullTimeInfo();

        System.out.println();
        System.out.println("--------------------------------------");
        System.out.println();

        // Display second part-time employee information
        partTimeEmployee2.displayPartTimeInfo();

        System.out.println();
        System.out.println("--------------------------------------");
    }
}