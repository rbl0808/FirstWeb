/**
 * FileName: Test
 * Author: rbl
 * Date:
 **/
package ZXD_2018_4_1;

import org.apache.poi.ss.formula.functions.T;

public class Test {
 public String resver(String a){
     if(a.length() == 0 || a.length() == 1)
         return a;
     return resver(a.substring(0,a.length()-1)) + a.substring(0);
 }

    public static void main(String[] args) {
        Test t = new Test();
        t.resver("abc");

        double a = 0.83;
        double b = 1.16;
        System.out.println(a + b);
    }
}
