package ZXD_2018_4_5;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("我是CServlet");
        response.setCharacterEncoding("GBK");
        PrintWriter writer =response.getWriter();
        writer.print("欢迎你登录!5s后会自动跳转到主页");
        /*
        车市名为Refresh的响应头
         */
        response.setHeader("Refresh","5,URL=/4_5_DServlet");
    }
}
