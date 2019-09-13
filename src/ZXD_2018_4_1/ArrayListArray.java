package ZXD_2018_4_1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListArray {
    public static void main(String[] args) {
        //创建一个100000的链表
        List al = new ArrayList();
        for (int i = 1; i < 100001; i++) {
            al.add(i);
        }
        //遍历List
        for(int i = 0;i < 100000;i++){
            int b = (int) al.get(i);
            if(b/10 == 0) continue;
            else if(b/10 != 0 && b / 100 == 0){
                //个位
                int l = b % 10;
                //十位
                int m = b / 10;
                if(m <= l) System.out.println(b);
            }else  if(b/10 != 0 && b / 100 != 0 && b / 1000 == 0){
                //个位
                int l = b % 10;
                //十位
                int m = b / 10 - (b / 100)*10;
                //百位
                int n = b / 100;
                if(m <= l && n <= m) System.out.println(b);
            }else if(b/10 != 0 && b / 100 != 0 && b / 1000 != 0 &&b / 10000 == 0 ){
                //个位
                int l = b % 10;
                //十位
                int m = b / 10 - (b/100)*10;
                //百位
                int n = b / 100 - (b/1000)*10;
                //千位
                int o = b / 1000;
                if(m <= l && n <= m && o <= n) System.out.println(b);
            }else if(b/10 != 0 && b / 100 != 0 && b / 1000 != 0 &&b / 10000 != 0 && b / 100000 == 0){
                //个位
                int l = b % 10;
                //十位
                int m = b / 10 - (b/100)*10;
                //百位
                int n = b / 100 - (b/1000)*10;
                //千位
                int o = b / 1000 - (b/10000)*10;
                //万位
                int p = b / 10000;
                if(m <= l && n <= m && o <= n && p <= o) System.out.println(b);
            }
        }
    }
}
