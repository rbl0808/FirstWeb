package ZXD_2018_4_1;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

//2018年4月10日09:03:32
public class TagTest3 extends SimpleTagSupport{
    private boolean test;

    public void setTest(boolean test) {
        this.test = test;
    }

    @Override
    public void doTag() throws JspException, IOException {
        /*
        如果传递的输出流为null,
        表示使用的就是当前页的out 相当于this.gesJspContext.getout()
         */
       if(test) {
           this.getJspBody().invoke(null);
       }
    }
}
