package ZXD_2018_4_1;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTag;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.io.Writer;

public class TagTest2 extends SimpleTagSupport {
    @Override
    public void doTag() throws IOException, JspException {
        Writer out = this.getJspContext().getOut();
        out.write("****************<br/>");
        this.getJspBody().invoke(out);
        out.write("<br/>**************");
    }

    public static void main(String[] args) {
        String s1 = "a" + "b" + "c";
        String s2 = "abc";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}
