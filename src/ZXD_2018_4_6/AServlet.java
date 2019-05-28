package ZXD_2018_4_6;
/*
2018年4月6日02:31:43
获取客户端的IP地址
获取请求方式
获取User-Agent
得到客户端信息

 */
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "mmm")
public class AServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String addr = request.getRemoteAddr();//获取客户端IP地址
    System.out.println("IP:" + addr );
    System.out.println("请求方式:" + request.getMethod());//获取请求方式
    String userAgent = request.getHeader("User-Agent");//获取名为User-Agent的请求头
    System.out.println(userAgent);
    }
}
