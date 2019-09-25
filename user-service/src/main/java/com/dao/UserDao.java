package com.dao;

import com.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {

    @Select("select * from t_user where id = #{id}")
    public User findUserById(String id);
}
