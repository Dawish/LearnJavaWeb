package danxx.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
    private StudentService userService;
    
    @RequestMapping(value="/save/{id}",method=RequestMethod.GET)
    @ResponseBody
    public String saveUser(@PathVariable("id") Integer id){
        System.out.println(id);
        userService.save();
        return "student save success!";
    }
    
}
