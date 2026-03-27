package lab2.problem3;

public class Time implements Comparable<Time> {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void add(Time time){
        int sumSeconds = this.second + time.getSecond();
        if(sumSeconds >= 60){
            this.second = sumSeconds % 60;
            this.minute++;
        } else {
            this.second = sumSeconds;
        }

        int sumMinutes = this.minute + time.getMinute();
        if(sumMinutes >= 60){
            this.minute = sumMinutes % 60;
            this.hour++;
        } else {
            this.minute = sumMinutes;
        }

        int sumHours = this.hour + time.getHour();
        if(sumHours >= 24){
            this.hour = sumHours % 24;
        } else {
            this.hour = sumHours;
        }
    }

    public String toUniversal(){
        return new StringBuilder(
                (this.hour < 10 ? "0" : "" )
                + this.hour + ":"
                + (this.minute < 10 ? "0" : "")
                + this.minute + ":"
                + (this.second < 10 ? "0" : "")
                + this.second).toString();
    }

    public String toStandard(){
        return new StringBuilder((this.hour != 12 ? this.hour % 12 : this.hour) + ":" + (this.minute < 10 ? "0" : "") + this.minute + ":" + (this.second < 10 ? "0" : "") + this.second + (this.hour >= 12 ? " PM" : " AM")).toString();
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    private int toSeconds() {
        return hour * 3600 + minute * 60 + second;
    }

    @Override
    public int compareTo(Time other) {
        return Integer.compare(this.toSeconds(), other.toSeconds());
    }

    @Override
    public String toString() {
        return toUniversal();
    }
}