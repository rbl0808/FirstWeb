package ZXD_2018_4_6;
/*2018年4月6日17:23:20
演示请求转发
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "rrr",urlPatterns = "/4_6_TwoServlet")
public class TwoServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("你好, 我是4_6_TwoServlet");
        response.getWriter().print("Hello,I am 4_6_TwoServlet");
    }
}
