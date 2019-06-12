package com.gaunyi.batteryonline.service;
import com.gaunyi.batteryonline.dao.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Created by S0111 on 2019/6/5.
 */

public interface UserService {

    public List<User>  findUsers();
}
