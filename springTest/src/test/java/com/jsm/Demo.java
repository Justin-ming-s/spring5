package com.jsm;

import com.jsm.config.SpringConfig;
import com.jsm.services.UserDao;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @Auther Justin-ming
 * @Date 2022/3/17  10:06
 */
@SpringJUnitConfig(classes = {SpringConfig.class})
@DisplayName("测试SpringConfig")
public class Demo {
    @Autowired
    UserDao userdao;

    @Test
    public void t1() {
        userdao.save();
    }
}
