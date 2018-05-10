package controllor;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;


//@WebServlet(name = "Servlet",loadOnStartup = 1)
//获取该servlet所在的web的项目路径
//将web项目路径放在context域对象，以后所有的资源都可以从域对象取出
//什么时候放在域对象，在该servlet初始化的时候
//将servlet初始化的时间移到服务器启动,InitServlet实例化，初始化，这样就将web项目路径放到域对象里

public class InitServlet extends HttpServlet {


//    无参的，有参需要传进confiure,而配置文件应该有tomcat直接插入
//    实例化对象的时候会初始化方法

    @Override
    public void init() throws ServletException {
        String path=getServletContext().getContextPath();
        getServletContext().setAttribute("path",path);
    }


}

