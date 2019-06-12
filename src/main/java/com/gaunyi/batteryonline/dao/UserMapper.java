package com.gaunyi.batteryonline.dao;



import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by S0111 on 2019/6/5.
 */
@Component
@Mapper
public interface UserMapper {

    @Select("SELECT USERNAME,PASSWORD FROM users")
    @Results(id = "user", value = {
            @Result(property = "username", column = "username", javaType = String.class),
            @Result(property = "password", column = "PASSWORD", javaType = String.class),
    })
    public List<User> findUsers();
}
