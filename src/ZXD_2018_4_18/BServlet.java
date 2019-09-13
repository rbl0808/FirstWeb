package ZXD_2018_4_18;
/*
2018年4月19日00:29:52
上传Servlet
 */
import cn.itcast.commons.CommonUtils;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUpload;
import org.apache.commons.fileupload.FileUploadBase;
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

@WebServlet(name = "aaaa",urlPatterns = "/4_18_BServlet")
public class BServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        /*
        工厂
         */
        DiskFileItemFactory factory =new
                DiskFileItemFactory(20*1024,new File("D:\\delelop\\temp"));
        /*
        解析器
         */
        ServletFileUpload sfu = new ServletFileUpload(factory);
       // sfu.setFileSizeMax(100*1024);//限制单个文件大小为100k,必须写在解析器之前
        //sfu.setSizeMax(100*1024*1024);//限制整个表单的大小,
        try {
            List<FileItem> list= sfu.parseRequest(req);

            FileItem fi = list.get(1);


            /*
            1.得到文件保存路径
             */
            String root = this.getServletContext().getRealPath("/WEB-INF/keep");
            System.out.println(root);
            /*
            2.生成2级目录
                得到文件名称
                得到hashcode
                转成16进制
                获取前2个字符生成目录
             */
            String filename = fi.getName();
            /*
            处理文件名的绝对路径问题
             */
            int index =filename.lastIndexOf("\\");
            if(index != -1){//index=-1 说明带的是绝对路径
                filename= filename.substring(index+1);
            }
            /*
            给文件名添加uuid前缀,处理文件重名
             */
            String savename = CommonUtils.uuid() + "_" + filename;
            /*
            得到hashcode
             */
            int hCode = filename.hashCode();
            String hex = Integer.toHexString(hCode);
            /*
            获取hex的前两个字符,与root连接在一起,生成一个完整的路径
             */
            //File dirFile = new File(root,hex.charAt(0) + "/" + hex.charAt(1));
            File dirFile = new File(root,hex.charAt(0) + "/");
            /*
            创建目录连
             */
            dirFile.mkdirs();
            /*
            创建目录文件
             */
            File destFile = new File(dirFile,savename);
            /*
            保存
             */
            fi.write(destFile);
         /*   req.setAttribute("msg","文件上传成功!");
            req.setAttribute("address",root);
            req.getRequestDispatcher("/succ.jsp").forward(req,resp);*/
            req.getSession().setAttribute("msg","文件上传成功!");
            req.getSession().setAttribute("address",root);
            resp.sendRedirect("/succ.jsp");
        } catch (FileUploadException e) {
           if(e instanceof FileUploadBase.FileSizeLimitExceededException) {
               req.setAttribute("msg", "您上传的文件超出了100K");
                //转发
               req.getRequestDispatcher("/fileUpload/upload2.jsp").forward(req,resp);
           }
        } catch (Exception e) {
            throw new  RuntimeException(e);
        }
    }
}
