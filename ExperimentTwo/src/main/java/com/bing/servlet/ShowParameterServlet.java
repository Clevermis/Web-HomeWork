package com.bing.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * @program: Web-HomeWork
 * @description: 实验2.1 Servlet输出表单的全部数据项
 * 实验内容： 设计一个Servlet接收表单，寻找表单传来的所有变量名字，并把它们放入表格中，没有值或有多个值的变量都突出显示。
 * 设计思路:首先，程序通过HttpServletRequest的getParameterNames()方法得到表单中所有的变量名字. getParameterNames()方法返回的是一- 个枚举集合( Enumeration)。
 * 接下来,循环遍历这个Enumeration,通过hasMoreElements()方法确定何时结束循环，利用nextElement()方法得到Enumeration中的各个项。由于nextElement方法返回的是一个Object,要把它转换成字符串，
 * 再调用getParameterValues()方法得到字符串数组，如果这个数组只有一个元素且为空字符串，说明这个表单变量没有值，Servlet以斜体形式输出“No Value";
 * 如果数组元素个数大于1,说明这个表单变量有多个值，以列表形式输出这些值;其他情况下Servlet直接把变量值放人表格。
 * @author: RuoBing
 * @create: 2021-10-20 22:26
 **/

public class ShowParameterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowParameterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String title = "读取所有请求参数";
        String docType =
                "<!doctype html public \"-//w3c//dtd html 4.0 " +
                        "transitional//en\">\n";
        out.println(docType +
                "<html>\n" +
                "<head><meta charset=\"utf-8\"><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + title + "</h1>\n" +
                "<table width=\"100%\" border=\"1\" align=\"center\">\n" +
                "<tr bgcolor=\"#949494\">\n" +
                "<th>参数名字</th><th>参数值</th>\n"+
                "</tr>\n");

        Enumeration paramNames = request.getParameterNames();
        while(paramNames.hasMoreElements()) {
            String paramName = (String)paramNames.nextElement();
            out.print("<tr><td>" + paramName + "</td>\n");
            String[] paramValues =
                    request.getParameterValues(paramName);
            if (paramValues.length == 1) {
                String paramValue = paramValues[0];
                if (paramValue.length() == 0) {
                    out.println("<td><i>No Valueֵ</i></td>");
                } else {
                    out.println("<td>" + paramValue + "</td>");
                }
            } else {
                out.println("<td><ul>");
                for(int i=0; i < paramValues.length; i++) {
                    out.println("<li>" + paramValues[i]);
                }
                out.println("</ul></td>");
            }
            out.print("</tr>");
        }
        out.println("\n</table>\n</body></html>");
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