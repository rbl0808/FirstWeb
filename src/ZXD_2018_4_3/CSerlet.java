package ZXD_2018_4_3;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

public class CSerlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*
        得到的是有盘符的路径 D:/xxxxxxx/xxxxxxxx
         */
        String path = this.getServletContext().getRealPath("/index.jsp");
        System.out.println(path);
        /*
        获取资源后，在创建出输入流对象
         */
        InputStream input = this.getServletContext().getResourceAsStream("/index.jsp");
        /*
        获取当前路径下所有资源的真实路径
         */
        Set<String> paths =  this.getServletContext().getResourcePaths("/WEB-INF");
        System.out.println(paths);



    }
}
