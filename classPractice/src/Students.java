import java.util.ArrayList;

public class Students {
    private String firstName;
    private static int id = 0;
    private int personalId;
    ArrayList studentCourses = new ArrayList();

    Students(String firstName){
        this.firstName = firstName;
        id++;
        personalId = id + 1;
    }

    public void addCourse(String course){
        this.studentCourses.add(course);
    }

    public String getFirstName() {
        return firstName;
    }

    public static int getId() {
        return id;
    }

    public ArrayList getStudentCourses(){
        return studentCourses;
    }

}
