import java.util.ArrayList;

public class Main {
    public static ArrayList<PartTime> partTimeList(ArrayList<Employee> mainList){
        ArrayList<PartTime> partTimeEmployees = new ArrayList<>();
        for(Employee i: mainList){
            if (i instanceof PartTime){
                partTimeEmployees.add((PartTime)i);
            }
        }
        return partTimeEmployees;
    }

    public static ArrayList<FullTime> fullTimeList(ArrayList<Employee> mainList){
        ArrayList<FullTime> fullTimeEmployees = new ArrayList<>();
        for(Employee i: mainList){
            if (i instanceof FullTime){
                fullTimeEmployees.add((FullTime) i);
            }
        }
        return fullTimeEmployees;
    }

    public static ArrayList<HourlyEmployee> hourlyEmployeeList (ArrayList<Employee> mainList){
        ArrayList<HourlyEmployee> hourlyEmployees = new ArrayList<>();
        for(Employee i: mainList){
            if (i instanceof HourlyEmployee){
                hourlyEmployees.add((HourlyEmployee) i);
            }
        }
        return hourlyEmployees;
    }

    public static ArrayList<SalaryEmployee> salaryEmployeeList(ArrayList<Employee> mainList){
        ArrayList<SalaryEmployee> salaryEmployees = new ArrayList<>();
        for(Employee i: mainList){
            if (i instanceof SalaryEmployee){
                salaryEmployees.add((SalaryEmployee) i);
            }
        }
        return salaryEmployees;
    }



    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(new PartTime("John", 2001, 20, 12));
        employeeList.add(new FullTime("Max", 1999, 40, 21));
        employeeList.add(new SalaryEmployee("Regan", 2006, 56000));

        System.out.println("Salary Employees: " + salaryEmployeeList(employeeList));
        System.out.println("Hourly Employees: " + hourlyEmployeeList(employeeList));
        System.out.println("Full Time Employees: " + fullTimeList(employeeList));
        System.out.println("Part Time Employees: " + partTimeList(employeeList));
    }
}
