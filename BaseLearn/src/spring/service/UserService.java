package spring.service;

import spring.dao.UserDao;

/**
 * 以三层架构中的service层和dao层为例，为了让service层使用dao层的类创建的对象，
 * 需要将dao对象注入到service层类中。
 * @author danxx
 *
 */
public class UserService {
	
	// 声明为接口类型，降低service层与dao层的耦合度，不依赖于dao层的具体实现
	private UserDao userDao; 

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        System.out.println("UserService Add...");
        this.userDao.add();
    }
}
