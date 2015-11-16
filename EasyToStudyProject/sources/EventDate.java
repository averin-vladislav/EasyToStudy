package sample;

import java.util.Objects;

/**
 * Created by Владислав on 12.11.2015.
 */
public class EventDate {
    private Integer month;
    private Integer day;

    EventDate(Integer _month, Integer _day) {
        month = _month;
        day = _day;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setMonth(Integer _month) {
        month = _month;
    }

    public void setDay(Integer _day) {
        day = _day;
    }

    public void setDate(Integer _month, Integer _day) {
        month = _month;
        day = _day;
    }

    public String getInfo() {
        String info = "";

        switch (month)
        {
            case 1: info += "January";
                break;
            case 2: info += "February";
                break;
            case 3: info += "March";
                break;
            case 4: info += "April";
                break;
            case 5: info += "May";
                break;
            case 6: info += "June";
                break;
            case 7: info += "July";
                break;
            case 8: info += "August";
                break;
            case 9: info += "September";
                break;
            case 10: info += "October";
                break;
            case 11: info += "November";
                break;
            case 12: info += "December";
                break;
        }
        info += " " + day;

        return info;
    }

    public boolean equal(EventDate eventDate) {
        return (Objects.equals(this.month, eventDate.month)) && (Objects.equals(this.day, eventDate.day));
    }

    public boolean moreEqualThan(EventDate eventDate) {
        return (this.month > eventDate.month) || ((Objects.equals(this.month, eventDate.month)) && (this.day >= eventDate.day));
    }

    public boolean lessThan(EventDate eventDate) {
        return (this.month < eventDate.month) || ((Objects.equals(this.month, eventDate.month)) && (this.day < eventDate.day));
    }
}
