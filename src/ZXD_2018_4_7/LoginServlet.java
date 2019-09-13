package ZXD_2018_4_7;
//2018年4月7日18:25:12 + 2018年4月8日08:41:07
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "vvv",urlPatterns = "/4_7_LoginServlet")
public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       /*
       校验验证码
       从seesion中获取正确的验证码
       从表单中获取用户填写的验证码
       进行比较
       如果相同,向下运行，否则保存错误信息到request域中,转发到login.jsp
        */
       String sessionCode = (String)request.getSession().getAttribute("session_vcode");
       String loginCode = request.getParameter("Vcode");
        if(!loginCode.equals(sessionCode)){
            request.setAttribute("msg","验证码错误");
            RequestDispatcher rd = request.getRequestDispatcher("sessionTest/login.jsp");
            rd.forward(request,response);//转发
            return;
        }

        /*
        1.获取表单数据
        */
        //处理中文问题
        request.setCharacterEncoding("utf-8");
        //获取
        String usaername = request.getParameter("username");
        String password  = request.getParameter("password");
        /*
        2.校验用户名密码是否正确
         */
        if(!"ranbingluan".equals(usaername)){//如果名字不是ranbingluan,说明登陆成功
            /*
            如果成功
             保存用户信息到session中
             重定向到succ1.jsp
             */
            /*
            附加项,把用户名保存到cookie中发送给客户端浏览器
            下次登录时直接显示用户名
             */
            Cookie cookie = new Cookie("uname",usaername);
            cookie.setMaxAge(60*60*24*7);//设置cookie的生存时间
            //cookie.setMaxAge(0);
            response.addCookie(cookie);

            HttpSession session = request.getSession();//获取session
            session.setAttribute("username",usaername);//向session域中保存username
            response.sendRedirect("/sessionTest/succ1.jsp");
        }else {
        /*
        如果失败
        保存错误信息到request域中
        转发到login.jsp
         */
            request.setAttribute("msg","用户名密码错误,登录失败");
            RequestDispatcher rd = request.getRequestDispatcher("sessionTest/login.jsp");
            rd.forward(request,response);//转发
        }

    }

}
