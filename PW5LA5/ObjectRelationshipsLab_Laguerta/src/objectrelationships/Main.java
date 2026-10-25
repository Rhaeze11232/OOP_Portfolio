package objectrelationships;

public class Main {

    public static void main(String[] args) {

        System.out.println(
                "UNIVERSITY LEARNING MANAGEMENT SYSTEM");

        System.out.println(
                "==========================================");

        // Create an Instructor object.
        Instructor instructor =
                new Instructor(
                        1001,
                        "Prof. Maria Cruz",
                        "mcruz@university.edu",
                        "EMP-2026-001",
                        "Object-Oriented Programming");

        // Create a Department object.
        // The existing Instructor is passed to it.
        Department department =
                new Department(
                        "CITE",
                        "College of Information Technology Education",
                        instructor);

        // Create a Course object.
        Course course =
                new Course(
                        "OOP101",
                        "Object-Oriented Programming",
                        instructor);

        // Course creates its own Lesson objects.
        course.addLesson(
                1,
                "Classes and Objects");

        course.addLesson(
                2,
                "Encapsulation and Inheritance");

        course.addLesson(
                3,
                "Object Relationships");

        // Create a Student object.
        Student student =
                new Student(
                        2001,
                        "Juan Dela Cruz",
                        "juan@university.edu",
                        "2026-00001");

        // Association between Student and Course.
        student.enrollInCourse(course);

        instructor.displayInstructorInformation();

        department.displayDepartmentInformation();

        course.displayCourseInformation();

        student.displayStudentInformation();

        System.out.println(
                "\n==========================================");

        System.out.println(
                "Program completed successfully.");
    }
}