public class Main {
    public static void main(String[] args) {
        Students joe = new Students("Joe ");
        Students ryan = new Students("Ryan ");
        joe.addCourse("Physics");
        joe.addCourse("Chem");
        ryan.addCourse("Math");
        System.out.println(joe.getStudentCourses());
        System.out.println(ryan.getStudentCourses());

        Courses joeCourse = new Courses("Physics", 88);
        joeCourse.addCourse("Chem", 96);
        System.out.println(joeCourse.avgGrade());
    }
}
