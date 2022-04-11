package com.jsm.service;

import com.jsm.dao.BookDao;
import com.jsm.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Auther Justin-ming
 * @Date 2022/3/19  10:50
 */
@Service
@Transactional(readOnly = false, propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ)
public class BookService {

    @Autowired
    private BookDao bookDao;

    //添加
    public void addBook(Book book) {
        bookDao.add(book);
    }

    //修改
    public void updateBook(Book book) {
        bookDao.updateBook(book);
    }

    //删除
    public void deleteBook(Book book) {
        bookDao.deleteBook(book);
    }

    //查询
    public int selectBook() {

        return bookDao.selectBoo();
    }

}
