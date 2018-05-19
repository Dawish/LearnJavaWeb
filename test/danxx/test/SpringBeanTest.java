package danxx.test;

import java.util.Arrays;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.entity.Employee;
import spring.entity.PropertyDemo;
import spring.entity.Student;
import spring.entity.Teacher;
import spring.entity.User;
import spring.service.UserService;
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
	
	@Test
	public void runStudent() {
	    // 1. 加载Spring配置文件，根据创建对象
	    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	    // 2. 得到配置创建的对象
	    Student student = (Student) context.getBean("student");
	    System.out.println(student.toString());
	}
	
	@Test
	public void runTeacher() {
	    // 1. 加载Spring配置文件，根据创建对象
	    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	    // 2. 得到配置创建的对象
	    Teacher teacher = (Teacher) context.getBean("teacher");
	    System.out.println(teacher.toString());
	}
	
	@Test
	public void runUserService() {
	    // 1. 加载Spring配置文件，根据创建对象
	    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	    // 2. 得到配置创建的对象
	    UserService userService = (UserService) context.getBean("userService");
	    userService.add();
	}
	
	@Test
	public void runPropertyDemo() {
	    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	    PropertyDemo pd = (PropertyDemo) context.getBean("prop");
	    System.out.println(pd);
	    System.out.println(Arrays.toString(pd.getArrs()));
	    System.out.println(pd.getList());
	    System.out.println(pd.getMap());
	    System.out.println(pd.getProperties());
	}
	
	@Test
	public void runBeanDemo() {
	    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	    Employee employee = (Employee) context.getBean("employee");
	    System.out.println(employee.getId());
	    System.out.println(employee.getName());
	    System.out.println(employee.getCar().toString());
	    
	    Employee employeeP = (Employee) context.getBean("employeeP");
	    System.out.println(employeeP.getId());
	    System.out.println(employeeP.getName());
	    System.out.println(employeeP.getCar().toString());
	    
	    
	    Employee employee3 = (Employee) context.getBean("employee3");
	    System.out.println(employee3.getId());
	    System.out.println(employee3.getName());
	    System.out.println(employee3.getCar().toString());
	}
	
}
