import com.kuang.dao.UserDaoMysqlImpl;
import com.kuang.dao.UserDaoOracleImpl;
import com.kuang.dao.UserDaoSqlserverImpl;
import com.kuang.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liuhuan
 * @create 2020-02-27 18:56
 */
public class MyTest {
    public static void main(String[] args) {
//        //用户实际调用的是业务层，DAO层他们不需要接触！
//        UserServiceImpl userService = new UserServiceImpl();
//        userService.setUserDao(new UserDaoSqlserverImpl());
//        userService.getUser();


        //获取ApplicationContext,拿到spring的容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //容器在手，天下我有，需要什么，就直接get什么！
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("userServiceImpl");
        userServiceImpl.getUser();
    }
}
