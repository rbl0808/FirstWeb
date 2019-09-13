package ZXD_2018_4_18;
/*
s2018年4月19日00:30:07
下载
 */
import org.apache.commons.io.IOUtils;
import sun.misc.BASE64Encoder;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URLEncoder;

@WebServlet(name = "bbbb",urlPatterns ="/4_18_CServlet")
public class CServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
        两个头一个流
        流:源数据,要下载的
        Content-type
        Content-Disposition
         */
        String filename = "D:\\delelop\\神奇动物在哪里-英语4K(限免).qsv";
        //delelop%5C神奇动物在哪里-英语4K%28限免%29.qsv

        System.out.println(filename.substring(filename.indexOf("\\",4)+1));

        String framename = filenameEncoding(filename.substring(filename.indexOf("\\",4)+1),request);
        String contnentType = this.getServletContext().getMimeType(filename);
        String contentDisposition = "attachment;filename=" + framename;
        //一个流
        FileInputStream input = new FileInputStream(filename);
        //设置头
        response.setHeader("Content-type",contnentType);
        response.setHeader("Content-Disposition",contentDisposition);

        //获取绑定了响应端的流
        ServletOutputStream output = response.getOutputStream();
        IOUtils.copy(input,output);

        input.close();

    }

    // 用来对下载的文件名称进行编码的！
    public static String filenameEncoding(String filename, HttpServletRequest request) throws IOException {
        String agent = request.getHeader("User-Agent"); //获取浏览器
        if (agent.contains("Firefox")) {
            BASE64Encoder base64Encoder = new BASE64Encoder();
            filename = "=?utf-8?B?"
                    + base64Encoder.encode(filename.getBytes("utf-8"))
                    + "?=";
        } else if(agent.contains("MSIE")) {
            filename = URLEncoder.encode(filename, "utf-8");
        } else {
            filename = URLEncoder.encode(filename, "utf-8");
        }
        return filename;
    }
}
