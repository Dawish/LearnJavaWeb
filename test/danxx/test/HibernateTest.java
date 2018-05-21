package danxx.test;

import java.util.List;

import org.hibernate.Query;
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
    
    // 根据id查询一个Customer对象
    @Test
    public void findCustomerByIdTest() {
        Configuration config = new Configuration().configure(); // Hibernate框架加载hibernate.cfg.xml文件
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession(); // 相当于得到一个Connection
        // 开启事务
        session.beginTransaction();

        // 根据业务来编写代码
        // Customer c = session.get(Customer.class, 1);
        Customer c = session.load(Customer.class, 5);

        System.out.println(c.getName());

        // 事务提交
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
    
    // 修改操作
    @Test
    public void updateCustomerTest() {
        Configuration config = new Configuration().configure(); // Hibernate框架加载hibernate.cfg.xml文件
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession(); // 相当于得到一个Connection
        // 开启事务
        session.beginTransaction();

        // 根据业务来编写代码
        Customer c = session.get(Customer.class, 5);
        c.setName("郑敏");
        session.update(c); // 修改操作

        // 事务提交
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }

    // 删除操作---根据id进行删除
    @Test
    public void deleteCustomerTest() {
        Configuration config = new Configuration().configure(); // Hibernate框架加载hibernate.cfg.xml文件
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession(); // 相当于得到一个Connection
        // 开启事务
        session.beginTransaction();

        // 根据业务来编写代码
        Customer c = session.get(Customer.class, 6);
        session.delete(c); // 删除操作

        // 事务提交
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }

    // 查询所有Customer
    @Test
    public void findAllCustomerTest() {
        Configuration config = new Configuration().configure(); // Hibernate框架加载hibernate.cfg.xml文件
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession(); // 相当于得到一个Connection
        // 开启事务
        session.beginTransaction();

        // 根据业务来编写代码
        Query query = session.createQuery("from Customer"); // HQL语句，它类似于SQL语句
        List<Customer> list = query.list();
        System.out.println(list);

        // 事务提交
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
