package spring.entity;

/**
 * Spring使用set方法注入属性
 * @author danxx
 *
 */
public class Teacher {
	
	private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' + '}';
    }
}
