import com.jsm.entity.Book;
import com.jsm.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import java.lang.annotation.Annotation;

/**
 * @Auther Justin-ming
 * @Date 2022/3/21  11:01
 */
public class Tupdata {
    @Test
    public void update() {
        ApplicationContext cpac = new ClassPathXmlApplicationContext("SpringJDBC.xml");
        BookService bookservice = cpac.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setId("1");
        book.setBname("jsm");
        book.setBstatus("1");

        bookservice.addBook(book);

    }

    @Test
    public void tx() {
        AnnotationConfigApplicationContext t = new AnnotationConfigApplicationContext();
        t.getBean("service");
    }
}
