public class Main {

    /**
     *Finds day of the year
     * @param month integer from 1-12
     * @param dayOfMonth positive integer 1-30, 1-31, 1-28
     * @param year positive integer
     * @return dayOfMonth
     */
    public static int dayOfYear(int month, int dayOfMonth, int year) {
        if (month == 2) {
            dayOfMonth += 31;
        } else if (month == 3) {
            dayOfMonth += 59;
        } else if (month == 4) {
            dayOfMonth += 90;
        } else if (month == 5) {
            dayOfMonth += 120;
        } else if (month == 6) {
            dayOfMonth += 151;
        } else if (month == 7) {
            dayOfMonth += 181;
        } else if (month == 8) {
            dayOfMonth += 212;
        } else if (month == 9) {
            dayOfMonth += 243;
        } else if (month == 10) {
            dayOfMonth += 273;
        } else if (month == 11) {
            dayOfMonth += 304;
        } else if (month == 12) {
            dayOfMonth += 335;
        }
        return dayOfMonth;
    }



    public static void main(String[] args) {
        System.out.println(dayOfYear(3, 20, 2019));
    }
}
