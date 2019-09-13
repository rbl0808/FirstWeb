package ZXD_2018_4_19;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "eeeee",urlPatterns = "/4_19_CServlet")
public class CServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Hello JQuery_Ajax_GET");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        response.getWriter().print("Hello JQuery_Ajax_GET!!!" + "<br/>" +  df.format(new Date()));
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("Hello JQuery_Ajax_POST" + "     " + username);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        response.getWriter().print(
                "Hello JQuery_Ajax_POST !!!" + df.format(new Date()) +"<br/>" + password);

    }
}
