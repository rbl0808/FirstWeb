
package ZXD_2018_4_7;


import cn.itcast.vcode.utils.VerifyCode;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;

@WebServlet(name = "www",urlPatterns = "/4_7_VerifyCodeServlet")
public class VerifyCodeServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        VerifyCode vc =new VerifyCode();
        BufferedImage image =  vc.getImage();
        request.getSession().setAttribute("session_vcode",vc.getText());
        VerifyCode.output(image,response.getOutputStream());
    }

}

