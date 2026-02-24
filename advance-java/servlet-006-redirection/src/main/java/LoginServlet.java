import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if ("admin".equalsIgnoreCase(username) && "admin".equalsIgnoreCase(password)) {
            RequestDispatcher rd = req.getRequestDispatcher("welcome");
            rd.forward(req, resp);
        } else {
            RequestDispatcher rd = req.getRequestDispatcher("login.html");
            rd.include(req, resp);
            writer.println("<h2 style=\"color: red\">Invalid Credentials</h2>");
        }
    }
}
