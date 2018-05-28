### SpringMVC框架主要由DispatcherServlet、HandlerMapping、Controller、ViewResolver四个接口组成。

### SpringMVC常用注解

- @Controller

　　负责注册一个bean 到spring 上下文中

- @RequestMapping

　　注解为控制器指定可以处理哪些 URL 请求

- @RequestBody

　　该注解用于读取Request请求的body部分数据，使用系统默认配置的HttpMessageConverter进行解析，然后把相应的数据绑定到要返回的对象上 ,再把HttpMessageConverter返回的对象数据绑定到 controller中方法的参数上

- @ResponseBody

　　 该注解用于将Controller的方法返回的对象，通过适当的HttpMessageConverter转换为指定格式后，写入到Response对象的body数据区

- @ModelAttribute 　　　

　　在方法定义上使用 @ModelAttribute 注解：Spring MVC 在调用目标处理方法前，会先逐个调用在方法级上标注了@ModelAttribute 的方法

　　在方法的入参前使用 @ModelAttribute 注解：可以从隐含对象中获取隐含的模型数据中获取对象，再将请求参数 –绑定到对象中，再传入入参将方法入参对象添加到模型中 

- @RequestParam　

　　在处理方法入参处使用 @RequestParam 可以把请求参 数传递给请求方法

- @PathVariable

　　绑定 URL 占位符到入参

- @ExceptionHandler

　　注解到方法上，出现异常时会执行该方法

- @ControllerAdvice

　　使一个Contoller成为全局的异常处理类，类中用@ExceptionHandler方法注解的方法可以处理所有Controller发生的异常

---

[刘阳Java]_Spring MVC中ModelAndView的用法_第3讲

https://www.cnblogs.com/liuyangjava/p/6752120.html

[刘阳Spring MVC学习笔记]

http://www.cnblogs.com/liuyangjava/p/6736619.html
