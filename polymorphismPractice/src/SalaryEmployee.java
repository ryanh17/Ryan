public class SalaryEmployee extends Employee{
    public int annualSalary;
    public boolean hasBenefits = true;

    SalaryEmployee(String name, int hireYear, int annualSalary){
        super(name, hireYear);
        this.annualSalary = annualSalary;
    }

    @Override
    public double annualSalary() {
        return annualSalary;
    }

    @Override
    public double monthlySalary() {
        return annualSalary/12;
    }
}
