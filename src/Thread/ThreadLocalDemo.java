package Thread;


import org.junit.Test;

public class ThreadLocalDemo {
    @Test
    public void fun1(){
        ThreadLocal<String> tl1 = new ThreadLocal<String>();
        ThreadLocal<Integer> tl2 = new ThreadLocal<Integer>();
        tl1.set("hello");//存
        tl1.set("我是第二次添加 my name is rbl");
        tl2.set(1);
        tl2.set(8);
        String s=tl1.get();//取
        int a = tl2.get();
        tl1.remove();//删
        tl2.remove();
        System.out.println("tl1中的值:" + s);
        System.out.println("tl2中的值:" + a);

    }

}
