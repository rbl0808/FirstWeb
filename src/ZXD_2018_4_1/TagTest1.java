package ZXD_2018_4_1;
//2018年4月9日20:58:08
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class TagTest1 extends SimpleTagSupport{
    @Override
    public void doTag() throws JspException, IOException {
        this.getJspContext().getOut().print("hello,ranbingluan,我是你写的自定义Tag1!");
    }
}
