package ZXD_2018_4_6;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "sss",urlPatterns = "/4_6_ThreeServlet")
public class ThreeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //response.setCharacterEncoding("gbk");
        response.setContentType("text/html;charset=gbk");
        System.out.println("你好, 我是4_6_ThreeServlet");
        //设置响应头
        response.setHeader("aaa","AAA");
        //设置响应体,留头又留体
        response.getWriter().println("Hello, I am 4_6_ThreeServlet");
        //请求转发
        request.getRequestDispatcher("4_6_FourServlet").include(request,response);
    }
}
