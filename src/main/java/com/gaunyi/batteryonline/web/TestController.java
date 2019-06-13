package com.gaunyi.batteryonline.web;

import com.gaunyi.batteryonline.service.UserService;
import com.gaunyi.batteryonline.dao.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by S0111 on 2019/6/5.
 */
@RestController
public class TestController {

    @Autowired
    private UserService userService;


    @RequestMapping("/index")
    public String echo(){
        return "welcome";
    }

    @RequestMapping("/users")
    public String users(){
        List<User> users = userService.findUsers();
        return users.toString();
    }
}
