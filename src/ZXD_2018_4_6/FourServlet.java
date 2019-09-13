package ZXD_2018_4_6;
/*
2018年4月6日17:41:36
演示请求包含
 */
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ttt",urlPatterns = "/4_6_FourServlet")
public class FourServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       //response.setContentType("text/html;charset=gbk");
        //response.setCharacterEncoding("gbk");
        System.out.println("你好, 我是4_6_FourServlet");
        response.getWriter().print("          Hello, 我是4_6_FourServlet");
    }
}
