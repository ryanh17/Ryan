public class Main {
    public static void main(String[] args) {
        //creates school object
        School windermere =  new School("Windermere", true, 1960);

        //adds 3 teachers to teacher list
        windermere.addTeacher(new Teacher("Bill", "Dude","Physics"));
        windermere.addTeacher(new Teacher("Jon", "Noel","Math"));
        windermere.addTeacher( new Teacher("Don", "Farrow","PE"));

        //adds 10 students to student list
        windermere.addStudents(new Student("Kyle", "Lowry", 10));
        windermere.addStudents(new Student("Sam", "Den", 11));
        windermere.addStudents(new Student("Henry", "Ye", 10));
        windermere.addStudents(new Student("Greg", "Walk", 11));
        windermere.addStudents(new Student("Josh", "Bosh", 10));
        windermere.addStudents(new Student("Carlos", "Jones", 11));
        windermere.addStudents(new Student("Sierra", "Sam", 10));
        windermere.addStudents(new Student("James", "Mo", 11));
        windermere.addStudents(new Student("Joe", "Dill", 10));
        windermere.addStudents(new Student("Ryan", "Huang", 11));

        //prints teacher & student lists
        System.out.println(windermere.allTeachers());
        System.out.println(windermere.allStudents());

        //remove 2 students
        windermere.deleteStudent(5);
        windermere.deleteStudent(3);

        //remove a teacher
        windermere.deleteTeacher(1);

        //prints teacher & student lists
        System.out.println(windermere.allTeachers());
        System.out.println(windermere.allStudents());
    }
}
