import com.jsm.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Auther Justin-ming
 * @Date 2022/3/16  17:50
 */
public class AppTest {
    public static void main(String[] args) {
        var acac = new AnnotationConfigApplicationContext(SpringConfig.class);

        Connection conn = null;
        try {
            conn = acac.getBean(DataSource.class).getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(conn);
        System.out.println(acac.getBeanDefinitionCount());
        for (String beanDefinitionName : acac.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
    }

}
