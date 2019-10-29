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
        return 0;
    }

    @Override
    public double monthlySalary() {
        return 0;
    }

}
