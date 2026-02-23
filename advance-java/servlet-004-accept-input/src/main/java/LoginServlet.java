import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

@WebServlet(value = "/login", loadOnStartup = 1)
public class LoginServlet implements Servlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("LoginServlet::init");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("LoginServlet::service");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if ("admin".equalsIgnoreCase(username) && "admin".equalsIgnoreCase(password)) {
            res.getWriter().println("Logged in Successfully.");
        } else {
            res.getWriter().println("Invalid credentials");
        }
    }

    @Override
    public String getServletInfo() {
        return "";
    }

    @Override
    public void destroy() {
        System.out.println("LoginServlet::destroy");
    }
}
