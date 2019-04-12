package day45ForMyvatisSource.entity;

import java.util.Date;

public class AccTable {
    private Integer id;

    private Date holidayDate;

    private String activityName;

    public AccTable(Integer id, Date holidayDate, String activityName) {
        this.id = id;
        this.holidayDate = holidayDate;
        this.activityName = activityName;
    }

    public AccTable() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getHolidayDate() {
        return holidayDate;
    }

    public void setHolidayDate(Date holidayDate) {
        this.holidayDate = holidayDate;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }
}