
//this class is for creating a student object and contains their name, grade and ID
public class Student {
    String firstName;
    String lastName;
    int grade;
    int studentID;
    static int tempID = 0; //used to increase ID number

    //constructor setting name and grade as well as ID
    Student(String firstName, String lastName, int grade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        tempID++; //increases ID
        studentID = tempID; //sets studentID
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    @Override
    //overrides default printing and prints Name: name Grade: grade
    public String toString() {
        return "Name: " + firstName + " " + lastName + " Grade: " + grade;
    }
}
