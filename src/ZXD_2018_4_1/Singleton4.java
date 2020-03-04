package ZXD_2018_4_1;
//双重校验锁  不推荐
public class Singleton4 {
    private Singleton4(){}
    private static volatile Singleton4 instance = null;
    public static  Singleton4 getInstance(){
        if(instance == null){
            synchronized (Singleton4.class){
                if (instance == null) {
                    instance = new Singleton4();
                }
                return instance;
            }
        }
        return instance;
    }
}
