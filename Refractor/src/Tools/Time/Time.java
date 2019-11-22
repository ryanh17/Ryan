package tools.time;

public class Time implements TheTicker {
    private Hour hr;
    private Minute min;
    private Second sec;

    //Requires:
    //Modifies: this
    //Effects: hour, minute and seconds to 0
    public Time(){
        hr = new Hour();
        min = new Minute();
        sec = new Second();

    }

    //Requires: Hour, Minute, Second
    //Modifies: this
    //Effects: sets hr, min, sec to given hr, min, and sec
    public Time(Hour hr, Minute min, Second sec){
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

    //Requires: Time
    //Modifies: this
    //Effects: sets hr, min, sec to given Time class
    public Time(Time time){
        this.hr = time.hr;
        this.min = time.min;
        this.sec = time.sec;
    }

    public Hour getHr() {
        return hr;
    }

    public void setHr(Hour hr) {
        this.hr = hr;
    }

    public Minute getMin() {
        return min;
    }

    public void setMin(Minute min) {
        this.min = min;
    }

    public Second getSec() {
        return sec;
    }

    public void setSec(Second sec) {
        this.sec = sec;
    }


    //Requires:
    //Modifies: this
    //Effects: when seconds at 59 & minute at 59 & hour at 23, then set hr,min,sec all to 0
    //          if hour not at 23, but seconds and minute at 59, then second min and sec to 0
    //          if min not at 59, but seconds is, then sec seconds to 0 and tick 1 min
    //          if seconds, minutes not at 59 and hour not at 23, then tick one second
    public void tick(){
        if(sec.getSeconds() == 59){
            if(min.getMinute() == 59){
                if(hr.getHour() == 23){
                    hr.setHour(0);
                    min.setMinute(0);
                    sec.setSeconds(0);
                }
                else{
                    hr.tick();
                    min.setMinute(0);
                    sec.setSeconds(0);
                }
            }
            else{
                min.tick();
                sec.setSeconds(0);
            }
        }
        else{
            sec.tick();
        }
    }
    public String toString(){
        return hr.toString()+":"+min.toString()+":"+sec.toString();
    }
}
