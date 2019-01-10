public class Main {
    public static void main(String[] args) {
        Students joe = new Students("Joe ");
        Students ryan = new Students("Ryan ");
        //student objects
        System.out.println(ryan);
        System.out.println(joe);
        //prints student name and id

        joe.addCourse("Physics");
        joe.addCourse("Chem");
        ryan.addCourse("Math");
        //add course to student
        System.out.println(joe.getStudentCourses());
        System.out.println(ryan.getStudentCourses());
        //print student courses

        Courses joeCourse = new Courses("Physics", 88);
        //course object
        System.out.println(joeCourse);
        //print subject name
        joeCourse.addCourse("Chem", 96);
        //add course to course object
        System.out.println(joeCourse.avgGrade());
        //gets avg grade
    }
}
