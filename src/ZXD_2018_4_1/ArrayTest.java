package ZXD_2018_4_1;


import org.junit.Test;

public class ArrayTest {
    @Test
    public void fun(){
        Integer[] s1 = {1, 16, 80, 200, 201};
        Integer[] s2 = {10, 32, 45, 79, 90, 100, 101};
        Integer[] s3 = new Integer[s1.length+s2.length];
        int i = 0;
        int b;
        for (;i<s1.length;i++){
            s3[i] = s1[i];
        }

        for (int m = 0;i<(s1.length+s2.length);i++,m++){
            s3[i] = s2[m];
        }

        System.out.println("排序前:" );
        for (int l = 0;l<s3.length;l++){
            System.out.print(s3[l] + ",");
         }

        for (int m = 0;m<s3.length;m++){
            for (int n = 0;n < s3.length;n++){
              /*  if (s3[m] > s3[n]){
                    b = s3[m];
                    s3[m] = s3[n];
                    s3[n] = b;
                }*/
              if (s3[m] <= s3[n]){
                  b = s3[m];
                  s3[m] = s3[n];
                  s3[n] = b;
              }
            }
        }

        System.out.println("排序后");
        for (int l = 0;l<s3.length;l++)
        System.out.print(s3[l] + ",");

    }

}
