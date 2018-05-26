package danxx.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	
	@RequestMapping(value = "/say", method = RequestMethod.GET)
	@ResponseBody
	public String sayHello() {
		
		return "danxx test project sayHello!";
		
	}
	
}
