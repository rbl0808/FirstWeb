package ZXD_2018_4_1;
//递归实现字符串反转
public class StringReversel {

    public static String reverse1(String originStr) {

       if(originStr == null || originStr.length() <= 1)
            return originStr;
        return reverse1(originStr.substring(1))+ originStr.charAt(0);
    }


    public static void main(String[] args){
        String a1="dasofisjkashaiuoajaafo";
        String a2 = reverse1(a1);
        String a3 = null;
        System.out.println(a3 != null && a3.trim().isEmpty());
        System.out.println("reverse1方法反转" + a2);
    }

}
