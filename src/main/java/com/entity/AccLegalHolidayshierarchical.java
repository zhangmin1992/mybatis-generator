package com.entity;

import java.util.Date;

public class AccLegalHolidayshierarchical extends AccLegalHolidaysKeyhierarchical {
    private Date holidayDate;

    public AccLegalHolidayshierarchical(Integer id, Date holidayDate) {
        super(id);
        this.holidayDate = holidayDate;
    }

    public AccLegalHolidayshierarchical() {
        super();
    }

    public Date getHolidayDate() {
        return holidayDate;
    }

    public void setHolidayDate(Date holidayDate) {
        this.holidayDate = holidayDate;
    }
}