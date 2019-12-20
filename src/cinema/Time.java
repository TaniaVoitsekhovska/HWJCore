package cinema;

import java.util.Objects;

public class Time {

    private int min;
    private int hour;

    public Time(int hour, int min) {
        if (hour < 0 || hour > 24)
            throw new RuntimeException("Wrong hour!");

        if (min < 0 || min > 60)
            throw new RuntimeException("Wrong minutes!");

        this.hour = hour;
        this.min = min;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public static Time movieDurationSeance(Time startTime, Time timeToAdd) {
        int hour = startTime.getHour() + timeToAdd.getHour();
        int min = startTime.getMin() + timeToAdd.getMin();

        if (min >= 60) {
            int count = min / 60;
            hour += count;
            min = min - (count * 60);
        }
        if(min>=30){
            min=59;
        }else {
            min=29;
        }

        return new Time(hour, min);
    }

    public boolean isBefore(Time obj) {
        if (this.hour < obj.hour)
            return true;
        if (this.hour == obj.hour) {

            if (this.min < obj.min)
                return true;
        }
        return false;
    }

    public boolean isAfter(Time obj) {
        if (this.hour > obj.hour)
            return true;
        if (this.hour == obj.hour) {
            if (this.min > obj.min)
                return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return min == time.min &&
                hour == time.hour;
    }

    @Override
    public int hashCode() {
        return Objects.hash(min, hour);
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", min=" + min +
                '}';
    }
}
