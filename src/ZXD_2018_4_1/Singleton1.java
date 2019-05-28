package ZXD_2018_4_1;
//饿汉式
public class Singleton1 {
    private Singleton1(){}
    private static final Singleton1 instance = new Singleton1();
    public static Singleton1 getInstance(){
        return instance;
    }
}
