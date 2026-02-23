import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;

@WebServlet(value = "/login2", loadOnStartup = 1)
public class LoginServlet2 extends GenericServlet {

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
}
