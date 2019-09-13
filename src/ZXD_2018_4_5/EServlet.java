package ZXD_2018_4_5;
//2018年4月5日18:28:26
import sun.misc.IOUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

public class EServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    /* String s = "Hello outputStream";
     byte[] bytes = s.getBytes();
     response.getOutputStream().write(bytes);
  */
/*
演示响应字节数据
 */
        String path = "C:\\Users\\84536\\Desktop\\study\\WebStudyPicture\\重定向原理.jpg";
        FileInputStream in = new FileInputStream(path);
        byte[] bytes = org.apache.commons.io.IOUtils.toByteArray(in);
        response.getOutputStream().write(bytes);

    }
}

