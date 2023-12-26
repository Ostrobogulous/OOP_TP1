package universitymanagementsystem;

import java.util.ArrayList;

public class Student {
    private final int studentID;
    private String firstName;
    private String lastName;
    private ArrayList<Course> courses;

    Student(int studentID, String firstName, String lastName, ArrayList<Course> courses) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.courses = courses;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void enroll(Course course) {
        courses.add(course);
        System.out.printf("%s %s has been enrolled to course %s\n", firstName, lastName, course.getCourseName());
    }
}
