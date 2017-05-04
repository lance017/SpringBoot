package com.didispace.domain;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.annotations.Param;

/**
 * Created by lance017 on 2017/5/4.
 */

@Mapper
public interface StudentMapper {


    @Select("select * from addresses where addr_id = #{addr_id}")
    @Results(
            {
                    @Result(id = true, column = "addr_id", property = "addr_id"),
                    @Result(column = "street", property = "street"),
                    @Result(column = "city", property = "city"),
                    @Result(property = "state", column = "state"),
                    @Result(property = "zip", column = "zip"),
                    @Result(property = "country", column = "country")
            })
    Address findAddress(@Param("addr_id") int addr_id);



    @Select(value = "SELECT * FROM STUDENTS WHERE stud_id = #{stud_id}")
    @Results(
            {
                    @Result(id = true, column = "stud_id", property = "stud_id"),
                    @Result(column = "name", property = "name"),
                    @Result(column = "email", property = "email"),
                    @Result(property = "address", column = "addr_id",                                   one = @One(select = "com.didispace.domain.StudentMapper.findAddress"))
            })
    Student selectStudentWithAddress(@Param("stud_id") int stud_id);

}
