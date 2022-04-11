import com.jsm.Spring5;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther Justin-ming
 * @Date 2022/3/21  17:28
 */
@SpringJUnitConfig(Spring5.class)
public class springtest {
    @Autowired
    private ApplicationContext ctx;
    @Autowired
    private Date date;
    @Autowired
    private SimpleDateFormat simpleDateFormat;

    @Test
    public void test2() {
        System.out.println(simpleDateFormat.format(date));
    }

    @Test
    public void t1() {
        for (String beanDefinitionName : ctx.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
    }
}
