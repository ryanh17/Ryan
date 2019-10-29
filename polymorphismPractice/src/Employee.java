public abstract class Employee {
    public String name;
    public int hireYear;

    Employee(String name, int hireYear){
        this.name = name;
        this.hireYear = hireYear;
    }

    Employee(){

    }

    public String getName() {
        return name;
    }

    public int getHireYear() {
        return hireYear;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Hire Year: " + hireYear + " Monthly Salary: " + monthlySalary() + " Annual Salary: " + annualSalary();
    }

    public abstract double annualSalary();

    public abstract double monthlySalary();
}
