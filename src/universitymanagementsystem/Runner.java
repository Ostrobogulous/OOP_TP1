package universitymanagementsystem;

import java.util.ArrayList;

public class Runner {
    public static void showCourses(Student s) {
        System.out.printf("%s %s courses: \n", s.getFirstName(), s.getLastName());
        ArrayList<Course> courses = s.getCourses();
        for (Course course : courses) {
            System.out.println(course.getCourseName());
        }
    }

    public static void main(String[] args) {
        Instructor i1 = new Instructor(1, "Erik", "Demaine");
        Instructor i2 = new Instructor(2, "Sheldon", "Cooper");

        Course c1 = new Course(1, "Algorithms and Datastructures", i1);
        Course c2 = new Course(2, "Computational Geometry", i1);
        Course c3 = new Course(3, "Dark Matter", i2);
        Course c4 = new Course(4, "Calculus", i2);

        ArrayList<Course> courses = new ArrayList<Course>();
        courses.add(c1);
        courses.add(c2);
        courses.add(c3);

        Student s1 = new Student(1, "Iyed", "Abdelli", courses);

        showCourses(s1);

        s1.enroll(c4);

        showCourses(s1);
    }
}
