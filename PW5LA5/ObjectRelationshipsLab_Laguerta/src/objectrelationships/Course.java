package objectrelationships;

import java.util.ArrayList;

public class Course {

    private String courseCode;
    private String courseName;
    private Instructor instructor;
    private ArrayList<Lesson> lessons;

    public Course(
            String courseCode,
            String courseName,
            Instructor instructor) {

        this.courseCode = courseCode;
        this.courseName = courseName;
        this.instructor = instructor;

        // The Course creates and controls the list of lessons.
        this.lessons = new ArrayList<>();
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void addLesson(
            int lessonNumber,
            String lessonTitle) {

        // Lesson object is created inside the Course.
        Lesson lesson =
                new Lesson(lessonNumber, lessonTitle);

        lessons.add(lesson);

        System.out.println(
                "Lesson added: " + lessonTitle);
    }

    public void displayCourseInformation() {
        System.out.println("\nCOURSE INFORMATION");
        System.out.println("------------------------------");

        System.out.println(
                "Course Code: " + courseCode);

        System.out.println(
                "Course Name: " + courseName);

        System.out.println(
                "Instructor: " + instructor.getName());

        System.out.println("\nCOURSE LESSONS");

        if (lessons.isEmpty()) {
            System.out.println(
                    "No lessons are currently available.");
        } else {
            for (Lesson lesson : lessons) {
                lesson.displayLesson();
            }
        }
    }
}