package danxx.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	
	@RequestMapping(value = "/say", method = RequestMethod.GET)
	@ResponseBody
	public String sayHello() {
		
		return "danxx test project sayHello!";
		
	}
	
	/**
	 * path
	 * RESTful api
	 * http://localhost:8080/MyTestProject/user/123
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/user/{id}",method=RequestMethod.GET)
	@ResponseBody
    public String get(@PathVariable("id") Integer id){
        System.out.println("get"+id);
        return "user id : " + id;
    }
	
	/**
	 * 如果业务控制器的方法有参数，则方法中的参数就是可以接收url的传参
	 * @RequestParam
	 * 1. required：是否必须要有这个参数
	 * 2. value: 定义url的参数名称
	 * 3. defaultValue：定义参数的默认值
	 * http://localhost:8080/MyTestProject/user?sid=123
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/user",method=RequestMethod.GET)
	@ResponseBody
    public String m0(@RequestParam(required=true,value="sid",defaultValue="100") String sid){
		System.out.println("sid = " + sid);
        return "sid id : " + sid;
    }
	
	/**
	 * http://localhost:8080/MyTestProject/saveStudent.jsp
	 * 	表单数据提交传递给Spring MVC可以利用JavaBean来接收数据 
	 *	SpringMVC一键封装JavaBean                
	 *	关键点：表单中参数名称和JavaBean的属性一样            
	 * @param student
	 * @return
	 */
	@RequestMapping(value="/saveStudent")
    public String saveStudent(Student student){
		System.out.println("student = " + student.toString());
		/**返回jsp页面*/
        return "successful";
    }
}
