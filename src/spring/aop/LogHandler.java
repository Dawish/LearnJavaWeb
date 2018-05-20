package spring.aop;

public class LogHandler {
	
	public void before() {
        System.out.println("Start Write Log.");
    }

    public void after() {
        System.out.println("End Write Log.");
    }
}
