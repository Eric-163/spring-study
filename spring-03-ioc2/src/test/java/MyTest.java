import com.kuang.pojo.User;
import com.kuang.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liuhuan
 * @create 2020-02-28 17:54
 */
public class MyTest {
    public static void main(String[] args) {
//        User user = new User();
        //spring容器，就类似于婚介网站！
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserT user = (UserT) context.getBean("u5");
//        User user = (User) context.getBean("user~~别名");
//        User user2 = (User) context.getBean("user");
//        System.out.println(user == user2);
        user.show();
    }
}
