package spring.anno;

import org.springframework.stereotype.Repository;

/**
 * Repository ：持久层
 * @author danxx
 *
 */
@Repository(value = "UserDao")
public class UserDao {
	
	public void add() {
        System.out.println("anno UserDao Add Method.");
    }
	
}
