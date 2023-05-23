package inhaus.inhaus.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class DataDto {

    private int month;
    private int day;
    private String start_time;
    private String end_time;
    private String contents;

    public DataDto(Data data) {
        this.month = data.getMonth();
        this.day = data.getDay();
        this.start_time = data.getStart_time();
        this.end_time = data.getEnd_time();
        this.contents = data.getContents();
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getStartTime() {
        return start_time;
    }

    public void setStartTime(String startTime) {
        this.start_time = startTime;
    }

    public String getEndTime() {
        return end_time;
    }

    public void setEndTime(String endTime) {
        this.end_time = endTime;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
