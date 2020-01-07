package ZXD_2018_4_1;
//懒汉式  线程安全
public class Singleton3 {
    private Singleton3(){}
    private static Singleton3 instance = null;
    public static synchronized Singleton3 getInstance(){
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}
