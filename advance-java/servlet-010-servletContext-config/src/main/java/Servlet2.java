import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class Servlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        ServletContext context = getServletContext();
        writer.println("ServletContext info");
        writer.println(context.getAttribute("app-wide-username"));

        ServletConfig config = getServletConfig();
        writer.println("ServletConfig info");
        writer.println(config.getInitParameter("s2-username"));
    }
}
