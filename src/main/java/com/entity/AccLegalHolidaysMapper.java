package com.entity;

import com.entity.AccLegalHolidays;
import java.util.Date;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface AccLegalHolidaysMapper {
    @Delete({
        "delete from acc_legal_holidays",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into acc_legal_holidays (id, holiday_date, ",
        "ff, blobname, ",
        "blobname2, cc3)",
        "values (#{id,jdbcType=INTEGER}, #{holidayDate,jdbcType=DATE}, ",
        "#{ff,jdbcType=INTEGER}, #{blobname,jdbcType=LONGVARBINARY}, ",
        "#{blobname2,jdbcType=LONGVARBINARY}, #{cc3,jdbcType=LONGVARBINARY})"
    })
    int insert(AccLegalHolidays record);

    @InsertProvider(type=AccLegalHolidaysSqlProvider.class, method="insertSelective")
    int insertSelective(AccLegalHolidays record);

    @Select({
        "select",
        "id, holiday_date, ff, blobname, blobname2, cc3",
        "from acc_legal_holidays",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="holiday_date", javaType=Date.class, jdbcType=JdbcType.DATE),
        @Arg(column="ff", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="blobname", javaType=byte[].class, jdbcType=JdbcType.LONGVARBINARY),
        @Arg(column="blobname2", javaType=byte[].class, jdbcType=JdbcType.LONGVARBINARY),
        @Arg(column="cc3", javaType=byte[].class, jdbcType=JdbcType.LONGVARBINARY)
    })
    AccLegalHolidays selectByPrimaryKey(Integer id);

    @UpdateProvider(type=AccLegalHolidaysSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(AccLegalHolidays record);

    @Update({
        "update acc_legal_holidays",
        "set holiday_date = #{holidayDate,jdbcType=DATE},",
          "ff = #{ff,jdbcType=INTEGER},",
          "blobname = #{blobname,jdbcType=LONGVARBINARY},",
          "blobname2 = #{blobname2,jdbcType=LONGVARBINARY},",
          "cc3 = #{cc3,jdbcType=LONGVARBINARY}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(AccLegalHolidays record);

    @Update({
        "update acc_legal_holidays",
        "set holiday_date = #{holidayDate,jdbcType=DATE},",
          "ff = #{ff,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(AccLegalHolidays record);
}