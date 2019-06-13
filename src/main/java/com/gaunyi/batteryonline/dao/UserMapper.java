package com.gaunyi.batteryonline.dao;



import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by S0111 on 2019/6/5.
 */
@Component
@Mapper
public interface UserMapper {

    @Select("SELECT USERNAME,PASSWORD FROM tmp_users")
    @Results(id = "user", value = {
            @Result(property = "username", column = "username", javaType = String.class),
            @Result(property = "password", column = "PASSWORD", javaType = String.class),
    })
    public List<User> findUsers();

    @Select("SELECT USERNAME,PASSWORD FROM tmp_users where username=#{username}")
    @Results(id = "user1", value = {
            @Result(property = "username", column = "username", javaType = String.class),
            @Result(property = "password", column = "PASSWORD", javaType = String.class),
    })
    public User findByUserid(String username);

    @Insert("insert into tmp_users(username,PASSWORD) values(#{username},#{password})")
    public int insertUser(User user);

    @Update("update tmp_users set password=#{password} where username=#{username}")
    public int updateUser(User user);

    @Delete("delete from tmp_users where username=#{username}")
    public int deleteUser(String username);

}
