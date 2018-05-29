package spring.aop;
/**
 * 纯粹的Spring xml配置方式实现aop
 * @author Administrator
 *
 */
public class User {
	
	public void add() {
        System.out.println("Running Aop User Add Method.");
    }
}
