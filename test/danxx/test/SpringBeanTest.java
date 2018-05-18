package danxx.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.test.User;
/**
 * 测试spring通过配置文件创建类对象 
 * @author danxx
 *
 */
public class SpringBeanTest {
	
	@Test
    public void runUser() {
        // 1. 加载Spring配置文件，根据创建对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2. 得到配置创建的对象
        User user = (User) context.getBean("user");
        System.out.println(user.toString());
        user.add();
    }
}
