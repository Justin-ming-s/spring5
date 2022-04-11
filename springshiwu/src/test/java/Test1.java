import com.jsm.service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @Auther Justin-ming
 * @Date 2022/3/21  16:21
 */

public class Test1 {
    @Test
    public void test12() {
        ApplicationContext cpac = new ClassPathXmlApplicationContext("Spring.xml");
        AccountService accountService = cpac.getBean("accountService", AccountService.class);
        accountService.accounts();

    }
}
