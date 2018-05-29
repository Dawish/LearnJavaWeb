package spring.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service ：业务层
 * @author danxx
 *
 */
@Service(value="userService")
public class UserService {
	
	//@Autowired：自动注入或自动装配，是根据类名去找到类对应的对象来完成注入的。
	@Autowired
	private UserDao userDao;
	
	 public void add() {
	        System.out.println("anno UserService Add Method.");
	        userDao.add();
    }
	 
}
