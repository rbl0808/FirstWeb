package ZXD_2018_4_7;
//2018年4月7日15:24:14
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "uuu",urlPatterns = "/4_7_AServlet")
public class AServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取参数
        String s1 = request.getParameter("num1");
        String s2 = request.getParameter("num2");
        //转换成int类型
        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);
        int sum = num1 + num2;
        //把结果保存到request域中
        request.setAttribute("result",sum);
        //转发到result.jsp
        request.getRequestDispatcher("/jia/result.jsp").forward(request,response);

    }
}
