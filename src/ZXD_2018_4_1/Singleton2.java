package ZXD_2018_4_1;
//懒汉式  线程不安全
public class Singleton2 {
    private Singleton2(){}
    private static  Singleton2 instance = null;
    public static Singleton2 getInstance(){
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
