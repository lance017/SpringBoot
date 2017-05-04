package com.didispace.domain;

import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by lance017 on 2017/5/4.
 */
@Mapper
public interface UserMapper {

    @Select("select * from user where name = #{name}")
    User fingBy(@Param("name") String name);


    /**
     * 返回主键的值
     * keyProperty="id"注意:这个配置的是对应数据库主键javabean的属性名,而不是数据库的字段名!
     * useGeneratedKeys="true" 使用自动生成key设置为true，插入后 id 自动改变
     * @param user
     * @return 影响的行数
     */
    @Insert("insert into user(name, age) values(#{name}, #{age})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(User user);


    @Select("select * from user where name = #{name}")
    @Results(
            {
                    @Result(id = true, column = "id", property = "id"),
                    @Result(column = "name", property = "name"),
                    @Result(column = "age", property = "age")
            }
    )
    List<User> findAll(@Param("name") String name);


    /**
     * 数据表的 column 与 property不对应时
     * 主键 id = true
     * @return
     */
    @Select("select * from person")
    @Results(
            {
                    @Result(id = true, column = "s_id", property = "id"),
                    @Result(column = "s_name", property = "name")
            }
    )
    List<User> findAllUser();



}
