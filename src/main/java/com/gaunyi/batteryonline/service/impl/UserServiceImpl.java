package com.gaunyi.batteryonline.service.impl;

import com.gaunyi.batteryonline.service.UserService;
import com.gaunyi.batteryonline.dao.User;
import com.gaunyi.batteryonline.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by S0111 on 2019/6/5.
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findUsers() {

        return userMapper.findUsers();
    }
}
