package com.itshaala.controller;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

@WebServlet("/hi")
public class HiServlet implements Servlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("com.itshaala.controller.HiServlet::init");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("com.itshaala.controller.HiServlet::service");
        res.getWriter().println("Hi User");
    }

    @Override
    public String getServletInfo() {
        return "";
    }

    @Override
    public void destroy() {
        System.out.println("com.itshaala.controller.HiServlet::destroy");
    }
}
