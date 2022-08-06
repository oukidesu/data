package com.example.dao;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PassWord {
    @Insert("INSERT INTO myPassword values(#{userData.web},#{userData.userId},#{userData.userPassWord})")
    int insert(@Param("userData") UserData userData);

    @Select("SELECT * FROM myPassword WHERE web = #{web} AND delete_flg = 0")
    @Results({
            @Result(column = "web",property = "web"),
            @Result(column = "user_id",property = "userId"),
            @Result(column = "user_password",property = "userPassWord")
    })
    UserData select(String web);

    @Select("SELECT * FROM myPassword WHERE delete_flg = 0")
    @Results({
            @Result(column = "web",property = "web"),
            @Result(column = "user_id",property = "userId"),
            @Result(column = "user_password",property = "userPassWord")
    })
    List<UserData> selectAll();

    @Update("UPDATE myPassword SET delete_flg = 1 WHERE web = #{web}")
    int deleteDate(String web);
}
