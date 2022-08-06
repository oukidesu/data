package com.example.dao;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PassWord {
    @Insert("INSERT INTO myPassword values(#{userData.web},#{userData.userId},#{userData.userPassWord})")
    int insert(@Param("userData") UserData userData);

    @Select("SELECT * FROM myPassword WHERE web = #{web}")
    @Results({
            @Result(column = "web",property = "web"),
            @Result(column = "user_id",property = "userId"),
            @Result(column = "user_password",property = "userPassWord")
    })
    UserData select(String web);

    @Select("SELECT * FROM myPassword")
    @Results({
            @Result(column = "web",property = "web"),
            @Result(column = "user_id",property = "userId"),
            @Result(column = "user_password",property = "userPassWord")
    })
    List<UserData> selectAll();
}
