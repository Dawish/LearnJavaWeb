package spring.entity;

/**
 * 使用有参构造函数注入属性
 * @author danxx
 *
 */
public class Student {
	
	private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +'}';
    }
}
