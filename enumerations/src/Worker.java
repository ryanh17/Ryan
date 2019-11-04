public enum Worker {
    PARTTIME(false, 20),
    FULLTIME(true ,40);


    private Boolean hasBenefits;
    private int hoursPerWeek;

    Worker(Boolean hasBenefits, int hoursPerWeek){
        this.hasBenefits = hasBenefits;
        this.hoursPerWeek = hoursPerWeek;
    }

    private static int daysPerWeek = 7;

    public int hoursPerDay(Worker worker){
        return worker.hoursPerWeek/daysPerWeek;
    }

    public Boolean getHasBenefits() {
        return hasBenefits;
    }
}
