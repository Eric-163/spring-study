import com.kuang.service.UserService;
import com.kuang.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liuhuan
 * @create 2020-03-03 11:35
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //动态代理，代理的是接口不可以是实现类
        UserService userService = context.getBean("userService", UserService.class);
        userService.delete();

    }
}
