package danxx.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import hibernate.dao.Customer;

/**
 * mysql主键说明:http://www.cnblogs.com/TTTTT/p/6265995.html
 * @author danxx
 *
 */
public class HibernateTest {
	 // 保存一个Customer
    @Test
    public void saveCustomerTest() {
        // 创建一个Customer
        Customer c = new Customer();
        c.setName("叶子");
        c.setAddress("武汉");
        
        SessionFactory sessionFactory = null;
        
        // A SessionFactory is set up once for an application!  
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()  
                .configure() // configures settings from hibernate.cfg.xml  
                .build();  
        try {  
            sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();  
        }  
        catch (Exception e) {  
            // The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory  
            // so destroy it manually.  
            StandardServiceRegistryBuilder.destroy( registry );  
        }  
        
        // 使用Hibernate的API来完成将Customer信息保存到mysql数据库中的操作
        Configuration config = new Configuration().configure(); 
        // Hibernate框架加载hibernate.cfg.xml文件
        // 相当于得到一个Connection
        if(sessionFactory!=null) {
        	Session session = sessionFactory.openSession(); 
            // 开启事务
            session.beginTransaction();

            // 操作
            session.save(c);

            // 事务提交
            session.getTransaction().commit();
            session.close();
            sessionFactory.close();
        }
    }
}
