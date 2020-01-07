package ZXD_2018_4_1;

//用Java实现斐波那契数列(Fibonacci)
public class Fibonacci {

    public int f(int n) {//n代表第几个数字，程序返回它对应的值
        return n > 2 ? f(n - 1) + f(n - 2) : 1;//看似如此优雅的一句程序
    }

    //程序设计师的思维：会重构上面的代码，让他们更易读，推荐！！！
    public int fibo(final int pos) {
        final int num;
        if (pos > 2)
            num = fibo(pos - 1) + fibo(pos - 2);
        else
            num = 1;
        return num;
    }

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        System.out.println(f.f(8));//调用程序员写的方法输出21
        System.out.println(f.fibo(9));//调用程序设计师写的方法输出34
        //1 2 3 4 5 6 7  8....第几个
        //1 1 2 3 5 8 13 21...对应值
    }

}