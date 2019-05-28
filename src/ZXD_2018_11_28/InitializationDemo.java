package ZXD_2018_11_28;

/*
爷爷在静态代码块
爸爸在静态代码块
爸爸的岁数：25

1.不会出现  "儿子在静态代码块"
这是因为对于静态字段，只有直接定义这个字段的类才会被初始化（执行静态代码块）。
因此通过其子类来引用父类中定义的静态字段，只会触发父类的初始化而不会触发子类的初始化。


 */
class Grandpa
{
    static
    {
        System.out.println("爷爷在静态代码块");
    }
}
class Father extends Grandpa
{
    static
    {
        System.out.println("爸爸在静态代码块");
    }

    public static int factor = 25;

    public Father()
    {
        System.out.println("我是爸爸~");
    }
}
class Son extends Father
{
    static
    {
        System.out.println("儿子在静态代码块");
    }

    public Son()
    {
        System.out.println("我是儿子~");
    }
}
public class InitializationDemo
{
    public static void main(String[] args)
    {
        System.out.println("爸爸的岁数:" + Son.factor);  //入口
    }
}