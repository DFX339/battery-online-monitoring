package com.gaunyi.batteryonline.web;

import com.gaunyi.batteryonline.common.filter.CheckResult;
import com.gaunyi.batteryonline.service.UseCheckFilter;
import com.gaunyi.batteryonline.service.UserService;
import com.gaunyi.batteryonline.dao.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import  com.gaunyi.batteryonline.common.filter.detailFilter.Filter01;
import  com.gaunyi.batteryonline.common.filter.detailFilter.Filter02;
import  com.gaunyi.batteryonline.common.filter.detailFilter.Filter03;
import com.gaunyi.batteryonline.common.filter.detailFilter.Param01;
/**
 * Created by S0111 on 2019/6/5.
 */
@RestController
public class TestController {

    @Autowired
    private UserService userService;

    @Autowired
    private Filter01 filter01;
    @Autowired
    private Filter02 filter02;
    @Autowired
    private Filter03 filter03;



    @Autowired
    private UseCheckFilter useCheckFilter;

    @RequestMapping("/index")
    public String echo(){
        return "welcome";
    }

    @RequestMapping("/users")
    public String users(){
        List<User> users = userService.findUsers();
        return users.toString();
    }

    @RequestMapping("/check")
    public  String  check(){
//        useCheckFilter.addFilter(filter01);
//        useCheckFilter.addFilter(filter02);
//        useCheckFilter.addFilter(filter03);

        Param01 param = new Param01();

        param.setPlcNo("01");
        param.setName("zs");
        List<CheckResult> resList = useCheckFilter.run(param);
        for( CheckResult res: resList) {
            System.out.println("result:" + res.getCode());
            System.out.println("result:" + res.getMsg());
            System.out.println("result:" + res.isSuccess());
            System.out.println("--======");
        }

        return  resList.toString();

    }



}
