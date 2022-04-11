package com.jsm.dao;


import com.jsm.entity.Book;

/**
 * @Auther Justin-ming
 * @Date 2022/3/19  10:46
 */
public interface BookDao {
    void add(Book book);

    void updateBook(Book book);

    void deleteBook(Book book);

    int selectBoo();
}
