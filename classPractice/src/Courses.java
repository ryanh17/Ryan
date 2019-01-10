import java.util.ArrayList;

public class Courses {
    private String subjectName;
    private ArrayList studentGrade = new ArrayList();
    private int addedGrades;

    Courses(String subjectName, int studentGrade){
        this.subjectName = subjectName;
        this.studentGrade.add(studentGrade);
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int avgGrade(){
        for(int i = 0; i < studentGrade.size();){
            addedGrades = addedGrades + (int)studentGrade.get(i);
            i++;
        }
        return addedGrades/studentGrade.size();
    }

    public void addCourse(String subjectName, int studentGrade){
        this.subjectName = subjectName;
        this.studentGrade.add(studentGrade);
    }

    public String toString(){
        return subjectName;
    }
}