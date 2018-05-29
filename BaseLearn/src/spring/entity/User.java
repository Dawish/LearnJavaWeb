package spring.entity;
/**
 * 需要在spring的配置文件中配置bean
 * @author danxx
 *
 */
public class User {
	
	public void add() {
		System.out.println("User Add Method.");
	}

	@Override
	public String toString() {
		return "This is a user object.";
	}
}
