package com.entity;

import java.util.Date;

public class AccLegalHolidaysWithBLOBshierarchical extends AccLegalHolidayshierarchical {
    private byte[] blobname;

    public AccLegalHolidaysWithBLOBshierarchical(Integer id, Date holidayDate, byte[] blobname) {
        super(id, holidayDate);
        this.blobname = blobname;
    }

    public AccLegalHolidaysWithBLOBshierarchical() {
        super();
    }

    public byte[] getBlobname() {
        return blobname;
    }

    public void setBlobname(byte[] blobname) {
        this.blobname = blobname;
    }
}