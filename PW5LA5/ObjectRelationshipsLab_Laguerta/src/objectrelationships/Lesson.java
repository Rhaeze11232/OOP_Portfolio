package objectrelationships;

public class Lesson {

    private int lessonNumber;
    private String lessonTitle;

    public Lesson(
            int lessonNumber,
            String lessonTitle) {

        this.lessonNumber = lessonNumber;
        this.lessonTitle = lessonTitle;
    }

    public int getLessonNumber() {
        return lessonNumber;
    }

    public String getLessonTitle() {
        return lessonTitle;
    }

    public void displayLesson() {
        System.out.println(
                "Lesson " + lessonNumber
                + ": " + lessonTitle);
    }
}