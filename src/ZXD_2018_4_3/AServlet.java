package ZXD_2018_4_3;
//2018年4月3日21:07:50
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*
        1.获取ServletConfig对象
        2.调用其setAttribute()方法完成保存数据
         */
        ServletContext application = this.getServletContext();
        application.setAttribute("name","张翔达");
    }
}
