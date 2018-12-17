public class Employee {
    public int id;
    public String firstName;
    public String lastName;
    public int salary;

    public int getID(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getName(){
        return firstName + lastName;
    }
    public int getSalary(){
       return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getAnnualSalary(){
        return salary * 12;
    }
    public int raiseSalary(int percent){
        int newSalary = (salary * percent) + salary;
        return newSalary;
    }
    public String toString(){
        return "Employee[id = " + id + ", Name = " + firstName + lastName + ", Salary = " + salary + "]";
    }
}
