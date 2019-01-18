import java.util.ArrayList;

//this class is for creating a school object and contains an ArrayList of teachers and students & school name, if school is public, and year established
public class School {
    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    String schoolName;
    boolean isPublic;
    int yearEst;

    //constructor for school setting name, if the school is public, and the year established
    School(String schoolName, boolean isPublic, int yearEst){
        this.schoolName = schoolName;
        this.isPublic = isPublic;
        this.yearEst = yearEst;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher); //adds Teacher object created with Teacher class to the teachers ArrayList
    }

    public void addStudents(Student student){
        students.add(student); //adds Student object created with Student class to the students ArrayList
    }

    public void deleteTeacher(int i){
        teachers.remove(i); //removes Teacher object from given index position
    }

    public void deleteStudent(int i){
        students.remove(i); //removes Student object from given index position
    }

    public ArrayList allTeachers(){
        return teachers; //returns list of all teachers in ArrayList
    }

    public ArrayList allStudents(){
        return students; //returns list of all teachers in ArrayList
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    public int getYearEst() {
        return yearEst;
    }

    public void setYearEst(int yearEst) {
        this.yearEst = yearEst;
    }
}
