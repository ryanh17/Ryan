public class Time {
    int hour;
    int minute;
    int second;
    String hPrint;
    String mPrint;
    String sPrint;

    Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        //checks for invalid time & loops until solved
        while (hour >= 24 || minute >= 60 || second >= 60 || second < 0) {
            if (hour >= 24) {
                hour = hour - 24;
            }
            if (minute >= 60) {
                hour = hour + (minute / 60); //divide minutes by 60 and add answer to hours
                minute = 0 + (minute % 60); //then take the remainder and add it to minutes
            }
            if (second >= 60) {
                minute = minute + (second / 60);
                second = 0 + (second % 60);
            }
            if (second < 0) {
                minute--;
                second = 60 + second; //if negative seconds then take one away from minutes and add negative seconds to 60
            }
        }

        //checks for time numbers under 10 and adds 0 in front
        if (hour < 10){
            hPrint =  "0" + hour;
        } else {
            hPrint = String.valueOf(hour);
        }
        if (minute < 10){
            mPrint =  "0" + minute;
        }else {
            mPrint = String.valueOf(minute);
        }
        if (second < 10){
            sPrint =  "0" + second;
        }else{
            sPrint = String.valueOf(second);
        }
        //prints the time
        return hPrint + ":" + mPrint + ":" + sPrint;
    }

    public String nextSecond(){
        second++;
        return toString();
    }
    public String previousSecond(){
        second--;
        return toString();
    }
}
