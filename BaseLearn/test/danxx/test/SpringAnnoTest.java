package danxx.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.anno.User;
import spring.anno.UserService;

/**
 * Spring框架入门
 * https://blog.csdn.net/zxiang248/article/details/51785377
 * @author danxx
 *
 */
public class SpringAnnoTest {
	
    @Test
    public void runUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("annoSpringBean.xml");
        User user = (User) context.getBean("user");
        user.add();
    }
    
    @Test
    public void runUserService() {
        ApplicationContext context = new ClassPathXmlApplicationContext("annoSpringBean.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.add();
    }
}
