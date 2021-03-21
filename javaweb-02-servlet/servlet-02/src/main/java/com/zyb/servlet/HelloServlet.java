package com.zyb.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //this.getInitParameterNames()          初始化参数
        //this.getServletConfig()               servlet配置
        //this.getServletContext()              Servlet上下文连接

        ServletContext context =this.getServletContext();
        String username="zyb";
        context.setAttribute("username",username);//将一个数据保存在了ServletContext中，名字为username,值username

        System.out.println("Hello");
    }
}
