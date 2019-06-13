package com.gaunyi.batteryonline.common;
import java.util.List;
import com.gaunyi.batteryonline.dao.User;


/**
 * Created by S0111 on 2019/6/13.
 */
public class AjaxReturnVO {
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
