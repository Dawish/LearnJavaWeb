package danxx.project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;


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
	
	/**
	 * 让SpringMVC框架回调Servlet API接口
	 * 在请求处理的方法上加入对应的Servlet API接口作为方法参数就可以了
	 * http://localhost:8080/MyTestProject/m04.jsp
	 * @param request
	 * @param response
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping("/m04")
	public void m04(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String id = request.getParameter("id");
		String sname = request.getParameter("sname");
		String t_id = request.getParameter("t_id");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println(id + "  " + sname + "  " + t_id);
		out.flush();
		out.close();
	}
	
	/**
	 * SpringMVC的rest风格的参数定义
	 * http://localhost:8080/MyTestProject/123/danxx/m05
	 * @param id
	 * @return
	 */
	@RequestMapping("/{id}/{sname}/m05")
	public String m05(@PathVariable String id, @PathVariable String sname) {
		System.out.println("id = " + id);
		System.out.println("sname = " + sname);
		/**返回jsp页面*/
		return "successful";
	}
	
	/**
	 * http://localhost:8080/MyTestProject/m06
	 * 利用ModelAndView来转发数据,给前端视图
	 * @return
	 */
	@RequestMapping("/m06")
	public ModelAndView m06() {
		ModelAndView modelAndView = new ModelAndView();
		//利用ModelAndView来将数据转发到m06.jsp页面
		modelAndView.setViewName("m06");
		modelAndView.addObject("message", "Hello World, Hello Kitty");
		return modelAndView;
	}
	
	/**
	 * ModelAndView默认转发
	 * ModelAndView还是可以设置重定向
	 * http://localhost:8080/MyTestProject/danxx/m17
	 * http://localhost:8080/MyTestProject/admin/m17
	 * 1. 重定向另一个控制器
	 * 2. 重定向具体的jsp页面
	 * @param name
	 * @return
	 */
	@RequestMapping("/{name}/m17")
	public ModelAndView m07(@PathVariable String name) {
		if (!"admin".equals(name)) {
			/**重定向到m06.jsp页面*/
			return new ModelAndView("redirect:/successful.jsp");
		}
		/**转到m08控制器*/
		return new ModelAndView("forward:/m08");
	}
	
	@RequestMapping("/m08")
	@ResponseBody
	public String m08() {
		return "from m17 redirect ! ";
	}
	
	/**
	 * @ResponseBody 将实体转换成Json数据
	 * 具备两个条件
	 * 1. 导入jackson-core.jar, jackson-annotation.jar, jackson-databind.jar
	 * 2. springmvc-web.xml 添加 <mvc:annotation-driven/>
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/m09")
	public String m09() {
		Student student = new Student();
		student.setId(1001);
		student.setName("xiaohopng");
		student.setAge(12);
		return JSON.toJSONString(student);
	}
	
	
}
