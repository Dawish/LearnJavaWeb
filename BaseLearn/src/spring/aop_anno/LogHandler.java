package spring.aop_anno;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
/**
 * 注解方式实现aop
 * @author Administrator
 *
 */
@Aspect
public class LogHandler {
	
	@Before(value="execution(* spring.aop_anno.AopUser.*(..))")
    public void before() {
        System.out.println("Before aop_anno Write Log.");
    }

	@After(value="execution(* spring.aop_anno.AopUser.*(..))")
    public void after() {
        System.out.println("After aop_anno Write Log.");
    }
}
