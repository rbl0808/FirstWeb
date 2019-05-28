package ZXD_2018_4_3;
/*
2018年4月3日21:55:10
网站访问量统计
 */

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class VisitServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*
        1.获取ServletContext对象
        2.从ServletContext对象中获取名为count的属性
        3.如果存在:给访问量count+1,然后再保存回去
        4.如果不存在:如果不存在:说明是第一次访问，
        向ServletContext中保存名为count的属性,值为1
         */
        ServletContext app = this.getServletContext();
        Integer count =(Integer)app.getAttribute("count");
        if(count == null){
            app.setAttribute("count",1);
        }else {
            //app.setAttribute("count",count++);
            app.setAttribute("count",++count);
        }
    /*
    向浏览器中输出
    需要使用响应对象
     */
    resp.setCharacterEncoding("GBK");
    PrintWriter pw = resp.getWriter();
    pw.println("<h1>" + "共有" + count + "次访问"+ "</h1>");

    }
}
