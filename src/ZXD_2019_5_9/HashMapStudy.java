/**
 * FileName: HashMapStudy
 * Author: rbl
 * Date: 2019_5_9
 **/
package ZXD_2019_5_9;

import java.util.HashMap;
import java.util.Map;

public class HashMapStudy {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("a",2);
        map.put("b",2);

        String str1 = "hello";
        String str2 = "he" + new String("llo");
        System.out.println(str1 == str2);
        System.out.println(str1.intern() == str2.intern());

        int[] a = {1,2,34,5,3};
        System.out.println(a.length);

    }
}
