package com.bing.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: Web-HomeWork
 * @description:
 * 实验内容：
 * 编写JSP程序,实现用户提交登录表单给Servlet,由Servlet 查询数据库（模拟查询，不用真的连接数据库查询）,对用户是否存在进行验证。
 * 实验步骤：
 * （1）编写一个验证用户的Servlet(LoginServlet. java),再编写登录页面程序login.html、登录成功页面welcome.jsp和登录失败页面loginfail.jsp。
 * （2）运行程序查看效果。
 * @author: RuoBing
 * @create: 2021-10-20 22:56
 **/


public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.setContentType("text/html;charset=utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (("nzb").equals(username)&&("123").equals(password)) {
            response.sendRedirect("http://localhost:8080/welcome.jsp");
        } else {
            response.sendRedirect("http://localhost:8080/loginfail.jsp");
        }
    }
    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}

