package com.jsm.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @Auther Justin-ming
 * @Date 2022/3/17  10:06
 */
@Service
public class UserDao {
    public void save() {
        System.out.println("保存成功");
    }
}
