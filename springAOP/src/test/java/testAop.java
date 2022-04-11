import com.jsm.aop.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.Target;

/**
 * @Auther Justin-ming
 * @Date 2022/3/18  21:38
 */
public class testAop {
    @Test
    public void testAop1() {
        ApplicationContext cpac = new ClassPathXmlApplicationContext("SpringAop.xml");
        User user = cpac.getBean("user", User.class);
        user.add();
    }
}
