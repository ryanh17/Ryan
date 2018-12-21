import java.util.ArrayList;

public class Students {
    private String firstName;
    private static int id = 0;
    ArrayList studentCourses = new ArrayList();

    Students(String firstName){
        this.firstName = firstName;
        id++;
        System.out.println(firstName + id);
    }

    public void addCourse(String course){
        this.studentCourses.add(course);
    }

    public ArrayList getStudentCourses(){
        return studentCourses;
    }

}
