package com.jsm.dao;

import com.jsm.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @Auther Justin-ming
 * @Date 2022/3/19  10:46
 */
@Repository
public class BookDaoImpl implements BookDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Book book) {
        String sql = "insert into t_book values(?,?,?)";
        Object[] args = {book.getId(), book.getBname(), book.getBstatus()};
        int j = jdbcTemplate.update(sql, args);
        System.out.println(j);
    }

    @Override
    public void updateBook(Book book) {
        String sql = "update t_book set bname = ?,bstatus = ? where id = ? ";
        Object[] args = {book.getBname(), book.getBstatus(), book.getId()};
        int j = jdbcTemplate.update(sql, args);
        System.out.println(j);
    }

    @Override
    public void deleteBook(Book book) {
        String sql = "delete from t_book where id = ?";
        Object[] args = {book.getId()};
        int j = jdbcTemplate.update(sql, args);
        System.out.println(j);
    }

    @Override
    public int selectBoo() {
        String sql = "select count(*) from t_book";
        Integer j = (Integer) jdbcTemplate.queryForObject(sql, Integer.class);
        return j;
    }
}
