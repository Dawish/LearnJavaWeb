package spring.aop;
/**
 * 纯粹的Spring xml配置方式实现aop
 * @author Administrator
 *
 */
public class LogHandler {
	
	public void before() {
        System.out.println("Start Write Log.");
    }

    public void after() {
        System.out.println("End Write Log.");
    }
}
