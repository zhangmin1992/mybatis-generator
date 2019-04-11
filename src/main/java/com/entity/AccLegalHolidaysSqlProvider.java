package com.entity;

import com.entity.AccLegalHolidays;
import org.apache.ibatis.jdbc.SQL;

public class AccLegalHolidaysSqlProvider {

    public String insertSelective(AccLegalHolidays record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("acc_legal_holidays");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getHolidayDate() != null) {
            sql.VALUES("holiday_date", "#{holidayDate,jdbcType=DATE}");
        }
        
        if (record.getFf() != null) {
            sql.VALUES("ff", "#{ff,jdbcType=INTEGER}");
        }
        
        if (record.getBlobname() != null) {
            sql.VALUES("blobname", "#{blobname,jdbcType=LONGVARBINARY}");
        }
        
        if (record.getBlobname2() != null) {
            sql.VALUES("blobname2", "#{blobname2,jdbcType=LONGVARBINARY}");
        }
        
        if (record.getCc3() != null) {
            sql.VALUES("cc3", "#{cc3,jdbcType=LONGVARBINARY}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(AccLegalHolidays record) {
        SQL sql = new SQL();
        sql.UPDATE("acc_legal_holidays");
        
        if (record.getHolidayDate() != null) {
            sql.SET("holiday_date = #{holidayDate,jdbcType=DATE}");
        }
        
        if (record.getFf() != null) {
            sql.SET("ff = #{ff,jdbcType=INTEGER}");
        }
        
        if (record.getBlobname() != null) {
            sql.SET("blobname = #{blobname,jdbcType=LONGVARBINARY}");
        }
        
        if (record.getBlobname2() != null) {
            sql.SET("blobname2 = #{blobname2,jdbcType=LONGVARBINARY}");
        }
        
        if (record.getCc3() != null) {
            sql.SET("cc3 = #{cc3,jdbcType=LONGVARBINARY}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}