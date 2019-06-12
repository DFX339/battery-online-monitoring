package com.gaunyi.batteryonline.dao;


import lombok.Data;

import java.io.Serializable;

/**
 * Created by S0111 on 2019/6/5.
 */
@Data
public class User implements Serializable{

    private String username;
    private String password;

    public User(){}

}



