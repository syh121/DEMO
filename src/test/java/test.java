import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import syh.dao.UserDao;
import syh.service.UserService;

/**
 * @author SYH
 * @create 2021-10-25 19:58
 */
public class test {
//    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-conf/applicationContext.xml");
//        UserService userService = (UserService) context.getBean("userServicecImpl");
//        System.out.println(userService.getAll());
//    }
    @Autowired
    private static UserService userService;

    public static void main(String[] args) {
        System.out.println(userService.getAll());
    }
}
