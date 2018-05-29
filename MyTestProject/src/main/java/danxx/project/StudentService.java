package danxx.project;

import org.springframework.stereotype.Component;

@Component
public class StudentService {

	public StudentService() {
		System.out.println("StudentService Constructor...\n\n\n\n\n\n");
	}

	public void save() {
		System.out.println("StudentService save");
	}
}
