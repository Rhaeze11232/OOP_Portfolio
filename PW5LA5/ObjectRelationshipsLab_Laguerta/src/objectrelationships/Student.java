package objectrelationships;

public class Student extends User {

    private String studentNumber;
    private Course enrolledCourse;

    public Student(
            int userId,
            String name,
            String email,
            String studentNumber) {

        super(userId, name, email);
        this.studentNumber = studentNumber;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void enrollInCourse(Course course) {
        this.enrolledCourse = course;

        System.out.println(
                getName() + " successfully enrolled in "
                + course.getCourseName() + ".");
    }

    public void displayStudentInformation() {
        System.out.println("\nSTUDENT INFORMATION");
        System.out.println("------------------------------");

        displayUserInformation();

        System.out.println(
                "Student Number: " + studentNumber);

        if (enrolledCourse != null) {
            System.out.println(
                    "Enrolled Course: "
                    + enrolledCourse.getCourseName());
        } else {
            System.out.println(
                    "Enrolled Course: None");
        }
    }
}