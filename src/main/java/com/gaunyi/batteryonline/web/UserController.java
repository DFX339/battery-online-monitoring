package com.gaunyi.batteryonline.web;

import com.gaunyi.batteryonline.common.AjaxReturnVO;
import com.gaunyi.batteryonline.common.DataResult;
import com.gaunyi.batteryonline.service.UserService;
import com.gaunyi.batteryonline.dao.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


/**
 * Created by S0111 on 2019/6/13.
 * 对数据进行增删改查
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    DataResult data = new DataResult();

    @RequestMapping("/findAll")
    public DataResult findAllUsers(){
        List<User> users = userService.findUsers();
        AjaxReturnVO ajaxVo = new AjaxReturnVO();
        ajaxVo.setUsers(users);
        data.setMsg("ok");
        data.setCode("200");
        data.getData().put("users",ajaxVo);
        return data;
    }

    @RequestMapping("/findById")
    public DataResult findUserById(@RequestParam String username){
        User user = userService.findByUserid(username);
        data.setMsg("ok");
        data.setCode("200");
        data.getData().put("users",user);
        return data;
    }

    @RequestMapping("/insert")
    public DataResult insertUser(@RequestParam String username,String password){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        int insertResult = userService.insertUser(user);
        data.setMsg("ok");
        data.setCode("200");
        data.getData().put("insertResult",insertResult);
        return data;
    }

    @RequestMapping("/update")
    public DataResult updateUser(@RequestParam String username,String password){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        int updateUser = userService.updateUser(user);
        data.setMsg("ok");
        data.setCode("200");
        data.getData().put("updateUser",updateUser);
        return data;
    }

    @RequestMapping("/delete")
    public DataResult deleteUser(@RequestParam String username){
        int deleteResult = userService.deleteUser(username);
        data.setMsg("ok");
        data.setCode("200");
        data.getData().put("deleteResult",deleteResult);
        return data;
    }
}
