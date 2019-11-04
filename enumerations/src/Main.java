public class Main {
    public static void main(String[] args) {
        EnumTest enumTest = new EnumTest(Worker.FULLTIME);
        EnumTest enumTest1 = new EnumTest(Worker.PARTTIME);

        System.out.println(enumTest.worker.getHasBenefits());
        System.out.println(enumTest.worker.hoursPerDay(Worker.FULLTIME));
        System.out.println(enumTest1.worker.hoursPerDay(Worker.PARTTIME));
    }
}
