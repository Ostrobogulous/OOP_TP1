package universitymanagementsystem;

public class Instructor {
    private final int instructorID;
    private String firstName;
    private String lastName;

    Instructor(int instructorID, String firstName, String lastName) {
        this.instructorID = instructorID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getInstructorID() {
        return instructorID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
