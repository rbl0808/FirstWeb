package ZXD_2018_4_10.web.servlet;

import ZXD_2018_4_10.domain.User;
import ZXD_2018_4_10.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
2018年4月10日10:15:24
在serlet中依赖service,然后通过service完成功能,
把结果保存到request中,转发到jsp显示
 */
@WebServlet(name = "xxx",urlPatterns = "/4_10_UserServlet")
public class UserServlet  extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserService userService =new UserService();
        User user = userService.find();
        req.setAttribute("user",user);
        req.getRequestDispatcher("/wan/show.jsp").forward(req,resp);
    }
}
