package danxx.project;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/student")
public class StudentController {
	

	private static final Logger LOGGER = Logger.getLogger(StudentController.class);
	
	@Autowired
    private StudentService userService;
    
    @RequestMapping(value="/save/{onlyid}",method=RequestMethod.GET)
    @ResponseBody
    public String saveUser(@PathVariable("onlyid") Integer onlyid){
        System.out.println(onlyid);
        userService.save();
        LOGGER.info("student id : "+onlyid);
        return "student save success!";
    }
    
}
