package spring.entity;

public class Employee {
	
	private int id;
    private String name;

    private Car car;// 复杂元素

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCar(Car car) {
        this.car = car;
    }

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Car getCar() {
		return car;
	}
    
    
    
}
