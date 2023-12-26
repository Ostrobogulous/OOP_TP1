package universitymanagementsystem;

public class Course {
    private final int courseID;
    private String courseName;
    private Instructor instructor;

    Course(int courseID, String courseName, Instructor instructor) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public int getCourseID() {
        return courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public Instructor getInstructor() {
        return instructor;
    }


}
