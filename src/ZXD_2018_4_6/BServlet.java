package ZXD_2018_4_6;
/*
2018年4月6日02:52:32
通过request来获取URL的相关方法
 */
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println(request.getScheme() + " <br/>");//获取请求协议
        response.getWriter().println(request.getServerName());//获取服务器名称
        response.getWriter().println(request.getServerPort());//获取服务器端口号
        response.getWriter().println(request.getContextPath());//获取项目名称,常用
        response.getWriter().println(request.getServletPath());//获取Servlet路径
        response.getWriter().println(request.getQueryString());//获取参数部分
        response.getWriter().println(request.getRequestURI());//获取请求URI
        response.getWriter().println(request.getRequestURL());//获取请求URL

    }
}
