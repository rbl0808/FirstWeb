package ZXD_2018_4_6;
/*
2018年4月6日03:09:25
使用Referer请求头,来防盗链
 */
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
public class CServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  String referer = request.getHeader("Referer");
  if(referer==null || !referer.contains("localhost") ){
      response.sendRedirect("http://www.baidu.com");

  }else{
      System.out.println("hello，大帅哥");
  }
  }
}
