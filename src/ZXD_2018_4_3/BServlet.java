package ZXD_2018_4_3;
/*2018年4月3日21:11:43
 演示从ServletContext中获取数据
 */

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*
        1.获取ServletContext对象
        2.调用其gerAttribute()方法完成获取数据
         */
        ServletContext application = this.getServletContext();
        String name =(String)application.getAttribute("name");
        System.out.println(name);
    }
}
