package com.gaunyi.batteryonline.service;
import com.gaunyi.batteryonline.dao.User;
import org.apache.ibatis.annotations.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Created by S0111 on 2019/6/5.
 */

public interface UserService {

    public List<User>  findUsers();

    public User findByUserid(String username);

    public int insertUser(User user);

    public int updateUser(User user);

    public int deleteUser(String username);
}
