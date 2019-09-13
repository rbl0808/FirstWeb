package ZXD_2018_4_5;
/*
2018年4月5日17:02:24
用户请求AServlet,然后AServlet响应302,给出location头,将其重定向到BServlet
 */
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class AServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  System.out.println("我是AServlet");
  /*
  1.设置location
  2.发送302状态码
   */
  response.setHeader("location","4_5_BServlet");
  response.setStatus(302);
  //快捷的重定向
       //response.sendRedirect('4_5_BServlet');
    }

}
