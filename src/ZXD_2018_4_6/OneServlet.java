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

@WebServlet(name = "qqq",urlPatterns = "/4_6_OneServlet")
public class OneServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("你好,我是4_6_OneServlet");
        //设置响应头
        response.setHeader("aaa","AAA");
       //设置响应体,留头不留体

        response.getWriter().print("Hello,我是4_6_OneServlet");
        //请求转发
        request.getRequestDispatcher("4_6_TwoServlet").forward(request,response);
    }
}
