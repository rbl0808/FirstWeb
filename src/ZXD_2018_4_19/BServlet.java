package ZXD_2018_4_19;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "dddd",urlPatterns = "/4_19_BServlet")
public class BServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
         * 向客户端发送json串
         */
        String str = "{\"name\":\"rbl\", \"age\":18, \"sex\":\"male\"}";
        response.getWriter().print(str);
        System.out.println(str);
    }
}
