package spring.anno;

import org.springframework.stereotype.Component;

@Component(value = "user")
public class User {
	
	public void add() {
		System.out.println("anno User add method!");
	} 
}
