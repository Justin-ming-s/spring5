package com.jsm.service;

import com.jsm.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther Justin-ming
 * @Date 2022/3/21  15:59
 */
@Service
public class AccountService {

    @Autowired
    private AccountDao accountDao;

    public void accounts() {
        accountDao.des();
        accountDao.add();

    }
}
