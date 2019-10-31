public class PartTime extends HourlyEmployee{
    public boolean hasBenefits = false;

    PartTime(String name, int hireYear, double hoursPerWeek, double hourlyWage){
        super(name, hireYear, hoursPerWeek, hourlyWage);
    }

    @Override
    public boolean HasBenefits() {
        return hasBenefits;
    }

    @Override
    public double annualSalary() {
        return monthlySalary()*12;
    }

    @Override
    public double monthlySalary() {
        return hoursPerWeek * hourlyWage * 4;
    }

}
