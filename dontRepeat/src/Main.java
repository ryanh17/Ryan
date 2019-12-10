import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    /**
     *Finds day of the year
     * @param month integer from 1-12
     * @param dayOfMonth positive integer 1-30, 1-31, 1-28
     * @param year positive integer
     * @return dayOfMonth
     */
    public static String dayOfYear(int month, int dayOfMonth, int year) {
        int dayOfYear = dayOfMonth;
        ArrayList<Integer> daysPerMonth = new ArrayList<>(Arrays.asList(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31));

        if(month >= 1 && month <= 12 && dayOfMonth >= 1 && year > 1){
            if (dayOfMonth<= daysPerMonth.get(month-1)) {
                for (int i = 1; i < month; i++) {
                    dayOfYear += daysPerMonth.get(i - 1);
                }
            }
        }else{
            return "You entered invalid number";
        }
        return String.valueOf(dayOfYear);
    }



    public static void main(String[] args) {
        System.out.println(dayOfYear(12, 31, 2019));
    }
}
