package danxx.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.anno.User;
import spring.anno.UserService;

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
