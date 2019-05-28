package ZXD_2018_4_6;

import com.sun.xml.internal.bind.v2.model.core.EnumConstant;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;


@WebServlet(name = "ppp",urlPatterns = "/4_6_DServlet")
public class DServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      System.out.println("通过注解配置访问的4_6_DServlet!");
      System.out.println("GET:" + request.getParameter("xxx"));
      System.out.println("GET:" + request.getParameter("yyy"));
  }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       req.setCharacterEncoding("utf-8");//防止页面中文乱码
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String[] hobby = req.getParameterValues("hobby");
        System.out.println(username + "," + password +"," + Arrays.toString(hobby));

        /*
        获取所有请求参数的名称
         */
        Enumeration names = req.getParameterNames();
        while (names.hasMoreElements()){
            System.out.println(names.nextElement());
        }
        /*
        获取所有请求参数 封装到MAP中
         */
        Map<String,String[]>  map = req.getParameterMap();
        for (String name : map.keySet()){
            String[] values = map.get(name);
            System.out.println(name + "=" + Arrays.toString(values) );
        }

    }
}
