package ZXD_2018_4_1;
//改变字符串编码
import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

//2018年4月6日19:22:34
public class EncondingTest{
   public static void main(String[] args) throws UnsupportedEncodingException {
       String name = "张翔达";
       byte[] bytes = name.getBytes("utf-8");
       System.out.println(bytes);
       String s = URLEncoder.encode(name, "UTF-8");
       System.out.println(s);
   }
}
