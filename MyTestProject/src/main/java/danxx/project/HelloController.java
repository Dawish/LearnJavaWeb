package danxx.project;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {
	
	  //相当于servlet的doGet和doPost方法
	  public ModelAndView handleRequest(HttpServletRequest request,HttpServletResponse response) throws Exception {
	    // 接收数据
	    // 调用服务层
	    return new ModelAndView("success","username","sean");
	  }
	
}
