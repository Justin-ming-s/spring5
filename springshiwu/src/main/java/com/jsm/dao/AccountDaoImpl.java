package com.jsm.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @Auther Justin-ming
 * @Date 2022/3/21  15:58
 */
@Repository
public class AccountDaoImpl implements AccountDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void des() {
        String sql = "update t_account set money = money-? where id = ?";
        Object[] j = {100, "lucy"};
        jdbcTemplate.update(sql, j);
    }

    @Override
    public void add() {
        String sql = "update t_account set money = money+? where username = ?";
        Object[] j = {100, "mary"};
        jdbcTemplate.update(sql, j);
    }
}
