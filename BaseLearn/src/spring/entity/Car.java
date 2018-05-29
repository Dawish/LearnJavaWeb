package spring.entity;

public class Car {
	
	private String name;
    private double price;
    
    public Car() {
		// TODO Auto-generated constructor stub
	}
    
    // 为Car类 提供构造方法
    public Car(String name, double price) {
        super();
        this.name = name;
        this.price = price;
    }
    
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "[name:"+name+" price:"+price+"]";
    }
}
