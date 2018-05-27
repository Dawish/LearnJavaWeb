###SpringMVC框架主要由DispatcherServlet、HandlerMapping、Controller、ViewResolver四个接口组成。
**1、前端控制器DispatcherServlet**

是整个SpringMVC的核心。从名称来看，它是一个Servlet，负责统一分发所有请求。
-拦截符合特定格式的URL请求
-初始化DispatcherServlet上下文对应的WebApplicationContext，并与业务层、持久化层建立联系
-初始化SpringMVC的各个组件，并装配到DispatcherServlet中