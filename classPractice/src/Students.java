import java.util.ArrayList;

public class Students {
    private String firstName;
    private static int id = 0;
    private int personalId;
    ArrayList studentCourses = new ArrayList();

    Students(String firstName){
        this.firstName = firstName;
        id++;
        personalId = id;
    }

    public void addCourse(String course){
        this.studentCourses.add(course);
    }

    public String getFirstName() {
        return firstName;
    }

    public int getId() {
        return personalId;
    }

    public ArrayList getStudentCourses(){
        return studentCourses;
    }

    public String toString(){
        return firstName + personalId;
    }

}
