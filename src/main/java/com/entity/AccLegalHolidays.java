package com.entity;

import java.util.Date;

public class AccLegalHolidays {
    private Integer id;

    private Date holidayDate;

    private Integer ff;

    private byte[] blobname;

    private byte[] blobname2;

    private byte[] cc3;

    public AccLegalHolidays(Integer id, Date holidayDate, Integer ff) {
        this.id = id;
        this.holidayDate = holidayDate;
        this.ff = ff;
    }

    public AccLegalHolidays(Integer id, Date holidayDate, Integer ff, byte[] blobname, byte[] blobname2, byte[] cc3) {
        this.id = id;
        this.holidayDate = holidayDate;
        this.ff = ff;
        this.blobname = blobname;
        this.blobname2 = blobname2;
        this.cc3 = cc3;
    }

    public AccLegalHolidays() {
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

    public Integer getFf() {
        return ff;
    }

    public void setFf(Integer ff) {
        this.ff = ff;
    }

    public byte[] getBlobname() {
        return blobname;
    }

    public void setBlobname(byte[] blobname) {
        this.blobname = blobname;
    }

    public byte[] getBlobname2() {
        return blobname2;
    }

    public void setBlobname2(byte[] blobname2) {
        this.blobname2 = blobname2;
    }

    public byte[] getCc3() {
        return cc3;
    }

    public void setCc3(byte[] cc3) {
        this.cc3 = cc3;
    }
}