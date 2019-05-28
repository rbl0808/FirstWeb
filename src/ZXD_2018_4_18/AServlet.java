package ZXD_2018_4_18;
/*
2018年4月19日00:29:52
上传Servlet
 */
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "zzz",urlPatterns = "/4_18_AServlet")
public class AServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        DiskFileItemFactory factory =new DiskFileItemFactory();
        ServletFileUpload sfu = new ServletFileUpload(factory);

        try {
            List<FileItem> fileItemList= sfu.parseRequest(req);
            FileItem fi1 = fileItemList.get(0);
            FileItem fi2 = fileItemList.get(1);
            System.out.println("普通表单项演示:" + fi1.getFieldName()
            + "=" + fi1.getString("utf-8"));
            System.out.println("文件表单相演示:");
            System.out.println("Content-Type:" + fi2.getContentType());
            System.out.println("size:" + fi2.getSize());
            System.out.println("filename" + fi2.getName());
            //保存文件
            File destFile =new File("D:\\delelop\\code\\firstweb\\web\\WEB-INF\\keep\\fileUpload.jpg");
            fi2.write(destFile);

        } catch (FileUploadException e) {
            throw  new RuntimeException(e);
        } catch (Exception e) {
            throw new  RuntimeException(e);
        }
    }
}
