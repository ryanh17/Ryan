
//this class if for creating a teacher object which contains their name and subject
public class Teacher {
    String firstName;
    String lastName;
    String subject;

    //constructor setting name and subject
    Teacher(String firstName, String lastName, String subject){
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    //overrides default printing and prints Name: name Subject: subject
    public String toString() {
        return "Name: " + firstName +" " +lastName + " Subject: " + subject;
    }
}
