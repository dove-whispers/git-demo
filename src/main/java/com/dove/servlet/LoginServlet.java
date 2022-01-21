package com.dove.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 登录
 *
 * @author dove_whispers
 * @date 2021/11/15
 */
@WebServlet("/hello")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("启动成功,访问到初始页面...");
        System.out.println("启动成功,访问到初始页面2...");
        System.out.println("启动成功,访问到初始页面3...");
        System.out.println("启动成功,访问到初始页面4...");
        response.sendRedirect(request.getContextPath() + "/hello.html");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doPost(request, response);
    }
}
