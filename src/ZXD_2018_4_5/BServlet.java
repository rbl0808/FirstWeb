package ZXD_2018_4_5;
/*
2018年4月5日17:03:01
浏览器会重定向到这里来
 */
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   System.out.println("我是从AServlet重定向来的BServlet");
    }
}
