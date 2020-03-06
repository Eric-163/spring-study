import com.kuang.pojo.Student;
import com.kuang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liuhuan
 * @create 2020-02-29 14:16
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
        /**
         * Student{name='秦疆',
         * address=Address{address='西安'},
         * books=[红楼梦, 西游记, 水浒传, 三国演义],
         * hobbies=[唱, 跳, rap, 篮球],
         * card={身份证=111222333344445555,
         *       银行卡=111111111111111111
         *      },
         * games=[LOL, COC, BOB],
         * wife='null',
         * info={password=123456,
         *       url=男,
         *       driver=20200229,
         *       username=root
         *      }
         *}
         */
    }
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = context.getBean("user2", User.class);
        User user2 = context.getBean("user2", User.class);

        System.out.println(user.hashCode());
        System.out.println(user2.hashCode());

        System.out.println(user == user2);
    }
}
